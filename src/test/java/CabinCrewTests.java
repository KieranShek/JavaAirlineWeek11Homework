import org.junit.Before;
import org.junit.Test;
import person.crew.CrewType;

import static org.junit.Assert.assertEquals;

public class CabinCrewTests {

    person.crew.CabinCrew cabinCrew;


    @Before
    public void before(){
        cabinCrew = new person.crew.CabinCrew("Bruce", CrewType.FLIGHTATTENDANT );
    }

    @Test
    public void cabinCrewHasRank(){
        assertEquals("Flight Attendant", CrewType.FLIGHTATTENDANT.getRank());
    }

    @Test
    public void cabinCrewHasName(){
        assertEquals("Bruce", cabinCrew.getName());
    }

    @Test
    public void crewCanMakeAnnouncement(){
    assertEquals("Ladies and gentlemen, dinner is served", cabinCrew.makeAnnouncement("Ladies and gentlemen, dinner is served"));
    }
}