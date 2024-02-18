package com.springboot.Service;	
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.Model.Weather;
import com.springboot.Model.WeatherResponse;

	@Service
	public class WeatherService {

	    private String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}";
	    private String apiKey = "4d7284dcb1edd11915df5a025c400f91";

	    public Weather getWeatherForCity(String city) {
	        RestTemplate restTemplate = new RestTemplate();
	        String url = apiUrl.replace("{city}", city).replace("{apiKey}", apiKey);
	        WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);

	        if (response != null) {
	        	System.out.println("Body is :>>>>>>>>>>>>>>>>>>>>"+response.getTimezone()+" and "+response.getName()+response.getVisibility()
	        	+response.getClouds()+response.getWind());
	            return new Weather(response.getMain().getTemp(), response.getWeather().get(0).getDescription());
	        } else {
	            throw new RuntimeException("Weather data not available for city: " + city);
	        }
	    }
	}

