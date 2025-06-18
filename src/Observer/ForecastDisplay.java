package Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;     // 디폴트 기압
    private float lastPressure;         // 이전 기압

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        String forecast;
        if (currentPressure > lastPressure) {
            forecast = "날씨가 좋아졌습니다.";
        } else if (currentPressure == lastPressure) {
            forecast = "어제와 비슷한 날씨입니다.";
        } else {
            forecast = "날씨가 나빠질 것 같습니다.";
        }
        System.out.println("* 날씨예보 : " + forecast);
    }
    
}
