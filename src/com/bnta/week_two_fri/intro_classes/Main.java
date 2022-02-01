package com.bnta.week_two_fri.intro_classes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Creating 4 cars
        Car car1=new Car("toyota",10_000,EngineType.ELECTRIC);
        Car car2=new Car("honda",5000,EngineType.PETROL);
        Car car3= new Car("tesla",20_000, EngineType.ELECTRIC);
        Car car4= new Car("vox",5_000,EngineType.DIESEL);
        //Creating a car dealership called Nayan's
        CarDealership dealership= new CarDealership("Nayan's");

        //printing out all the details of a car as
        System.out.println(car1);

        //Setting 2 cars in stock
       dealership.setCarsInStock( new Car[]{car1,car2});
        //Printing number of total cars
        System.out.println(dealership.noOfCars());
        //Printing out the cars in stock
        System.out.println(Arrays.toString(dealership.getCarsInStock()));

        //Adding one more car
        dealership.addCar(car3);
        //Printing the total number of cars after adding one car
        System.out.println(dealership.noOfCars());
        //printing the cars in stock
        System.out.println(Arrays.toString(dealership.getCarsInStock()));

        //Adding one more car
        dealership.addCar(car4);
        System.out.println(dealership.noOfCars());
        System.out.println(Arrays.toString(dealership.getCarsInStock()));
        System.out.println(dealership.findByManufacturer("vox"));



    }
}