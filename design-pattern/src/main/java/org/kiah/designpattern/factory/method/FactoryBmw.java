package org.kiah.designpattern.factory.method;

import org.kiah.designpattern.factory.Bmw;
import org.kiah.designpattern.factory.Car;

public class FactoryBmw implements FactoryMethod {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
