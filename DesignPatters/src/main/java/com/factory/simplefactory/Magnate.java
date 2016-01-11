package com.factory.simplefactory;

import static com.factory.simplefactory.Driver.*;

/**
 * Created by yanyong on 16/1/11.
 */
public class Magnate {
    public static void main(String[] args){
        try{
            Car car= driverCar("benz");
            car.drive();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
