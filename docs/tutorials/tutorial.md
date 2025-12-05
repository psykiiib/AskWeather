# Tutorial: Getting Started with AskWeather

This guide walks you through the complete process of setting up, building, and running the **AskWeather** application on your local machine.

---

### Prerequisites

Before we begin, we must verify your development environment. This project relies on **Java** and **Maven**.

**1. Verify Java**
AskWeather requires **JDK 17** or later. Open your terminal and run:

```bash
java -version
```
If the output shows version 17 (or higher), you are ready.

**2. Verify Maven**
We use Apache Maven to manage dependencies and build the project.

```bash
mvn -version
```
If you do not see a version number, please refer to the "Requirements" section in the main README for installation instructions for Windows, macOS, or Linux.


---

### Installation & Configuration

**Step 1: Get the Code**

First, download the project to your local machine:

```bash
git clone https://github.com/psykiiib/AskWeather.git
cd AskWeather
```

**Step 2: Configure the API Key *(Crucial Step)***

- The application requires an OpenWeatherMap API key to fetch real data.

- Open the file src/main/java/com/weatherapp/WeatherService.java.

- Locate the apiKey variable at the top of the class.

- Replace the placeholder with your actual key:

```bash
// BEFORE
private final String apiKey = "YOUR_API_KEY";

// AFTER (Example)
private final String apiKey = "94be10cd2a1552351be86538e79fca75";

```
- Save the file.



**Step 3: Build the Project**

- Now that the configuration is set, we need to download the dependencies (like OkHttp and Jackson) and compile the code.

Run this command in the project root:

```bash
mvn clean install
```

*Success Indicator: You should see a "**BUILD SUCCESS**" message at the end.*

**Step 4: Run the Application**

Start the interactive mode:

```bash
mvn exec:java
```

**Step 5: Fetch Weather Data**

- Once the application is running, you will be prompted to enter a city name.

Example Interaction:

```bash
Enter the city for weather information:
> Paris
Weather in Paris: 5.92°C
```

---

### Troubleshooting
- "**Failed to retrieve weather data**": Check that your API Key in WeatherService.java is correct and active.

- "**mvn command not found**": Ensure Maven is added to your system PATH (see [README](../../README.md)). 