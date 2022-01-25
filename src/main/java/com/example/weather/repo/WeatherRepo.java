package com.example.weather.repo;


import com.example.weather.Entity.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface WeatherRepo extends JpaRepository<WeatherEntity, Long> {

    boolean existsByDate(Date date);
    WeatherEntity findByDate(Date date);



}
