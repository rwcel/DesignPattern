# 옵저버패턴

**[2주차]**
옵저버패턴 : 객체의 상태가 그 객체에 의존하는 데이터들이 자동으로 갱신되는 패턴

## 사용 목적
1. 의존성이 크면 코드 변경 시 불편함이 많다. (상호 의존성 최소화)

## 디자인 원칙
- 상호작용하는 객체 사이에서는 가능하면 느슨한 결합을 (Loose Coupling) 사용해야 한다.

## 코드 의미 
- Subject [interface] : 옵저버를 등록, 해제, 알림하는 
	- WeatherData : 날씨 데이터 세팅, 갱신처리
- Observer [interface] : 갱신 요청 시 실행
- DisplayElement [interface] : Update 시 출력
	- CurrentConditionsDisplay : 
	- StatisticsDisplay	 : 평균 온도 측정
	- ForecastDisplay : 기압 측정
- WeatherStation : Main (옵저버 등록 후 데이터 출력)
