package com.bnta.week_three_mon.CarOOP;

import com.bnta.week_two_fri.intro_classes.EngineType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GarageService garageService=new GarageService();


        Car car1=new Car("tesla","dfa", EngineType.ELECTRIC);
        Car car2=new Car("honda","sdfa",EngineType.ELECTRIC);
        Car car3=new Car("h","ds",EngineType.ELECTRIC);

        Person Nayan=new Person("Nayan",22,"@gmail.com",new Car[]{car3});
        Garage garage=new Garage(Nayan,3,4,true,new Car[]{car1});
        System.out.println((Arrays.toString(garage.getCars())));
        garageService.addCars(car2,garage);
        garageService.addCars(car1,garage);
        System.out.println(garage);

        System.out.println(garageService.totalNumberOfCars(garage));
        System.out.println(garageService.availableSpot(garage));
        System.out.println(garageService.isGarageFull(garage));
        System.out.println(Arrays.toString(garageService.findElectricCars(garage)));
        System.out.println(Arrays.toString(garageService.findNonElectricCars(garage)));


    }

}
