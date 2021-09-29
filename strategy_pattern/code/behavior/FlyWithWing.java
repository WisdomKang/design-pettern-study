package strategy_pattern.code.behavior;

public class FlyWithWing implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("오리가 날개로 하늘을 날았습니다.");    
    }
    
}
