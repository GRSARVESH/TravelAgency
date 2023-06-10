package Models;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * The Package class represents a travel package.
 * 
 * It contains information about the package, such as its name, capacity,
 * passengers, and itinerary.
 */
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

    public void removeDestination(Destination destination) {
        this.itinerary.remove(destination);
    }

    public void addPassenger(Passenger passenger) {
        if (this.passengers.size() > this.capacity) {
            System.out.println("Passengers full!");
            return;
        }
        this.passengers.add(passenger);
        System.out.println("Passenger: " + passenger.getName() + " added successfully");
    }

    public void removePassenger(Passenger passenger) {
        if (this.passengers.size() == 0) {
            System.out.println("No Passengers!");
            return;
        }
        this.passengers.remove(passenger);
        System.out.println("Passenger: " + passenger.getName() + " removed successfully");
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

    /**
     * 
     * Prints the itinerary of the travel package.
     */
    public void printItinerary() {
        System.out.println("Travel Package: " + name);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getName());
            System.out.println("List of Activities in this location");
            for (Activity activity : destination.getActivities()) {
                System.out.println("Activity: " + activity.getName());
                System.out.println("Description: " + activity.getDescription());
                System.out.println("Cost: " + activity.getCost());
                System.out.println("Capacity: " + activity.getCapacity());
                System.out.println("----------------------");
            }
            System.out.println("*-----------------------*");
            System.out.println("*-----------------------*");
        }
    }

    /**
     * 
     * Prints the list of passengers in the travel package.
     */
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
        System.out.println("*-----------------------*");

    }

    /**
     * 
     * Retrieves the available activities in the travel package.
     */
    public void getAvailableActivities() {
        System.out.println("*-----------------------*");
        System.out.println("Available Activities:");
        for (Destination destination : itinerary) {
            if (destination.getActivities().size() == 0)
                continue;
            System.out.println("Destination: " + destination.getName());
            for (Activity activity : destination.getActivities()) {
                int availableSpaces = activity.getCapacity() - activity.getPassengers().size();
                if (availableSpaces > 0) {
                    System.out.println("Activity: " + activity.getName());
                    System.out.println("Description: " + activity.getDescription());
                    System.out.println("Available Spaces: " + availableSpaces);
                    System.out.println("---------------------");
                }
            }
        }
        System.out.println("*-----------------------*");
    }
}