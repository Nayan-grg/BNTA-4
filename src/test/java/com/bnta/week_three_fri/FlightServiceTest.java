//package com.bnta.week_three_fri;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.mockito.configuration.IMockitoConfiguration;
//
//import java.util.Arrays;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.BDDMockito.given;
//import static org.mockito.Mockito.never;
//import static org.mockito.Mockito.verify;
//
//class FlightServiceTest {
//
//    private FlightService underTest;
//    private FlightDAO flightDAO;
////    private FlightDAO flightDAO; -> this is not done because we want to mock, instead of testing
//    //if there is dependency, we need to pass a mock and not the real thing
//    //if the class you are testing depends on another class, you need create a mock for that
//
//    @BeforeEach
//    void setUp() {
//        flightDAO= Mockito.mock(FlightDAO.class);
//        underTest=new FlightService(flightDAO);
//
//    }
//
//    @Test
//    void canAddFlight() {
//        //Given
//        Flight flight =new Flight("3",Destination.ITALY,33); //this is an input data needs to be inside given.
//
//        //When
//        underTest.addFlight(flight);
//
//        //Then
//        verify(flightDAO).saveFlightToFile(flight);
//    }
//
//    @Test
//    void cannotAddFlight() {
//        //Given
//        Flight flight =new Flight("3",Destination.ITALY,0); //this is an input data needs to be inside given.
//
//        //When
//        assertThatThrownBy(()->{
//            underTest.addFlight(flight);
//        }).hasMessage("Flight is full");
//
//        //Then
//        verify(flightDAO,never()).saveFlightToFile(any());
//    }
//
//    @Test
//    void getDisplayFlights() {
//        //Given
//
//        //When
//        underTest.getFlights();
//
//        //Then
//        verify(flightDAO).getFlightsFromFile();
//    }
//
//    @Test
//    void canFilter() {
//        //Given
//        Flight[] flight= {
//                new Flight("123",Destination.ITALY,10),
//                new Flight("123",Destination.ITALY,10),
//                new Flight("123",Destination.ITALY,10),
//        };
//        Destination filter=Destination.ITALY;
//        given(flightDAO.getFlightsFromFile());
//        return{
//
//        //When
//        Flight[] actual= underTest.filterFlight(filter);
//
//        //Then
//        Flight[] expected={ new Flight("123",Destination.ITALY,10)}
//    }
//}