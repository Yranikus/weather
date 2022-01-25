package com.example.weather.service;


import com.example.weather.Entity.WeatherEntity;
import com.example.weather.pageParser.PageParser;
import com.example.weather.repo.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Service
public class WeatherService {

    @Autowired
    private WeatherRepo weatherRepo;

    @Autowired
    private PageParser pageParser;


    @Transactional
    public String weatherNow(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        if (weatherRepo.findByDate(date) != null){
            return weatherRepo.findByDate(date).getTemp();
        }
        WeatherEntity weatherEntity = new WeatherEntity(date, pageParser.URLReader());
        weatherRepo.saveAndFlush(weatherEntity);
        return weatherEntity.getTemp();
    }


}
