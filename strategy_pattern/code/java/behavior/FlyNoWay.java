package strategy_pattern.code.java.behavior;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("날지 못합니다.");        
    }
    
}
