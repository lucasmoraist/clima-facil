package com.lucasmoraist.clima_facil.model;

public record WeatherResponse(
        String name,
        double temp,
        double feelsLike,
        double tempMin,
        double tempMax,
        double windSpeed
) {
}
