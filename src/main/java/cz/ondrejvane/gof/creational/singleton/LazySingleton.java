package cz.ondrejvane.gof.creational.singleton;

/**
 * Instance je vytvořena až po zavolání metody getInstance
 *
 * @author ondrejvane
 */
public class LazySingleton {

    private static LazySingleton self;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (self == null) {
            self = new LazySingleton();
        }
        return self;
    }

    public String foo() {
        return "foo";
    }
}
