package Factory;

import Enum.PassengerType;
import Models.GoldPassenger;
import Models.Passenger;
import Models.PremiumPassenger;
import Models.StandardPassenger;

public class PassengerFactory {
    public static Passenger createPassenger(PassengerType type, String name, int passengerNumber, double balance) {
        switch (type) {
            case STANDARD:
                return new StandardPassenger(name, passengerNumber, balance);
            case GOLD:
                return new GoldPassenger(name, passengerNumber, balance);
            case PREMIUM:
                return new PremiumPassenger(name, passengerNumber, balance);
            default:
                throw new IllegalArgumentException("Invalid passenger type: " + type);
        }
    }
}
