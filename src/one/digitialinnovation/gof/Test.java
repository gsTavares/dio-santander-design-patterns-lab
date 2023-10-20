package one.digitialinnovation.gof;

import one.digitialinnovation.gof.singleton.SingletonEager;
import one.digitialinnovation.gof.singleton.SingletonLazy;
import one.digitialinnovation.gof.singleton.SingletonLazyHolder;

public class Test {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
        singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
    }
}
