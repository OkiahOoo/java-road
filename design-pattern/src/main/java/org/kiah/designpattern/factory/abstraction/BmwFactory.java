package org.kiah.designpattern.factory.abstraction;

import org.kiah.designpattern.factory.Bmw;
import org.kiah.designpattern.factory.Car;

public class BmwFactory extends AbstractFactory {

    private final static String BRAND = "bmw";
    @Override
    public Car createSmallCar() {
        return new Bmw("730");
    }

    @Override
    public Car createBigCar() {
        return new Bmw("X5");
    }
}
