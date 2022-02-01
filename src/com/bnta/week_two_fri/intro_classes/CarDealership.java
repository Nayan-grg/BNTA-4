package com.bnta.week_two_fri.intro_classes;

import java.util.Arrays;

public class CarDealership {

    //Don't set any values here
    private String name;
    private int maxCarsOnDisplay;


    private Car[] carsInStock;

    //Constructor 1
    public CarDealership(String name, int maxCarsOnDisplay, Car[] carsInStock) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
        this.carsInStock = carsInStock;
    }

    //Constructor 2
    //Use constructors to set values if you want new dealership has no cars
    public CarDealership(String name) {
        this.name = name;
        this.maxCarsOnDisplay = 0;
        this.carsInStock = new Car[0];
    }

    //getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCarsOnDisplay() {
        return maxCarsOnDisplay;
    }

    //setters

    public void setMaxCarsOnDisplay(int maxCarsOnDisplay) {
        this.maxCarsOnDisplay = maxCarsOnDisplay;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void setCarsInStock(Car[] carsInStock) {
        this.carsInStock = carsInStock;
    }

    //Methods
    //Write a method to count the number of cars in the dealership
    public int noOfCars() {
        int count = 0;
        for (int i = 0; i < carsInStock.length; i++) {
            count += 1;
        }
        int total = maxCarsOnDisplay + count;
        return total;
    }

    public void addCar(Car car) {
//        Write a method to count the number of cars in the dealership.
//        It doesn't need to take any parameters and should return an int.
//        Write another method to add a car to the dealership.
//        The method should have a Car parameter and doesn't need to return anything.
//        Test your method by counting the number of cars, adding a new car then counting again to make sure the number has gone up by one.
//       You will need some way of finding the first empty slot in the array to save the Car in.
//       Maybe checking each slot in the array in turn would help?

        Car[] addedNoOfCars = new Car[carsInStock.length + 1];
        for (int i = 0; i < carsInStock.length; i++) {
            addedNoOfCars[i] = carsInStock[i];
        }
        addedNoOfCars[carsInStock.length] = car;
        carsInStock = addedNoOfCars;


    }
    public Car findByManufacturer(String anyManufacturer){
        Car foundIt=null;
        for (Car car : carsInStock) {
            if(car.getManufacturer().equals(anyManufacturer)){
                foundIt=car;
            }
        }return foundIt;
    }
}



//    public Boolean findByManufacturer(String anyManufacturer){
//        boolean haveCar= false;
//        for (Car car : carsInStock) {
//            if (car.getManufacturer().equals(anyManufacturer)){
//                haveCar=true;
//            }
////
////        }return haveCar;
////    }




