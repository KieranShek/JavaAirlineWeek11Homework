import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneModel;

import static org.junit.Assert.assertEquals;

public class PlaneTests {

//    instance variables
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneModel.B737);
    }


    @Test
    public void planeHasModelType(){
        assertEquals("737", PlaneModel.B737.getModel());
    }

    @Test
    public void planeHasSeats(){
        assertEquals(100, PlaneModel.B737.getNumberOfSeats());
    }


}
