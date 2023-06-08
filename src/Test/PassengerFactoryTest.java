package Test;

import Factory.PassengerFactory;
import Models.GoldPassenger;
import Models.Passenger;
import Models.PremiumPassenger;
import Models.StandardPassenger;
import Enum.PassengerType;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

class PassengerFactoryTest {

    @Test
    void createPassenger() {
        Passenger standardPassenger = PassengerFactory.createPassenger(PassengerType.STANDARD, "John", 1, 0.0);
        Passenger goldPassenger = PassengerFactory.createPassenger(PassengerType.GOLD, "Alice", 2, 200.0);
        Passenger premiumPassenger = PassengerFactory.createPassenger(PassengerType.PREMIUM, "Bob", 3, 0);
        assertTrue(standardPassenger instanceof  StandardPassenger);
        assertTrue(goldPassenger instanceof GoldPassenger);
        assertTrue(premiumPassenger instanceof PremiumPassenger);

    }
}