# 데코레이터 패턴

**[3주차]**
데코레이터패턴 : 객체에 데코레이터를 동적으로 감싸서 행동 위임이나 추가 작업 수행이 가능

## 사용 목적
1. 기존 객체의 구조(코드)를 변경하지 않고, 동적으로 새로운 기능(행동, 효과 등)을 조합해서 추가하기 위해

## 디자인 원칙
- 클래스는 확장에는 열려 있어야 하지만, 변경에는 닫혀 있어야 한다.

## 코드 의미 
- Beverage [abstract] : 커피 사이즈나 가격에 대한 구성
	- Espresso : 커피 베이스 이름, 가격
	- DarkRoast
	- Decaf 
	- HouseBlend
	- CondimentDecorator [abstract] : 첨가물 추가 가격 구성
		- Mocha : 첨가물은 기존 가격에 더해서 가격을 생성
		- Soy : 사이즈에 따라 첨가물 비용이 다름
		- Milk
		- Whip

- CoffeeShop : Main