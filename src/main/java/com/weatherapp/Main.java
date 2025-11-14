package com.weatherapp;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherService weatherService = new WeatherService();

        System.out.println("Enter the city for weather information: ");
        String city = scanner.nextLine();

        try {
            String weatherInfo = weatherService.getWeather(city);
            System.out.println(weatherInfo);
        } catch (IOException e) {
            System.out.println("Error retrieving weather data: " + e.getMessage());
        }
    }
}
