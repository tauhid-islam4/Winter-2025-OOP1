package org.dc.flightmanagement;

public class FlightManagementSystem {
    public static void main(String[] args) {
        Airline airline = new Airline("Sky Airlines");
        Flight flight1 = new Flight("SA123", airline);
        Flight flight2 = new Flight("SA456", airline);

        Passenger p1 = new Passenger("John Doe");
        Passenger p2 = new Passenger("Jane Smith");

        flight1.addPassenger(p1);
        flight1.addPassenger(p2);
        flight2.addPassenger(p1);

        flight1.displayDetails();
        airline.displayFlights();
        p1.displayFlights();
        p2.displayFlights();
    }
}
