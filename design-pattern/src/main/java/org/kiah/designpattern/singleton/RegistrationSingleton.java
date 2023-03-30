package org.kiah.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

// 登记式单例
public class RegistrationSingleton {
    private static final Map<String, RegistrationSingleton> map = new HashMap<>();

    static {
        RegistrationSingleton instance = new RegistrationSingleton();
        map.put(instance.getClass().getName(), instance);
    }

    // 保护的默认构造
    protected RegistrationSingleton() {
    }

    // 静态工厂方法，返还此类惟一的实例
    public static RegistrationSingleton getInstance(String name) {
        if (name == null) {
            name = RegistrationSingleton.class.getName();
            System.out.println("name == null" + "--->name=" + name);
        }
        if (map.get(name) == null) {
            try {
                map.put(name, (RegistrationSingleton) Class.forName(name).newInstance());
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }
}
