package com.bnta.week_four_wed.vehicle;

public class Car implements Vehicle{
    @Override
    public void move() {
        System.out.println("start engine");

    }

    @Override
    public void applyBreak() {

    }

    @Override
    public int getCurrentSpeed() {
        return 0;
    }
}
