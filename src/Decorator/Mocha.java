package Decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    /*
     * 기존 음료의 가격에 모카의 가격 더하기
     */
    @Override
    public double cost() {
        return beverage.cost() + 300;
    }
    
}
