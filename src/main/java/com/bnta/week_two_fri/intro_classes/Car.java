package com.bnta.week_two_fri.intro_classes;

public class Car {

    //Properties
    private String manufacturer;
    private int price;
    private EngineType engineType;

    //Constructor 1 is a thing that allows us to create an object
    public Car(String manufacturer, int price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }
    //static -> it belongs to the class itself and not the object

    //Setters
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
    //getters

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                '}';
    }



}
