# 🌤️ WeatherApp

A live, responsive weather forecasting web application built with Spring Boot 3, Java 17, and Thymeleaf. The application integrates with the OpenWeatherMap REST API to fetch real-time atmospheric data, temperature, humidity, and weather conditions for searched cities worldwide.

---

##  Live Demo

- **Hosted URL**: [https://weather-app-livee.onrender.com](https://weather-app-livee.onrender.com)
> *Note: Hosted on Render's free tier. Initial page load may take 30–40 seconds if the instance is waking up from inactivity.*

---

## 🛠️ Tech Stack & Dependencies

- **Language**: Java 17
- **Framework**: Spring Boot 3.2.0
- **Templating Engine**: Thymeleaf
- **Web Client**: Spring Web (`RestTemplate`)
- **API**: OpenWeatherMap API
- **Containerization**: Docker
- **Hosting**: Render
- **Build Tool**: Apache Maven

---

## Project Structure

```
WeatherApp
├── src
│   └── main
│       ├── java/com/example/weatherapp
│       │   ├── controller
│       │   │   └── WeatherController.java    # Handles HTTP requests & web routing
│       │   ├── dto
│       │   │   ├── MainData.java            # Maps temperature & humidity JSON
│       │   │   └── WeatherResponse.java     # OpenWeatherMap API mapping
│       │   └── WeatherAppApplication.java   # Spring Boot entry point
│       └── resources
│           ├── templates
│           │   └── index.html               # Thymeleaf UI template
│           └── application.properties       # Spring app properties
├── Dockerfile                               # Multi-stage Docker build config
├── .gitignore                               # Specifies intentionally untracked files
└── pom.xml                                  # Maven dependencies & build configuration

```

---

## 💻 Local Setup & Execution

### Prerequisites

* **JDK 17** or higher installed
* **Maven 3.8+** installed
* An active **OpenWeatherMap API Key**

### Installation

1. **Clone the repository:**
```bash
git clone [https://github.com/YOUR_USERNAME/WeatherApp.git](https://github.com/YOUR_USERNAME/WeatherApp.git)
cd WeatherApp

```


2. **Configure API Key:**
In `src/main/resources/application.properties`, set your API key variable or supply it via environment variables:
```properties
api.key=YOUR_OPENWEATHERMAP_API_KEY

```


3. **Build the application:**
```bash
./mvnw clean package -DskipTests

```


4. **Run locally:**
```bash
./mvnw spring-boot:run

```


5. **Access the application:**
Open your web browser and navigate to `http://localhost:8080`.

---

## 🐳 Docker Containerization

To build and run the application locally inside a Docker container:

```bash
# Build the Docker image
docker build -t weather-app .

# Run the container mapping port 8080
docker run -p 8080:8080 -e OPENWEATHER_API_KEY=your_api_key weather-app

```

---

## 🌐 Deployment to Render

The project includes a multi-stage `Dockerfile` tailored for containerized cloud deployment:

1. Connect the GitHub repository to **Render**.
2. Create a new **Web Service** and set the runtime environment to **Docker**.
3. Add an Environment Variable in Render:
* **Key**: `OPENWEATHER_API_KEY`
* **Value**: `your_actual_api_key`


4. Deploy service.

```

```
