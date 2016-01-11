package com.factory.factorymethod;

import com.factory.simplefactory.Benz;
import com.factory.simplefactory.Car;

/**
 * Created by yanyong on 16/1/11.
 */
public class BenzDriver implements Driver {

    public Car driverCar() {
        return new Benz();
    }
}
