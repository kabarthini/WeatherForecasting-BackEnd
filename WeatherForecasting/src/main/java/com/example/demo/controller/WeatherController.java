package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Weather;
import com.example.demo.service.WeatherService;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class WeatherController {
	@Autowired
	private WeatherService weatherService;

	@GetMapping("/getweather")
	public List<Weather> getWeatherDetails() {
		return weatherService.getWeather();
	}

	@PostMapping("/postweather")
	public String postContactDetails(@RequestBody Weather weather) {
		weatherService.saveWeather(weather);
		return ("Sucessfully saved");
	}

	@PutMapping("/putweather")
	public String updateWeatherDetails(@RequestBody Weather weather, @RequestParam int weatherId) {
		weather.setWeatherId(weatherId);
		weatherService.updateWeather(weather);
		return ("Successfully Updated");
	}

	@DeleteMapping("/deleteweather")
	public String deleteWeatherDetails(@RequestParam int weatherId) {
		weatherService.deleteWeather(weatherId);
		return ("Successfully Deleted");
	}
}
