package models;

/**
 * Class representing a cargo vehicle.
 */
public class CargoVehicle extends Vehicle {
    private double loadCapacity; // Load capacity in tons

    // Constructor
    public CargoVehicle(String licensePlate, String brand, String model, double rentalPricePerDay, double loadCapacity) {
        super(licensePlate, brand, model, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
    }

    // Getter and Setter
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayVehicleInfo() {
        System.out.println("Cargo Vehicle - License Plate: " + licensePlate);
        System.out.println("Brand: " + brand + ", Model: " + model);
        System.out.println("Rental Price per Day: $" + rentalPricePerDay);
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
