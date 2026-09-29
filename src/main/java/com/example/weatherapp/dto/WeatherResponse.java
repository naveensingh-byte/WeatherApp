package com.example.weatherapp.dto;

public class WeatherResponse {
    private String name;
    private MainData main;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MainData getMain() {
        return main;
    }

    public void setMain(MainData main) {
        this.main = main;
    }
}