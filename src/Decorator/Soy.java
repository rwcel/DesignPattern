package Decorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    /*
     * 기존 음료의 가격에 두유의 가격 더하기
     * 두유는 사이즈에 따라 가격이 다름
     */
    @Override
    public double cost() {
        var cost = beverage.cost();
        if (getSize() == Size.TALL) {
            cost += 300;
        } else if (getSize() == Size.GRANDE) {
            cost += 500;
        } else if (getSize() == Size.VENTI) {
            cost += 700;
        }
        return cost;
    }
    
}
