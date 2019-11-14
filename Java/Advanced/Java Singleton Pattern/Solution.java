// github.com/RodneyShag

import java.util.Scanner;
import java.lang.reflect.Constructor;

class Singleton {
    private Singleton() {}
    public String str;
    private static Singleton instance = null;
    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
