package Models;

import Enum.PassengerType;

/**
 * 
 * The PremiumPassenger class represents a passenger with Gold membership.
 * 
 * It extends the Passenger class and provides additional functionality specific
 * to Premium passengers.
 */
public class PremiumPassenger extends Passenger {

    private static final double INFINITY = 10000000.00;
    private double balance;

    public PremiumPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = INFINITY;
    }

    @Override
    public PassengerType getType() {
        return PassengerType.STANDARD;
    }

    /**
     * 
     * Registers the Gold passenger for an activity with a discounted cost.
     * If the passenger's balance is sufficient, the discounted cost is deducted
     * from the balance
     * and the passenger is added to the activity.
     * 
     * @param activity The activity to register for.
     */
    @Override
    public void registerForActivity(Activity activity) {
        addToActivity(activity);
        return;
    }

    /**
     * 
     * Retrieves the balance of the Premium passenger.
     * 
     * @return The balance of the Premium passenger.
     */
    @Override
    public double getBalance() {
        return this.balance;
    }

}
