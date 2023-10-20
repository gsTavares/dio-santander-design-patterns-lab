package one.digitialinnovation.gof.strategy;

public class StandardBehavior implements Behavior {
    
    @Override
    public void move() {
        System.out.println("standard moving...");
    }

}
