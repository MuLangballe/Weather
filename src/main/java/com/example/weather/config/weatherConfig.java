package com.example.weather.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class weatherConfig {

    private static final String BASE_URL = "https://weatherapi-com.p.rapidapi.com";
    private static final String API_KEY = "a08b22556bmsh7a75d778e91f246p1cbbc5jsn3d8f0a873722";

    @Bean
    public WebClient weatherApiClient() {
        return WebClient.builder()
                .baseUrl(BASE_URL)
                .defaultHeader("X-RapidAPI-Key", API_KEY)
                .defaultHeader("X-RapidAPI-Host", "weatherapi-com.p.rapidapi.com")
                .build();
    }

}
