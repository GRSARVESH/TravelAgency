package Models;

import Enum.PassengerType;

/**
 * 
 * The StandardPassenger class represents a passenger with Gold membership.
 * 
 * It extends the Passenger class and provides additional functionality specific
 * to Standard passengers.
 */
public class StandardPassenger extends Passenger {

    private double balance;

    public StandardPassenger(String name, int passengerNumber, double balance) {
        super(name, passengerNumber);
        this.balance = balance;
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
        double discountedCost = activity.getCost();
        if (balance >= discountedCost) {
            balance -= discountedCost;
            addToActivity(activity);
        }
        return;
    }

    /**
     * 
     * Retrieves the balance of the Standard passenger.
     * 
     * @return The balance of the Standard passenger.
     */
    @Override
    public double getBalance() {
        return balance;
    }

}
