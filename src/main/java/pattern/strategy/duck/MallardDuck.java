package pattern.strategy.duck;

import pattern.strategy.behaviours.fly.FlyWithWings;
import pattern.strategy.behaviours.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        this.flyBehaviour = new FlyWithWings();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("You see a mallard duck.");
    }
}
