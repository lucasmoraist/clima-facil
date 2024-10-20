package com.lucasmoraist.clima_facil.repository;

import com.lucasmoraist.clima_facil.model.OpenWeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@FeignClient(name = "weather", url = "https://api.openweathermap.org/data/2.5")
public interface OpenWeatherClient {

        @GetMapping("/weather")
        OpenWeatherResponse getWeatherByCityName(
                @RequestParam("q") String city,
                @RequestParam("appid") String apiKey

        );
}
