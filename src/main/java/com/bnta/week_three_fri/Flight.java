package com.bnta.week_three_fri;

import java.util.Objects;

public class Flight {
    private String flightNumber;
    private Destination destination;
    private int capacity;

    public Flight(String flightNumber, Destination destination, int capacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.capacity = capacity;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return capacity == flight.capacity && Objects.equals(flightNumber, flight.flightNumber) && destination == flight.destination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, destination, capacity);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", destination=" + destination +
                ", capacity=" + capacity +
                '}';
    }


}
