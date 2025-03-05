package utils;

import models.Vehicle;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for managing vehicle records.
 */
public class VehicleManager {
    private List<Vehicle> vehicleList;

    // Constructor
    public VehicleManager() {
        this.vehicleList = new ArrayList<>();
    }

    /**
     * Adds a vehicle if the license plate is unique.
     * @param vehicle The vehicle to be added.
     * @return true if the vehicle was added successfully, false otherwise.
     */
    public boolean addVehicle(Vehicle vehicle) {
        for (Vehicle v : vehicleList) {
            if (v.getLicensePlate().equalsIgnoreCase(vehicle.getLicensePlate())) {
                System.out.println("Error: A vehicle with this license plate already exists.");
                return false;
            }
        }
        vehicleList.add(vehicle);
        System.out.println("Vehicle added successfully!");
        return true;
    }

    /**
     * Lists all registered vehicles.
     */
    public void listVehicles() {
        if (vehicleList.isEmpty()) {
            System.out.println("No vehicles registered.");
            return;
        }
        for (Vehicle vehicle : vehicleList) {
            vehicle.displayVehicleInfo();
            System.out.println("------------------------");
        }
    }
}
