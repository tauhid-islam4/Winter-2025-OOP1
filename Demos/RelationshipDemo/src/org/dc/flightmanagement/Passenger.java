package org.dc.flightmanagement;

import java.util.ArrayList;
import java.util.List;

class Passenger {
    private String name;
    private List<Flight> flights = new ArrayList<>();

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void displayFlights() {
        System.out.println(name + " is booked on the following flights:");
        for (Flight flight : flights) {
            System.out.println(" - " + flight.getFlightNumber());
        }
    }
}
