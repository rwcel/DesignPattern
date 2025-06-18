package Observer;

public class WeatherStation {
    
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // 생성자 만들면 자동으로 옵저버 등록
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(30.0f, 65.0f, 30.4f);
        weatherData.setMeasurements(28.0f, 70.0f, 29.2f);
        weatherData.setMeasurements(26.0f, 90.0f, 29);
    }
}
