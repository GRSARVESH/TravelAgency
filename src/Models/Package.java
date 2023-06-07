package Models;

import java.util.ArrayList;
import java.util.List;

public class Package {
    private String name;
    private int capacity;
    private List<Passenger> passengers;
    private List<Destination> itinerary;

    public Package(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.passengers = new ArrayList<Passenger>();
        this.itinerary = new ArrayList<Destination>();
    }

    public void addDestination(Destination destination) {
        this.itinerary.add(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() > this.capacity) {
            System.out.println("Passengers full!");
            return;
        }
        this.passengers.add(passenger);
        System.out.println("Passenger: " + passenger + " added successfully");
    }

    public void removePassenger(Passenger passenger) {
        if (this.passengers.size() == 0) {
            System.out.println("No Passengers!");
            return;
        }
        this.passengers.remove(passenger);
        System.out.println("Passenger: " + passenger + " removed successfully");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Destination> getitinerary() {
        return this.itinerary;
    }

    public void setitinerary(List<Destination> itinerary) {
        this.itinerary = itinerary;
    }

    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName());
                System.out.println("Description: " + activity.getDescription());
                System.out.println("Cost: " + activity.getCost());
                System.out.println("Capacity: " + activity.getCapacity());
                System.out.println("----------------------");
            }
            System.out.println("End");
        }
    }

    public void printPassengerList() {
        System.out.println("Travel Package: " + name);
        System.out.println("Passenger Capacity: " + this.capacity);
        System.out.println("Number of Passengers: " + passengers.size());
        System.out.println("Passenger List:");
        for (Passenger passenger : this.passengers) {
            System.out.println("Name: " + passenger.getName());
            System.out.println("Number: " + passenger.getPassengerNumber());
            System.out.println("----------------------");
        }
    }

    public List<Activity> getAvailableActivities() {
        List<Activity> availableActivities = new ArrayList<>();
        for (Destination destination : itinerary) {
            for (Activity activity : destination.getActivities()) {
                availableActivities.add(activity);

            }
        }
        return availableActivities;
    }
}