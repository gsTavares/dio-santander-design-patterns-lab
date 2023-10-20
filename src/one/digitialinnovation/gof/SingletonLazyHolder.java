package one.digitialinnovation.gof;

/**
 * Singleton purpose: controls itself instance
 * 
 * "Lazy" singleton with holder
 *
 * Thread-safe and most recommended
 *  
 * @author gstavares1
 */
public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }


    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return Holder.instance;
    }

}
