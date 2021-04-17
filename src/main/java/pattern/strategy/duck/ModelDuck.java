package pattern.strategy.duck;

import pattern.strategy.behaviours.fly.FlyNoWay;
import pattern.strategy.behaviours.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("You see a model duck.");
    }
}
