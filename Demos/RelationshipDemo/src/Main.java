import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create an object of the Flight class.
// This is done by calling its constructor, with the keyword “new”.
        FlightDemo myFlight = new FlightDemo(123, new Date());

        FlightDemo mySecondFlight = new FlightDemo();

        mySecondFlight.setFlightNumber(1234);

        long secondDepartureTime = myFlight.getDepartureTime().getTime() + (2 * 60 * 60 * 1000);
        Date secondDepartureDate = new Date(secondDepartureTime);
        mySecondFlight.setDepartureTime(secondDepartureDate);

// Note the constructor has two parameters: flight number, and departure.

// Print the departure time using getDepartureTime() to access the property.
        System.out.println("Original departure time: " + myFlight.getDepartureTime());

// Delay the departure by 30 minutes using the delayFlight() method.
        myFlight.delayFlight(30);

// Print the new departure time.
        System.out.println("New departure time after delay: " + myFlight.getDepartureTime());

        System.out.println("Total number of flights are : "+ FlightDemo.getFlightCount());


    }
}