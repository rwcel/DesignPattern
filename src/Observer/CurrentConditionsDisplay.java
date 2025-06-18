package Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    /* 생성 시 Subject를 받아와서 Observer 등록 
     * 나중에 해제 시 필요하기에 weatherData를 멤버 변수로 저장
    */
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);  // 현재 조건 디스플레이를 옵저버로 등록
    }

    @Override
    public void display() {
        System.out.println("[현재상태] 온도 : " + temperature + "°C / 습도 : " + humidity + "%");
    }

    @Override
    public void update() {
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        display();
    }

    
}
