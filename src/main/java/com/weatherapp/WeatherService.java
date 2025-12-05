package com.weatherapp;

/**
 * Service class responsible for fetching weather data from external APIs.
 * <p>
 * This class handles the HTTP connections and parses the JSON responses
 * into domain objects.
 * </p>
 */

import com.weatherapp.models.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class WeatherService {

    /**
     * The API key for accessing OpenWeatherMap.
     * Note: This should be replaced with a valid key for production use.
     */
    private final String apiKey = "YOUR_API_KEY"; // Replace this with your API key 

    private OkHttpClient client = new OkHttpClient(); 


    public void setHttpClient(OkHttpClient client) {
        this.client = client;
    }


    /**
     * Retrieves the current weather information for a specific city.
     *
     * @param city the name of the city to fetch weather for (e.g., "Paris", "Saint-Etienne", "London")
     * @return a formatted String containing the city name and temperature in Celsius,
     * or an error message if the data could not be retrieved
     * @throws IOException if there is a network error or the API is unreachable
     */
    public String getWeather(String city) throws IOException {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        Request request = new Request.Builder().url(url).build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {

                ObjectMapper mapper = new ObjectMapper();
                WeatherResponse weatherResponse = mapper.readValue(response.body().string(), WeatherResponse.class);
                

                double temperature = weatherResponse.getMain().getTemp();
                return "Weather in " + city + ": " + temperature + "°C"; 
            } else {
                return "Failed to retrieve weather data.";
            }
        }
    }
}
