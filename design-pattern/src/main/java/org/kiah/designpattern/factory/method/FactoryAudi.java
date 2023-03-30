package org.kiah.designpattern.factory.method;

import org.kiah.designpattern.factory.Audi;
import org.kiah.designpattern.factory.Car;

public class FactoryAudi implements FactoryMethod {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
