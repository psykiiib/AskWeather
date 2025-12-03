# AskWeather
---
---
## Description
This is a simple Java-based weather app that fetches current weather data of the specified city from the OpenWeatherMap API.

## Features
- Get the current temperature for a specified city.

---

## Requirements

Before running the project, ensure you have:

**1. Java Development Kit (JDK) 17 or later**

*Check installation:*
```bash
java -version
```
**2. Apache Maven**

*Check if Maven is installed:*
```bash
mvn -version
```

#### If Maven is NOT installed, follow the steps below:
- **For on Windows**

1. Download Maven from the official website (Binary ZIP): https://maven.apache.org/download.cgi

2. Extract the ZIP (e.g., to C:\maven).

3. Add Maven to the PATH:

    - Search: Edit the system environment variables

    - Open Environment Variables

    - Under System Variables, edit **Path**

    - Add the path to:
        ```
        C:\maven\apache-maven-<version>\bin
        ```

4. Verify:

```bash
mvn -version
```
- **For macOS (using Homebrew)**

```bash
brew install maven
```

- **Install Maven on Linux (Debian/Ubuntu)**

```bash
sudo apt update
sudo apt install maven
```



## Setup

**1. Clone the repository:**

```bash
git clone https://github.com/psykiiib/AskWeather.git
cd AskWeather
```

**2. Add your OpenWeatherMap API key in** `WeatherService.java`.

```sh
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

```bash
Enter the city for weather information:
Paris
Weather in Paris: 15.92°C
```

---

## Development & Quality Assurance

This project uses standard industry tooling to ensure code quality and stability.

**1. Static Code Analysis**
We use the *Maven Checkstyle Plugin* to enforce coding standards and prevent style errors.
- See `checkstyle.xml` in the root directory.

**How to run analysis:**
```bash
mvn checkstyle:check
```

**2. Automation**
We use *pre-commit* to automatically check code quality before git allows a commit.

- See `.pre-commit-config.yaml` in the root directory.

**How to install:**

```bash
pip install pre-commit //Install the tool, requires Python)
pre-commit install // Install the git hook
```

**3. Testing**
- Unit Tests: We use *JUnit 5* for testing. 

**Run tests using:**
```bash
mvn test
```

**4.Logging**

Relevant logging is implemented using *SLF4J & Logback* to track application flow and errors (instead of `System.out.println`). 
- Logs are output to the console.




## Future Features
- Support for multiple cities.
- Hourly weather forecast.
- Visual front-end interface (GUI or Web).

