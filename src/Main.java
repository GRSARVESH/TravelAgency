import Enum.PassengerType;
import Models.Passenger;
import Models.Activity;
import Models.Destination;
import Models.Package;
import Factory.PassengerFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to XYZ Travel Agency");
        System.out.println("*******************************");
        Passenger standardPassenger = PassengerFactory.createPassenger(PassengerType.STANDARD, "John", 1, 0.0);
        Passenger goldPassenger = PassengerFactory.createPassenger(PassengerType.GOLD, "Alice", 2, 200.0);
        Passenger premiumPassenger = PassengerFactory.createPassenger(PassengerType.PREMIUM, "Bob", 3, 0);
        Destination bengaluru = new Destination("Bengaluru");
        Destination kerala = new Destination("Kerala");
        Package travelPackage = new Package("Summer", 2);
        Activity skydiving = new Activity("skydiving", "jump from the sky", 70.00, 1);
        Activity scubadiving = new Activity("scubadiving", "jump into the water", 100.00, 2);
        skydiving.addPassenger(standardPassenger);
        skydiving.addPassenger(goldPassenger);
        skydiving.addPassenger(premiumPassenger);
        scubadiving.addPassenger(premiumPassenger);
        kerala.addActivity(skydiving);
        kerala.addActivity(scubadiving);
        kerala.addActivity(scubadiving);
        travelPackage.addDestination(bengaluru);
        travelPackage.addDestination(kerala);
        travelPackage.printItinerary();
        travelPackage.getAvailableActivities();
        travelPackage.getPassengers();
    }
}
