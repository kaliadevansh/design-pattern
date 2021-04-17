package pattern.strategy;

import pattern.strategy.behaviours.fly.FlyRocketPowered;
import pattern.strategy.duck.Duck;
import pattern.strategy.duck.MallardDuck;
import pattern.strategy.duck.ModelDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        System.out.println("Installing rocket");
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
