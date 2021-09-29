package strategy_pattern.code.behavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("꽥! 꽥!!!");    
    }
    
}
