package org.kiah.designpattern.factory.abstraction;

import org.kiah.designpattern.factory.Car;

// 抽象工厂模式
public abstract class AbstractFactory {
    public abstract Car createSmallCar();

    public abstract Car createBigCar();
}
