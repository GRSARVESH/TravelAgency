package Factory;

import Enum.PassengerType;
import Models.GoldPassenger;
import Models.Passenger;
import Models.PremiumPassenger;
import Models.StandardPassenger;

/**
 * 
 * The PassengerFactory class is responsible for creating instances of Passenger
 * subclasses based on the given PassengerType.
 */
public class PassengerFactory {
    /**
     * 
     * Creates a new Passenger object based on the given PassengerType, name,
     * passenger number, and balance.
     * 
     * @param type            The type of the passenger (STANDARD, GOLD, or
     *                        PREMIUM).
     * @param name            The name of the passenger.
     * @param passengerNumber The passenger number assigned to the passenger.
     * @param balance         The initial balance of the passenger.
     * @return A new instance of Passenger or its subclass based on the given
     *         PassengerType.
     * @throws IllegalArgumentException If an invalid passenger type is provided.
     */
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
