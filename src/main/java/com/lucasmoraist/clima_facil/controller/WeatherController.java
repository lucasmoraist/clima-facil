package com.lucasmoraist.clima_facil.controller;

import com.lucasmoraist.clima_facil.model.WeatherResponse;
import com.lucasmoraist.clima_facil.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService service;
    private WeatherResponse lastWeather;

    @GetMapping("/weather")
    public String getWeather(Model model) {
        model.addAttribute(
                "weather",
                Objects.requireNonNullElse(lastWeather, "Ainda não há informações de clima"));
        return "weather";
    }

    @PostMapping("/weather/add")
    public String addWeatherView(@RequestParam String cityName, Model model) {
        lastWeather = this.service.getWeather(cityName);

        model.addAttribute("weather", lastWeather);

        return "weather";
    }

}
