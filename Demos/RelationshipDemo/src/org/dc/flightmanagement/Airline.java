package org.dc.flightmanagement;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String name;
    private List<Flight> flights = new ArrayList<>();

    public Airline(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public String getName() {
        return name;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void displayFlights() {
        System.out.println("Flights operated by " + name + ":");
        for (Flight flight : flights) {
            System.out.println(" - " + flight.getFlightNumber());
        }
    }
}
