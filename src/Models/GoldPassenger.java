package Models;

import Enum.PassengerType;

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

    @Override
    public void registerForActivity(Activity activity) {
        double discountedCost = activity.getCost() * 0.9;
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
