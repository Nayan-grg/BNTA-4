package com.bnta.week_three_fri;

public class FlightDAO {
    public Flight[] getFlightsFromFile(){
        System.out.println("Getting flights from file");
        //this data comes from a file
        Flight italy=new Flight("1",Destination.ITALY,23);
        Flight spain=new Flight("2",Destination.SPAIN,23);
        Flight us=new Flight("3",Destination.US,23);

        return new Flight[]{italy,spain,us};
    }
    public void saveFlightToFile(Flight flight){
        System.out.println("Saving flight from file");
        System.out.println(flight);
        System.out.println("Saved flight to file");
    }
}
