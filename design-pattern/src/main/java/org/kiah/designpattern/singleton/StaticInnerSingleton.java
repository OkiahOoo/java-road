package org.kiah.designpattern.singleton;

// 静态内部类单例
public class StaticInnerSingleton {
    private StaticInnerSingleton() {
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }
}
