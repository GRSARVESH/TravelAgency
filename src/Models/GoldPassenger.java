package Models;

import Enum.PassengerType;

/**
 * 
 * The GoldPassenger class represents a passenger with Gold membership.
 * 
 * It extends the Passenger class and provides additional functionality specific
 * to Gold passengers.
 */
public class GoldPassenger extends Passenger {
    private double balance;

    public GoldPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
    }

    @Override
    public PassengerType getType() {
        return PassengerType.GOLD;
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
        double discountedCost = activity.getCost() * 0.9;
        if (balance >= discountedCost) {
            balance -= discountedCost;
            addToActivity(activity);
        }
        return;
    }

    /**
     * 
     * Retrieves the balance of the Gold passenger.
     * 
     * @return The balance of the Gold passenger.
     */
    @Override
    public double getBalance() {
        return balance;
    }

}
