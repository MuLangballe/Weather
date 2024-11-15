package com.example.weather.controller;

import com.example.weather.dto.ChatRequest;
import com.example.weather.dto.ChatResponse;
import com.example.weather.dto.Choice;
import com.example.weather.dto.Message;
import com.example.weather.dto.Usage;
import com.example.weather.model.Forecast;
import com.example.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
public class WeatherController {

    @Value("${openai.api.key}")
    private String openapikey;

    private WeatherService weatherService;
    private final WebClient webClient;

    public WeatherController(WebClient.Builder webClientBuilder, WeatherService weatherService){
        this.weatherService = weatherService;
        this.webClient = webClientBuilder.baseUrl("https://api.openai.com/v1/chat/completions").build();
    }

    @GetMapping("/api/forecast/{city}")
    public Mono<Forecast> getWeatherForecast(@PathVariable String city) {
        return weatherService.getForecast(city);
    }

    @GetMapping("/api/clothing-recommendation/{city}")
    public Map<String, Object> getClothingRecommendation(@PathVariable String city) {
        // Retrieve the weather forecast
        Forecast forecast = weatherService.getForecast(city)
                .block();

        if (forecast == null || forecast.getData().isEmpty()) {
            throw new RuntimeException("No forecast data available for the city: " + city);
        }

        // Extract weather details from the forecast
        String weatherDescription = forecast.getData().get(0).getWeather().getDescription();
        double temperature = forecast.getData().get(0).getTemp();

        // Create a request for OpenAI
        ChatRequest chatRequest = new ChatRequest();
        chatRequest.setModel("gpt-3.5-turbo");
        List<Message> messages = new ArrayList<>();
        messages.add(new Message("system", "You are a helpful assistant."));
        messages.add(new Message("user", "The weather is described as: " + weatherDescription +
                " with a temperature of " + temperature + "°C. What clothing would you recommend?"));
        chatRequest.setMessages(messages);
        chatRequest.setN(1);
        chatRequest.setTemperature(1);
        chatRequest.setMaxTokens(50);
        chatRequest.setStream(false);

        // Call OpenAI API for clothing suggestions
        ChatResponse response = webClient.post()
                .contentType(MediaType.APPLICATION_JSON)
                .headers(h -> h.setBearerAuth(openapikey))
                .bodyValue(chatRequest)
                .retrieve()
                .bodyToMono(ChatResponse.class)
                .block();

        if (response == null || response.getChoices().isEmpty()) {
            throw new RuntimeException("No response from OpenAI API.");
        }

        // Extract the recommendation from response
        String clothingRecommendation = response.getChoices().get(0).getMessage().getContent();

        // Prepare and return the result
        Map<String, Object> result = new HashMap<>();
        result.put("city", city);
        result.put("weather", weatherDescription);
        result.put("temperature", temperature);
        result.put("recommendation", clothingRecommendation);

        return result;
    }

    @GetMapping("/chat")
    public Map<String, Object> chatWithGPT(@RequestParam String message) {
        ChatRequest chatRequest = new ChatRequest(); //ChatRequest objekt har jeg dannet med https://www.jsonschema2pojo.or g/ værktøj
        chatRequest.setModel("gpt-3.5-turbo"); //vælg rigtig model. se powerpoint
        List<Message> lstMessages = new ArrayList<>(); //en liste af messages med roller
        lstMessages.add(new Message("system", "You are a helpful assistant."));
        lstMessages.add(new Message("user", "Where is " + message));
        chatRequest.setMessages(lstMessages);
        chatRequest.setN(3); //n er antal svar fra chatgpt
        chatRequest.setTemperature(1); //jo højere jo mere fantasifuldt svar (se powerpoint)
        chatRequest.setMaxTokens(50); //længde af svar
        chatRequest.setStream(false); //stream = true, er for viderekomne, der kommer flere svar asynkront
        chatRequest.setPresencePenalty(1); //noget med ikke at gentage sig. se powerpoint

        ChatResponse response = webClient.post()
                .contentType(MediaType.APPLICATION_JSON)
                .headers(h -> h.setBearerAuth(openapikey))
                .bodyValue(chatRequest)
                .retrieve()
                .bodyToMono(ChatResponse.class)
                .block();

        List<Choice> lst = response.getChoices();
        Usage usg = response.getUsage();

        Map<String, Object> map = new HashMap<>();
        map.put("Usage", usg);
        map.put("Choices", lst);

        return map;
    }
}
