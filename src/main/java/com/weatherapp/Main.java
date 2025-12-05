package com.weatherapp;

/**
 * Entry point for the Weather Application.
 * <p>
 * This class handles the user input via CLI and orchestrates the flow
 * between the WeatherService and the user.
 * </p>
 */

import java.io.IOException;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherService weatherService = new WeatherService();
        
        logger.info("Weather Application has started successfully.");

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
