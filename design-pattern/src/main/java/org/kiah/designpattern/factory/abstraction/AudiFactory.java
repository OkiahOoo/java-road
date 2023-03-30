package org.kiah.designpattern.factory.abstraction;

import org.kiah.designpattern.factory.Audi;
import org.kiah.designpattern.factory.Car;

public class AudiFactory extends AbstractFactory {

    private final static String BRAND = "audi";

    @Override
    public Car createSmallCar() {
        return new Audi("A6L");
    }

    @Override
    public Car createBigCar() {
        return new Audi("Q5L");
    }
}
