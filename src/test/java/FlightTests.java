import Flight.Flight;
import airports.Airport;
import person.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTests {

    Flight flight;

    @Before
    public void before(){
        flight = new Flight(Airport.LHR, Airport.EDI);
    }


    @Test
    public void flightHasDept(){
        assertEquals("London Heathrow", flight.getDeptAirport());
    }


    @Test
    public void flightHasArrival(){
        assertEquals("Edinburgh", flight.getDestAirport());
    }


    @Test
    public void canAddPassenger(){
        Passenger passenger_1;
        Passenger passenger_2;
        Passenger passenger_3;

        passenger_1 = new Passenger("Steve", 1);
        passenger_2 = new Passenger("Stan", 1);
        passenger_3 = new Passenger("Jen", 1);

        flight.addPassenger(passenger_1);
        flight.addPassenger(passenger_2);
        flight.addPassenger(passenger_3);

        assertEquals(3, flight.getPassengerCount());
    }


    @Test
    public void canCountBags(){
        Passenger passenger_1;
        Passenger passenger_2;
        Passenger passenger_3;
        passenger_1 = new Passenger("Steve", 1);
        passenger_2 = new Passenger("Stan", 2);
        passenger_3 = new Passenger("Jen", 1);

        assertEquals(4, flight.getFlightBagCount());
    }
}