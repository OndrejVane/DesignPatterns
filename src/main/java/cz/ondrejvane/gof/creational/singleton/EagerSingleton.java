package cz.ondrejvane.gof.creational.singleton;

/**
 * Singleton, který se inicializuje při načtení třídy
 *
 * @author ondrejvane
 */
public class EagerSingleton {
    public static final EagerSingleton SELF = new EagerSingleton();

    private EagerSingleton() {
    }

    public String foo() {
        return "foo";
    }
}
