package com.Mediator;

/**
 * Created by yanyong on 16/1/13.
 */
public class ColleagueB extends AbstractColleague {

    @Override
    public void setNumber(int number, AbstractMediator am) {
        this.number = number;
        am.BaffectA();
    }
}
