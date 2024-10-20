package com.lucasmoraist.clima_facil.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OpenWeatherResponse {

    private String name;
    private Coord coord;
    private Main main;
    private Wind wind;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Coord {
        private double lon;
        private double lat;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Main {
        private double temp;
        private double feels_like;
        private double temp_min;
        private double temp_max;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Wind {
        private double speed;
    }

}
