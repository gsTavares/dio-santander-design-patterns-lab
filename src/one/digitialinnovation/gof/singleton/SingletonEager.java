package one.digitialinnovation.gof.singleton;

/**
 * "Eager" singleton
 * 
 * @author gstavares1
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instance;
    }

}
