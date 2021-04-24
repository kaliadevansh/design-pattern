package pattern.singleton.enumeration;

/*
This implementation is preferred for default serialization and deserialization (1 extra class), and
for that reflection isn't a problem with Enums.
Enums having state and methods is still hard to swallow. I would rather not follow this implementation.
 */
public enum ChocolateBoiler {
    CHOCOLATE_BOILER_INSTANCE;

    private boolean empty;
    private boolean boiled;

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with milk and chocolate mixture
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public boolean isBoiled() {
        return this.boiled;
    }
}
