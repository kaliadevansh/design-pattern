package pattern.strategy.behaviours.quack;

public class Mute implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< Silence >>̥");
    }
}
