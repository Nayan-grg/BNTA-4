package com.bnta.week_three_mon.CarOOP;

import com.bnta.week_two_fri.intro_classes.EngineType;

import java.util.Objects;

public class Car {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make) && Objects.equals(regNumber, car.regNumber) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, regNumber, engineType);
    }

    private String make;
    private String regNumber;
    private EngineType engineType;
    //constructor 1
    public Car(String make, String regNumber, EngineType engineType) {
        this.make = make;
        this.regNumber = regNumber;
        this.engineType = engineType;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", engineType=" + engineType +
                '}';
    }



}
