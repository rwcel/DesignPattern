# 전략패턴

**[1주차]**
전략패턴 : 알고리즘군을 캡슐화해서 수정해서 쓸 수 있게 하는 패턴

## 사용 목적
1. 상속 구조에서 행동을 하지 않는 경우에도 오버라이드를 해야함
2. 인터페이스 구조에서는 코드 중복이 발생

## 디자인 원칙
- 애플리케이션에서 달라지는 부분을 찾아내고, 달라지지 않는 부분과 분리한다. (캡슐화)
- 구현보다는 인터페이스에 맞춰서 프로그래밍한다. (상위 형식에 맞춰 프로그래밍한다)
- 상속보다는 구성을 활용한다.

## 코드 의미 
- Duck : 각 행동 호출부
  - MallardDuck
  - ModelDuck
- FlyBehavior : 나는 행동
  - FlyWithWings
  - FlyNoWay
  - FlyRocketPowered
- QuackBehavior : 꽥꽥거리는 행동
  - Quack
  - Squeak
  - MuteQuack
- MainDuckSimulator : Main
