package com.example.weather.service;

import com.example.weather.model.Forecast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {

        @Value("${weather.api.key}")
        private String apiKey;

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
                            .queryParam("key", apiKey)
                            .queryParam("days", 1)
                            .build())
                    .retrieve()
                    .bodyToMono(Forecast.class);
        }

}
