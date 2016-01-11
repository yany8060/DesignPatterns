package com.factory.simplefactory;

/**
 * Created by yanyong on 16/1/11.
 */

//工厂类角色
public class Driver {
    public static Car driverCar(String s)throws Exception{
        if(s.equalsIgnoreCase("Benz"))
            return new Benz();
        else if(s.equalsIgnoreCase("Bmw"))
            return new Bmw();
        else
            throw new Exception();
    }
}
