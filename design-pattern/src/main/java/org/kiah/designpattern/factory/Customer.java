package org.kiah.designpattern.factory;

import org.kiah.designpattern.factory.abstraction.AudiFactory;
import org.kiah.designpattern.factory.abstraction.BmwFactory;
import org.kiah.designpattern.factory.method.FactoryAudi;
import org.kiah.designpattern.factory.method.FactoryBmw;
import org.kiah.designpattern.factory.simple.SimpleFactory;

public class Customer {

    public static void main(String[] args) {
        System.out.println("testSimpleFactory");
        testSimpleFactory();
        System.out.println("testFactoryMethod");
        testFactoryMethod();
        System.out.println("testAbstractFactory");
        testAbstractFactory();
    }

    public static void testSimpleFactory() {
        SimpleFactory simpleFactory = new SimpleFactory();
        Car audi = simpleFactory.createCar("audi");
        Car bmw = simpleFactory.createCar("bmw");
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
    }

    public static void testFactoryMethod() {
        FactoryAudi factoryAudi = new FactoryAudi();
        Car audi = factoryAudi.createCar();
        FactoryBmw factoryBmw = new FactoryBmw();
        Car bmw = factoryBmw.createCar();
        System.out.println(audi.toString());
        System.out.println(bmw.toString());
    }

    public static void testAbstractFactory() {
        AudiFactory audiFactory = new AudiFactory();
        BmwFactory bmwFactory = new BmwFactory();
        Car audiSmallCar = audiFactory.createSmallCar();
        System.out.println(audiSmallCar.toString());
        Car bmwSmallCar = bmwFactory.createSmallCar();
        System.out.println(bmwSmallCar.toString());
        Car audiBigCar = audiFactory.createBigCar();
        System.out.println(audiBigCar.toString());
        Car bmwBigCar = bmwFactory.createBigCar();
        System.out.println(bmwBigCar.toString());
    }
}
