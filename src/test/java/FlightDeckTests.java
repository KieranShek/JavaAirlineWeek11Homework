import person.crew.CrewType;
import person.crew.FlightDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightDeckTests {

    FlightDeck pilot;

    @Before
    public void before() {
        pilot = new FlightDeck("Maverick", CrewType.CAPTAIN,"0001M");
    }

    @Test
    public void hasName(){
        assertEquals("Maverick", pilot.getName());
    }

    @Test
    public void pilotHasLicenseNumber(){
        assertEquals("0001M", pilot.getLicenseNumber());
    }

    @Test
    public void pilotCanTakeOff(){
        assertEquals("Engines are burning, wheel are turning", pilot.takeOff());
    }

    @Test
    public void pilotCanLand(){
        assertEquals("Flaps are down fasten your seat belts please", pilot.land());
    }

    @Test
    public void canMakeAnnouncement(){
        assertEquals("Fasten your seat belts please", pilot.makeAnnouncement("Fasten your seat belts please"));
    }

    @Test
    public void crewHasRank(){
        assertEquals("Captain", CrewType.CAPTAIN.getRank());
    }


}