package Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = -200.0f;       // 최대 온도
    private float minTemp = 200.0f;        // 최저 온도
    private float tempSum = 0.0f;       // 온도 합계
    private int numReadings;            // 측정된 온도 개수
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        var temperature = weatherData.getTemperature(); // WeatherData에서 온도 가져오기
        tempSum += temperature;
        numReadings++;

        temperature = Clamp(temperature, minTemp, maxTemp); // 온도 범위 제한
        display();
    }

    private float Clamp(float value, float min, float max) {
        if (value < min) {
            return min;
        } else if (value > max) {
            return max;
        }
        return value;
    }

    @Override
    public void display() {
        System.out.println("* 평균 기온 : " + (tempSum / numReadings) + "/ 최고 기온 : " + maxTemp + "/ 최저 기온 : " + minTemp);
    }
    
}
