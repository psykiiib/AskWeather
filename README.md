# AskWeather
---
---
## Description
This is a simple Java-based weather app that fetches current weather data of the specified city from the OpenWeatherMap API.

## Features
- Get the current temperature for a specified city.

## Setup

**1. Clone the repository:**
    ```bash
    git clone https://github.com/psykiiib/AskWeather.git
    cd AskWeather
    ```

**2. Add your OpenWeatherMap API key in** `WeatherService.java`.

    ```bash
    private final String apiKey = "YOUR_API_KEY"; // Replace this with your API key
    ```


**3. Build the project:**
    ```bash
    mvn clean install
    ```
This command will:

- Clean any previous builds

- Install all required dependencies (OkHttp, Jackson, etc.)

- Compile the project


**4. Run the application:**
    ```bash
    mvn exec:java
    ```

**5. Enter the name of the city when prompted.**

```
Enter the city for weather information:
Paris
Weather in Paris: 15.92°C
```

## Future Features
- Support for multiple cities.
- Hourly weather forecast.
- Visual front-end interface (GUI or Web).

