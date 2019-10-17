package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bean.MyCity;

//@Repository
public interface CityWeatherDao extends JpaRepository<MyCity, Integer> {

}
