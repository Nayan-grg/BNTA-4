package com.bnta.week_four_wed.vehicle;

public class ElectricScooter implements Vehicle{

    @Override
    public void move() {
        System.out.println("press button");

    }

    @Override
    public void applyBreak() {

    }

    @Override
    public int getCurrentSpeed() {
        return 0;
    }
}
