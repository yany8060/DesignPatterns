package com.factory.factorymethod;


import com.factory.simplefactory.Bmw;
import com.factory.simplefactory.Car;

/**
 * Created by yanyong on 16/1/11.
 */
public class BmwDriver implements Driver {
    public Car driverCar(){
        return new Bmw();
    }
}
