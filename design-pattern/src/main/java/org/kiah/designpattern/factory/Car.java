package org.kiah.designpattern.factory;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Car {

    private String brand;

    private String model;

    public Car(String brand){
        this.brand = brand;
    }

    public Car(String brand,String model){
        this.brand = brand;
        this.model = model;
    }
}
