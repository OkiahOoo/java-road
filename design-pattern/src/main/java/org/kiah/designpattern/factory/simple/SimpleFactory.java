package org.kiah.designpattern.factory.simple;

import org.kiah.designpattern.factory.Audi;
import org.kiah.designpattern.factory.Bmw;
import org.kiah.designpattern.factory.Car;

// 简单工厂模式
public class SimpleFactory {
    public Car createCar(String type) {
        if ("audi".equals(type)) {
            return new Audi();
        } else if ("bmw".equals(type)) {
            return new Bmw();
        } else {
            return null;
        }
    }
}
