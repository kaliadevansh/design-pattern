package pattern.strategy.behaviours.fly;

public class FlyRocketPowered implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket. My wings are tied.");
    }
}