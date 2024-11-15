package com.example.weather.service;

import com.example.weather.model.Forecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class WeatherService {

        private static final String API_KEY = System.getenv("APIKEY");

        private final WebClient webClient;

        @Autowired
        public WeatherService(WebClient.Builder webClientBuilder) {
            this.webClient = webClientBuilder.baseUrl("https://api.weatherbit.io/v2.0").build();
        }

        public Mono<Forecast> getForecast(String city) {
            return webClient.get()
                    .uri(uriBuilder -> uriBuilder
                            .path("/forecast/daily")
                            .queryParam("city", city)
                            .queryParam("key", API_KEY)
                            .queryParam("days", 3)  // Example to get 3 days forecast
                            .build())
                    .retrieve()
                    .bodyToMono(Forecast.class);
        }

}
