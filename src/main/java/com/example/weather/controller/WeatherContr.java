package com.example.weather.controller;


import com.example.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class WeatherContr {

    @Autowired
    private WeatherService weatherService;


    @RequestMapping("/weather")
    public String weather(){
        String temp = weatherService.weatherNow();
        return "Сегодня на улице " + temp;
    }

}
