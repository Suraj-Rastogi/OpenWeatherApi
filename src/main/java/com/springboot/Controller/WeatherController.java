package com.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Model.Weather;
import com.springboot.Service.WeatherService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class WeatherController {
//test feature1git  new feature is added for changes
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public Weather getWeatherForCity(@RequestParam("city") String city) {
        return weatherService.getWeatherForCity(city);
    }
}
