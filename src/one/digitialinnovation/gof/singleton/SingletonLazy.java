package one.digitialinnovation.gof.singleton;

/**
 * Singleton purpose: controls itself instance
 * 
 * "Lazy" singleton
 * 
 * @author gstavares1
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if(instance == null)
            instance = new SingletonLazy();
        return instance;
    }

}
