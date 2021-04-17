package pattern.strategy;

import pattern.strategy.behaviours.quack.Quack;
import pattern.strategy.behaviours.quack.QuackBehaviour;

public class DuckCall {
    QuackBehaviour quackBehaviour;

    public DuckCall() {
        this.quackBehaviour = new Quack();
    }

    public void makeDuckCall() {
        quackBehaviour.quack();
    }
}
