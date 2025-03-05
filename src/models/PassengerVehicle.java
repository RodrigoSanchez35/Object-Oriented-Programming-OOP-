package models;

/**
 * Class representing a passenger vehicle.
 */
public class PassengerVehicle extends Vehicle {
    private int passengerCapacity;

    // Constructor
    public PassengerVehicle(String licensePlate, String brand, String model, double rentalPricePerDay, int passengerCapacity) {
        super(licensePlate, brand, model, rentalPricePerDay);
        this.passengerCapacity = passengerCapacity;
    }

    // Getter and Setter
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Passenger Vehicle - License Plate: " + licensePlate);
        System.out.println("Brand: " + brand + ", Model: " + model);
        System.out.println("Rental Price per Day: $" + rentalPricePerDay);
        System.out.println("Passenger Capacity: " + passengerCapacity);
    }
}
