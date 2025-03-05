package models;

/**
 * Abstract class representing a general vehicle.
 */
public abstract class Vehicle {
    protected String licensePlate;
    protected String brand;
    protected String model;
    protected double rentalPricePerDay;

    // Constructor
    public Vehicle(String licensePlate, String brand, String model, double rentalPricePerDay) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    // Getters and Setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        this.rentalPricePerDay = rentalPricePerDay;
    }

    // Abstract method to display vehicle details
    public abstract void displayVehicleInfo();
}
