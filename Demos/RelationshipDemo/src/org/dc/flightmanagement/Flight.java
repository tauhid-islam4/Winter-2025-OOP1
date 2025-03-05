package org.dc.flightmanagement;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightNumber;
    private Airline airline;
    private List<Passenger> passengers = new ArrayList<>();

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public Flight(String flightNumber, Airline airline) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        airline.addFlight(this);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
        passenger.addFlight(this);
    }

    public void displayDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Airline: " + airline.getName());
        System.out.println("Passengers: ");
        for (Passenger p : passengers) {
            System.out.println(" - " + p.getName());
        }
    }
}
