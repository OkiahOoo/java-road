package org.kiah.designpattern.singleton;

// 枚举单例
public class EnumSingleton {
    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private EnumSingleton singleton;

        // JVM保证此方法绝对只调用一次
        Singleton() {
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return singleton;
        }
    }
}
