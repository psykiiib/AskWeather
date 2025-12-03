package com.weatherapp;

public class WeatherUtils {

    public static boolean isFreezing(double tempInCelsius) {
        return tempInCelsius < 0;
    }
}