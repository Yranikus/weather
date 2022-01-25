package com.example.weather.Entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "weather_history")
public class WeatherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String temp;

    public WeatherEntity() {
    }

    public WeatherEntity(Date date, String temp) {
        this.date = date;
        this.temp = temp;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
