package com.example.weather.config;


import com.example.weather.pageParser.PageParser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class additionalCFG {

    @Bean
    public PageParser pageParser(){
        return new PageParser();
    }


}
