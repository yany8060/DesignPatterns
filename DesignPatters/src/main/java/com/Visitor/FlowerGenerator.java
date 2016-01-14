package com.Visitor;

import java.util.Random;

/**
 * Created by yanyong on 16/1/14.
 */
public class FlowerGenerator {
    private static Random rand = new Random();
    public static Flower newFlower() {
        switch(rand.nextInt(3))
        {
            default:
            case 0: return new Gladiolus();
            case 1: return new Runuculus();
            case 2: return new Chrysanthemum();
        }
    }
}
