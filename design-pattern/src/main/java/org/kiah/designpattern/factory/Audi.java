package org.kiah.designpattern.factory;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Audi extends Car {

    private final static String BRAND = "audi";

    public Audi() {
        super(BRAND);
    }

    public Audi(String model) {
        super(BRAND, model);
    }
}
