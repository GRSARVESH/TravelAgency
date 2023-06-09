package Test;

import Models.Activity;
import Models.GoldPassenger;
import Models.StandardPassenger;
import Models.Passenger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ActivityTest {

    Activity scuba;
    Passenger alice;
    Passenger bob;
    @Before
    public void init(){
        scuba=new Activity("scuba","Jump into a world inside water",2000.00,5);
        alice=new GoldPassenger("Alice",1,5000.00);
        bob=new StandardPassenger("Bob",2,1000.00);;
    }

    @Test
    public void addPassenger() {
        scuba.addPassenger(alice);
        assertEquals(1,scuba.getPassengers().size());
        scuba.addPassenger(bob);
        assertEquals(1,scuba.getPassengers().size());
    }

    @Test
    public void removePassenger() {
        scuba.removePassenger(alice);
        assertEquals(0,scuba.getPassengers().size());
    }

    @Test
    public void getCost(){
        assertEquals(2000,(int)scuba.getCost());
    }
}