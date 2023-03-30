package org.kiah.designpattern.factory;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Bmw extends Car{

    private final static String BRAND = "bmw";
    public Bmw(){
        super(BRAND);
    }

    public Bmw(String model) {
        super(BRAND, model);
    }
}
