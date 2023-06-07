package Models;

import java.util.List;

import java.util.ArrayList;

public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private List<Passenger> passengers;

    public Activity(String name, String description, double cost, int capacity) {
        this.passengers = new ArrayList<Passenger>();
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Passenger> getPassengers() {
        return this.passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() >= this.capacity) {
            System.out.println("Passengers full!");
            return;
        }
        if (passenger.getBalance() < this.cost) {
            System.out.println("Low Balance....");
            return;
        }
        passenger.addToActivity(this);
        this.passengers.add(passenger);
        System.out.println("Passenger: " + passenger.getName() + " added successfully");
    }

    public void removePassenger(Passenger passenger) {
        if (this.passengers.size() == 0) {
            System.out.println("No Passengers!");
            return;
        }
        passenger.cancelActivity(this);
        this.passengers.remove(passenger);
        System.out.println("Passenger: " + passenger.getName() + " removed successfully");
    }

}
