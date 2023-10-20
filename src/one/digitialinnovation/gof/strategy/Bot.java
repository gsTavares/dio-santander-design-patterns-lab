package one.digitialinnovation.gof.strategy;

public class Bot {
    
    private Behavior behavior;

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    public void move() {
        this.behavior.move();
    }

}
