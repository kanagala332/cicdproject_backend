package com.example.weather_app;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // Replace WeatherAppApplication with the actual name of your main @SpringBootApplication class
        return application.sources(WeatherAppApplication.class);
    }
}
