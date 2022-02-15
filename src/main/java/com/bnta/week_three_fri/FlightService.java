package com.bnta.week_three_fri;

import java.util.Arrays;

public class FlightService {
    //Set the properties this flight service as flighdao as flight service class depends on flightdao
    private FlightDAO flightDAO;

    public FlightService(FlightDAO flightDAO) {
        this.flightDAO = flightDAO;
    }

    public void addFlight(Flight flight) {
        if (!(flight.getCapacity() <= 100)) {
            throw new IllegalStateException("Flight is full");
        } else {
            flightDAO.saveFlightToFile(flight);
        }
    }

    public Flight[] getFlights() {
        return flightDAO.getFlightsFromFile();
    }

//    public Flight[] filterFlight(Destination destination) {
//        Flight[] flights = flightDAO.getFlightsFromFile();
//        //need to count the number of flights in an array
//
//        int counter = 0;
//        for (Flight flight : flights) {
//            if (flight.getDestination().equals(destination)) {
//                counter++;
//            }
//
//        }
////        Flight[] filtered= new Flight[counter];
////        int index=0;
////        for (int i = 0; i < flights.length; i++) {
////            if(flight.getDestination().equals(destination)){
////                filtered[index++]=flights[i];
////            }
////
////
////        }
//    }
//}



}
