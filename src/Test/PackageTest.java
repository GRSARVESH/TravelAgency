package Test;

import Models.Destination;
import Models.GoldPassenger;
import Models.Package;
import Models.Passenger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class PackageTest {
    Package yatra=new Package("Kedarnath yatra",10);

    @Test
    public void addDestination() {
        Destination amarnath=new Destination("Amarnath");
        yatra.addDestination(amarnath);
        assertEquals(1,yatra.getitinerary().size());
    }

    @Test
    public void addPassenger() {
        Passenger alice=new GoldPassenger("Alice",1,10000.00);
        yatra.addPassenger(alice);
        assertEquals(1,yatra.getPassengers().size());
    }

    @Test
    public void removePassenger() {
        Passenger bob=new GoldPassenger("Bob",2,10000.00);
        yatra.addPassenger(bob);
        yatra.removePassenger(bob);
        assertEquals(0,yatra.getPassengers().size());
    }
}