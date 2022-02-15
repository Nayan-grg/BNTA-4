package com.bnta.week_four_wed.vehicle;

public class Bicycle implements Vehicle {

    @Override
    public void move() {
        System.out.println("pedal");

    }

    @Override
    public void applyBreak() {

    }

    @Override
    public int getCurrentSpeed() {
        return 0;
    }
}
