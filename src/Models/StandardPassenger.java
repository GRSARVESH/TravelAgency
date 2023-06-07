package Models;

import Enum.PassengerType;

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

    @Override
    public void registerForActivity(Activity activity) {
        double discountedCost = activity.getCost();
        if (balance >= discountedCost) {
            balance -= discountedCost;
            addToActivity(activity);
        }
        return;
    }

    @Override
    public double getBalance() {
        return balance;
    }

}
