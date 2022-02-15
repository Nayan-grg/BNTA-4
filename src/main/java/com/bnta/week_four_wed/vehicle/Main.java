package com.bnta.week_four_wed.vehicle;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car =new Car();
        Bicycle bicycle=new Bicycle();
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bicycle);
        Person person1= new Person("Nana",vehicles);
        car.move();
        for (Vehicle vehicle : person1.getVehicles()) {
            vehicle.move();
        }

    }
}
