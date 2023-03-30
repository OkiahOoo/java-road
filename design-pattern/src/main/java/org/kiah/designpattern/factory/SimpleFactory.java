package org.kiah.designpattern.factory;

// 简单工厂模式
public class SimpleFactory {
    public static Car createCar(String type) {
        if ("audi".equals(type)) {
            return new Audi();
        } else if ("bmw".equals(type)) {
            return new Bmw();
        } else {
            return null;
        }
    }
}
