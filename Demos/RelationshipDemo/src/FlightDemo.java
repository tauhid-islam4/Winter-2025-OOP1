import java.util.Date;

public class FlightDemo {
    // Instance properties.
    private int flightNumber;
    private Date departureTime;
    private int flightDuration = 60; // Default value of 60 minutes.

    // Static property.
    private static int flightCount = 0;

    // Constructor.
    public FlightDemo(int flightNumber, Date departureTime) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        flightCount++; // Increment flight count.
    }
    public FlightDemo(){
        flightCount++;// Increent flight count.
    }

    // Getters and setters for instance variables.
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }


    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    // Static method to get the total number of flights.
    public static int getFlightCount() {
        return flightCount;
    }

    // Method to delay the flight time.
    public void delayFlight(int numberOfMinutes) {
        // Update departure time by adding the specified minutes.
        // Using long data type as the default time is in milliseconds.
        long currentDepartureTime = departureTime.getTime();
        // There is a conversion here for milliseconds, too.
        long newDepartureTime = currentDepartureTime + (numberOfMinutes * 60 * 1000);
        departureTime.setTime(newDepartureTime);
    }

    // Method to calculate arrival time based on departure time and duration.
    public Date getArrivalTime() {
        // Conversion based on time in milliseconds.
        long arrivalTime = departureTime.getTime() + (flightDuration * 60 * 1000);
        return new Date(arrivalTime);
    }
}
