package pattern.strategy.duck;

import lombok.NoArgsConstructor;
import lombok.Setter;
import pattern.strategy.behaviours.fly.FlyBehaviour;
import pattern.strategy.behaviours.quack.QuackBehaviour;

@NoArgsConstructor
public abstract class Duck {
    @Setter
    FlyBehaviour flyBehaviour;
    @Setter
    QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
