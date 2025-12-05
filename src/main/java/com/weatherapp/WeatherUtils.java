package com.weatherapp;

/**
 * Utility class for weather calculations.
 * <p>
 * This class provides static methods to convert temperatures and check weather conditions
 * based on numeric inputs. It is designed to be a helper for the main WeatherService.
 * </p>
 *
 * @author Shahariar
 * @version 1.0
 */

public class WeatherUtils {

    /**
     * Checks if a given temperature in Celsius is below freezing.
     *
     * @param tempInCelsius the temperature to check in degrees Celsius
     * @return true if the temperature is below 0.0, if not its false
     */

    public static boolean isFreezing(double tempInCelsius) {
        return tempInCelsius < 0;
    }
}