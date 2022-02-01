package com.bnta.week_three_mon.CarOOP;

import java.util.Arrays;
import java.util.Objects;

public class Garage {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o; // this means that the object you are comparing is a garage because of the previous code
        return garageNumber == garage.garageNumber && capacity == garage.capacity && isOpen == garage.isOpen && Objects.equals(owner, garage.owner) && Arrays.equals(cars, garage.cars);
    }
    //you inherit the method from the Object class, so even if you put .equals.
    //if the object you are comparing it to is the same as the object, then return true
    //if the object is null and
    //if the class of the objects is different, then return false
    //if they are from the same class, you can compare the variables and if they are the same, then it returns true

    @Override
    public int hashCode() {
        int result = Objects.hash(owner, garageNumber, capacity, isOpen);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }

    private Person owner;
    private int garageNumber;
    private int capacity;
    private boolean isOpen;
    private Car[] cars;

    //constructor
    public Garage(Person owner, int garageNumber, int capacity, boolean isOpen, Car[] cars) {
        this.owner = owner;
        this.garageNumber = garageNumber;
        this.capacity = capacity;
        this.isOpen = isOpen;
        this.cars = new Car[capacity];
    }


    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public int getGarageNumber() {
        return garageNumber;
    }

    public void setGarageNumber(int garageNumber) {
        this.garageNumber = garageNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "owner=" + owner +
                ", garageNumber=" + garageNumber +
                ", capacity=" + capacity +
                ", isOpen=" + isOpen +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }




}
