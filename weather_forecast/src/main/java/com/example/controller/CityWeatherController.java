package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.MyCity;
import com.example.dao.CityWeatherDao;
import com.example.service.CityWeatherService;

@RestController
@RequestMapping("/weatherforecast")
public class CityWeatherController {

	@Autowired
	private CityWeatherDao cityWeatherDao;

	@Autowired
	private CityWeatherService cityWeatherService;

	@RequestMapping("/getallcities")
	public List<MyCity> getAllCities() {
		System.out.println("getAllCities--->>>");
		return cityWeatherService.getAllCities();
	}

}
