package com.weatherapp;

import com.weatherapp.models.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class WeatherService {
    private final String apiKey = "YOUR_API_KEY"; // Replace this with your API key 

    private OkHttpClient client = new OkHttpClient(); 


    public void setHttpClient(OkHttpClient client) {
        this.client = client;
    }


    public String getWeather(String city) throws IOException {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        Request request = new Request.Builder().url(url).build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful()) {
                // Parse the JSON response
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
