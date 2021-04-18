package pattern.decorator.condiment;

import pattern.decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}
