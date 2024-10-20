package com.lucasmoraist.clima_facil.service;

import com.lucasmoraist.clima_facil.model.WeatherResponse;
import com.lucasmoraist.clima_facil.repository.OpenWeatherClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private OpenWeatherClient client;

    @Value("${open-weather.api.key}")
    private String apiKey;

    public WeatherResponse getWeather(String city) {
        var response = this.client.getWeatherByCityName(city, apiKey);
        System.out.println(response);
        return new WeatherResponse(
                response.getName(),
                this.kelvinToCelsius(response.getMain().getTemp()),
                this.kelvinToCelsius(response.getMain().getFeels_like()),
                this.kelvinToCelsius(response.getMain().getTemp_min()),
                this.kelvinToCelsius(response.getMain().getTemp_max()),
                response.getWind().getSpeed());
    }

    private double kelvinToCelsius(double kelvin) {
        return Math.floor(kelvin - 273.15);
    }
}
