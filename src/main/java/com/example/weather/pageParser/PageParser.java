package com.example.weather.pageParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class PageParser {


    public String URLReader()  {

        String value = "";

        try {
            URLConnection connection =  new URL("https://yandex.ru").openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            String[] sin = content.split("weather__temp");
            value = String.valueOf(sin[1].charAt(2));
            value += String.valueOf(sin[1].charAt(3));
        }catch ( Exception ex ) {
            ex.printStackTrace();
        }

        return value;
    }


}
