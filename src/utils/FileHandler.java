package utils;

import models.Vehicle;
import java.io.*;
import java.util.List;

/**
 * Class for handling file operations for vehicle data persistence.
 */
public class FileHandler {

    private static final String FILE_NAME = "vehicles.txt";

    /**
     * Saves vehicle data to a file.
     * @param vehicles List of vehicles to save.
     */
    public static void saveToFile(List<Vehicle> vehicles) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Vehicle vehicle : vehicles) {
                writer.write(vehicle.getLicensePlate() + "," + vehicle.getBrand() + "," + vehicle.getModel() + "," + vehicle.getRentalPricePerDay());
                writer.newLine();
            }
            System.out.println("Data successfully saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    /**
     * Loads vehicle data from a file.
     */
    public static void loadFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Loaded Vehicle: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}
