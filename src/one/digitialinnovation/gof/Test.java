package one.digitialinnovation.gof;

import one.digitialinnovation.gof.facade.Facade;
import one.digitialinnovation.gof.singleton.SingletonEager;
import one.digitialinnovation.gof.singleton.SingletonLazy;
import one.digitialinnovation.gof.singleton.SingletonLazyHolder;
import one.digitialinnovation.gof.strategy.AgressiveBehavior;
import one.digitialinnovation.gof.strategy.Behavior;
import one.digitialinnovation.gof.strategy.Bot;
import one.digitialinnovation.gof.strategy.DefensiveBehavior;
import one.digitialinnovation.gof.strategy.StandardBehavior;

public class Test {
    public static void main(String[] args) {

        // Singleton
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

        // Stategy
        Behavior standard = new StandardBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior agressive = new AgressiveBehavior();

        Bot bot = new Bot();

        bot.setBehavior(standard);

        bot.move();
        bot.move();
        bot.setBehavior(defensive);
        bot.move();
        bot.setBehavior(agressive);
        bot.move();

        // Facade
        Facade facade = new Facade();
        facade.migrateCustomer("Gustavo", "14710888");
    }
}
