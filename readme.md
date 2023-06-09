# Travel Agency(LLD)

This software system allows travel agencies to maintain their travel packages' itinerary and passengers. It provides functionality to manage travel packages, destinations, activities, and passenger sign-ups.

## Features

- Create and manage travel packages with a name, passenger capacity, and itinerary.
- Define destinations within a travel package, each with a name and a list of activities available.
- Specify activities with a name, description, cost, and capacity. Each activity is associated with a destination.
- Passengers can sign up for activities at different destinations within a travel package.
- Support for different passenger types: Standard, Gold, and Premium.
  - Standard passengers have a balance, and the cost of activities is deducted from their balance.
  - Gold passengers receive a 10% discount on activity costs.
  - Premium passengers can sign up for activities for free.
- View and manage the itinerary of a travel package, including destinations and activity details.
- Print passenger lists for a travel package, including capacity, enrollment count, and individual passenger details.
- Print details of individual passengers, including their activities and payment information.
- View available activities and their remaining capacity.

## Usage

The system provides the following classes:

- `TravelPackage`: Represents a travel package with a name, passenger capacity, and list of destinations.
- `Destination`: Represents a destination within a travel package with a name and a list of activities.
- `Activity`: Represents an activity available at a destination with a name, description, cost, capacity, and associated participants.
- `Passenger`: Represents a passenger with a name, passenger number, and sign-up information for activities.

To use the system, you can follow these steps:

1. Create a new instance of `TravelPackage` with the desired name and passenger capacity.
2. Add destinations to the travel package using the `addDestination` method of `TravelPackage`.
3. For each destination, create `Activity` objects with the desired details and add them to the destination using the `addActivity` method of `Destination`.
4. Create `Passenger` objects with the passenger's name and number.
5. Allow passengers to sign up for activities by invoking the `signUpForActivity` method of the desired passenger and providing the corresponding activity object.
6. Retrieve information about the travel package, destinations, passengers, and activities using the available getter methods.
7. Print the itinerary, passenger lists, activity details, and available spaces to display relevant information to the user.

## Design Patterns Used

- Factory Method Pattern: Used to create instances of different passenger types (`StandardPassenger`, `GoldPassenger`, `PremiumPassenger`) using the `PassengerFactory` class.
- Strategy Pattern: Each passenger type represents a different strategy for signing up and paying for activities.
- Composite Pattern: The composition of travel packages with destinations and activities allows for a hierarchical structure to represent the itinerary.
- Iterator Pattern: The `TravelPackage` class can provide an iterator to iterate over the list of passengers.

## Unit Testing

Unit tests have been written for each class to ensure the correctness of the implementation. The JUnit framework is used for unit testing the classes.
