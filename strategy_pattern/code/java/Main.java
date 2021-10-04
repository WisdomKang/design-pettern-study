package strategy_pattern.code.java;

import strategy_pattern.code.java.behavior.FlyNoWay;
import strategy_pattern.code.java.behavior.MuteQuack;
import strategy_pattern.code.java.duck.Duck;
import strategy_pattern.code.java.duck.ModelDuck;

public class Main{
    public static void main(String[] args) {
        Duck duck = new ModelDuck();

        duck.display();

        //이제 여기만 다른 행동 클래스로 바꾸면 아래의 움직임이 바뀌게 되죠.
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new MuteQuack());

        //위에 행동만 바꾸면 되기때문에 여기는 바꿀 필요가 없죠.
        duck.performQuack();
        duck.performFly();
    }
}