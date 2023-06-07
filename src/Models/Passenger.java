package Models;

import java.util.List;
import java.util.ArrayList;

import Enum.PassengerType;

public abstract class Passenger {
    private String name;
    private int passengerNumber;
    private List<Activity> activities;

    public Passenger(String name, int passengerNumber) {
        this.name = name;
        this.passengerNumber = passengerNumber;
        this.activities = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getPassengerNumber() {
        return this.passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getpassengerNumber() {
        return this.passengerNumber;
    }

    public void setpassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public abstract PassengerType getType();

    public abstract void registerForActivity(Activity activity);

    public abstract double getBalance();

    public List<Activity> getActivities() {
        return this.activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addToActivity(Activity activity) {
        activities.add(activity);
        return;
    }

    public boolean cancelActivity(Activity activity) {
        if (activities.remove(activity)) {
            activity.removePassenger(this);
        }
        return false;
    }

}