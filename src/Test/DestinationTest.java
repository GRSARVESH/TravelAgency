package Test;

import Models.Activity;
import Models.Destination;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DestinationTest {

    private Activity skydiving,scubadiving;
    private Destination blr;
    @Before
    public void init(){
        skydiving = new Activity("skydiving", "jump from the sky", 70.00, 1);
        scubadiving = new Activity("scubadiving", "jump into the water", 100.00, 2);
        blr = new Destination("IT");
    }

    @Test
    public void addActivity() {
        assertEquals(0,blr.getActivities().size());
        blr.addActivity(skydiving);
        assertEquals(1,blr.getActivities().size());
        blr.addActivity(scubadiving);
        assertEquals(2,blr.getActivities().size());
    }

    @Test
    public void removeActivity() {
        blr.addActivity(skydiving);
        assertEquals(1,blr.getActivities().size());
        blr.removeActivity(skydiving);
        assertEquals(0,blr.getActivities().size());
    }
}