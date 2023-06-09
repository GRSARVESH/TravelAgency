package Test;

import Models.Activity;
import Models.GoldPassenger;
import Models.PremiumPassenger;
import Models.Passenger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PassengerTest {

    @Test
    public void testPassenger() {
        Passenger alice= new GoldPassenger("Alice",1,100);
        Passenger bob= new PremiumPassenger("Bob",2,0);
        assert("Alice"==alice.getName());
        assert (bob.getpassengerNumber()==2);
        Activity skydiving = new Activity("skydiving", "jump from the sky", 70.00, 1);
        Activity scubadiving = new Activity("scubadiving", "jump into the water", 100.00, 2);
        skydiving.addPassenger(alice);
        skydiving.addPassenger(bob);
        scubadiving.addPassenger(alice);
        assertEquals(2,alice.getActivities().size());
        assertEquals(0,bob.getActivities().size());
        skydiving.removePassenger(alice);
        skydiving.addPassenger((bob));
        assertEquals(1,bob.getActivities().size());
    }
}