package com.lucasmoraist.clima_facil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClimaFacilApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClimaFacilApplication.class, args);
	}

}
