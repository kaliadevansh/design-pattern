package pattern.singleton.enumeration;

public class ChocolateBoilerClient {
    public static void main(String[] args) {
        ChocolateBoiler singletonBoiler = ChocolateBoiler.CHOCOLATE_BOILER_INSTANCE;
        singletonBoiler.fill();
        singletonBoiler.boil();
        singletonBoiler.drain();
    }
}
