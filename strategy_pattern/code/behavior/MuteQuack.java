package strategy_pattern.code.behavior;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("..........");        
    }
    
}
