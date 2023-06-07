package Models;

import Enum.PassengerType;

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

    @Override
    public void registerForActivity(Activity activity) {
        addToActivity(activity);
        return;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

}
