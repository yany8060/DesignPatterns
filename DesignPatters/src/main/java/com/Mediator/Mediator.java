package com.Mediator;

/**
 * Created by yanyong on 16/1/13.
 */
public class Mediator extends AbstractMediator {
    public Mediator(AbstractColleague a, AbstractColleague b) {
        super(a, b);
    }
    //处理A对B的影响
    @Override
    public void AaffectB() {
        int number = A.getNumber();
        B.setNumber(number*100);
    }
    //处理B对A的影响
    @Override
    public void BaffectA() {
        int number = B.getNumber();
        A.setNumber(number/100);
    }
}
