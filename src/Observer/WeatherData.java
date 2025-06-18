package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;       // 등록된 옵저버 목록
    private float temperature;      // 온도
    private float humidity;         // 습도
    private float pressure;         // 기압

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    /* 옵저버 등록 */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /* 옵저버 삭제 */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /* 날씨 정보 변경 시 값 갱신 요청 */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            // observer.update(temperature, humidity, pressure);
            observer.update();
        }
    }

    /* 날씨 정보 갱신 */
    public void measurementsChanged() {
        notifyObservers();  
    }

    /* 날씨 데이터 세팅 */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();  // 날씨 정보가 변경되었음을 알림
    }

    // 기타 메소드
}
