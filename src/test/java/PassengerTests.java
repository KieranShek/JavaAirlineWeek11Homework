import person.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTests {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Linda", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Linda", passenger.getName());
    }

    @Test
    public void getPassengerBagCount(){
        assertEquals(2, passenger.getTotalLuggage());
    }
}