package strategy_pattern.code.java.behavior;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("..........");        
    }
    
}
