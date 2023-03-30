package org.kiah.designpattern.singleton;

// 双重检查单例
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
