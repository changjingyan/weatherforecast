package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.MyCity;
import com.example.dao.CityWeatherDao;

@Service
public class CityWeatherService {

	@Autowired
	private CityWeatherDao cityWeatherDao;

	public List<MyCity> getAllCities() {
		return this.cityWeatherDao.findAll();
	}

}
