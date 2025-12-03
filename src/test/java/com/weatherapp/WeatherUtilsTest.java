package com.weatherapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class WeatherUtilsTest {

    @Test
    void testIsFreezingTrue() {
        assertTrue(WeatherUtils.isFreezing(-5.0), "Temperature of -5 should be freezing");
    }

    @Test
    void testIsFreezingFalse() {
        assertFalse(WeatherUtils.isFreezing(20.0), "Temperature of 20 should NOT be freezing");
    }
}