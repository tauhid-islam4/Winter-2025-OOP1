package org.dc.flightmanagement;

import java.util.ArrayList;
import java.util.List;

public class Airline {
    private String name;
    private List<Flight> flights = new ArrayList<>();

    public Airline(String name) {
        this.name = name;
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
