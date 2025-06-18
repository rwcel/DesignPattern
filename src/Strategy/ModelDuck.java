package Strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay(); // 날 수 없는 행동
        quackBehavior = new Quack(); // 꽥꽥 소리
    }

    @Override
    public void display() {
        System.out.println("모형 오리");
    }
    
}
