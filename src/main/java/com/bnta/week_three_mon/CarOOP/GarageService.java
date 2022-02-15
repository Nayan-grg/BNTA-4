package com.bnta.week_three_mon.CarOOP;

import com.bnta.week_three_mon.CarOOP.Car;
import com.bnta.week_three_mon.CarOOP.Garage;
import com.bnta.week_two_fri.intro_classes.EngineType;

import java.util.Arrays;

public class GarageService {
    //1. Add cars
    public static void addCars(Car car, Garage garage) {
        //The garage needs to be open
        //The garage needs to have some space
        //Add car to the empty space
        if (garage.isOpen()) {
            for (int i = 0; i < garage.getCars().length; i++) {
                if (garage.getCars()[i] == null) {
                    garage.getCars()[i] = car;
                    break;
                }

            }
            System.out.println(Arrays.toString(garage.getCars()));
        }
    }

    //2.How many cars in the garage
    public int totalNumberOfCars(Garage garage) {
        int count = 0;
        for (Car car : garage.getCars()) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }

    //3. Number of free spot in the garage
    public int availableSpot(Garage garage) {
        int count = 0;
        for (Car car : garage.getCars()) {
            if (car == null) {
                count++;
            }
        }
        return count;
    }

    //4.Remove car
    public void removeCar(Car car, Garage garage) {
        for (int i = 0; i < garage.getCars().length; i++) {
            if (garage.getCars()[i] == car) {
                garage.getCars()[i] = null;
            }
        }
    }

    // 5. Open and close garage
    public void openGarage(Garage garage) {
        if (garage.isOpen()) {
            System.out.println("garage is open");
        }
    }

    public void closeGarage(Garage garage) {
        if (!garage.isOpen()) {
            System.out.println("garage is close");
        }
    }

    // 6. isGarageFull
    public boolean isGarageFull(Garage garage) {
        boolean isFull;
        if (garage.getCapacity() <= totalNumberOfCars(garage)) {
            isFull = true;
        }
        return false;
    }

    // 7. filter electric cars
    public Car[] findElectricCars(Garage garage) {
        //find the number of electric cars
        int arrSize = 0;
        for (Car car : garage.getCars()) {
            if (car == null) {
                continue;
            }
            if (car.getEngineType() == EngineType.ELECTRIC) {
                arrSize++;

            }
        }
        //new array to add electric cars
        Car[] electricCars = new Car[arrSize];
        int index=0;
        for (Car car : garage.getCars()) {
            if(car==null){
                continue;
        }
            if (car.getEngineType()==EngineType.ELECTRIC){
                electricCars[index++]=car;
            }


    }return electricCars;
}
    // 8. filter non electric cars
    public Car[] findNonElectricCars(Garage garage){
        //Find the number of non-electric cars
        int numberOfNonElectricCars =0;
        for (Car car : garage.getCars()) {
            if(car==null){
                continue;
            }
            if(car.getEngineType()==EngineType.DIESEL||car.getEngineType()==EngineType.PETROL){
                numberOfNonElectricCars++;
            }
        }
        //Create an empty array to put all the non-electric cars
        Car[] nonElectricCarsArray= new Car[numberOfNonElectricCars];
        int index=0;
        for (Car car : garage.getCars()) {
            if(car==null) {
                continue;
            }
            if (car.getEngineType()==EngineType.DIESEL||car.getEngineType()==EngineType.PETROL){
                nonElectricCarsArray[index++]=car;
            }
        }

        return nonElectricCarsArray;
    }

    // 9. Clean garage. Remove all cars and put them back and in between print garage cleaned
    public void cleanGarage(Garage garage){
        //Create an empty array
        Car[] carArray= garage.getCars();
        //removing cars
        Arrays.fill(garage.getCars(),null);
        System.out.println("Empty garage");
        //put the cars back in
        for (int i = 0; i < garage.getCars().length; i++) {
            garage.getCars()[i]=carArray[i];
        }
        System.out.println("Cars back in the garage");
    }

}
