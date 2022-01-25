package com.example.weather.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class contr {

    @RequestMapping("/")
    public String weather1(){
        return "redirect:/weather";
    }

}
