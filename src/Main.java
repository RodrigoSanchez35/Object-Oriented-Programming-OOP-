import models.Vehicle;
import models.PassengerVehicle;
import models.CargoVehicle;
import utils.VehicleManager;
import java.util.Scanner;

/**
 * Main class for running the vehicle rental system.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleManager manager = new VehicleManager();

        boolean running = true;

        while (running) {
            System.out.println("=== Rent-a-Car BriefDrive ===");
            System.out.println("1. Register Vehicle");
            System.out.println("2. List Vehicles");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");
            
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter License Plate: ");
                    String plate = scanner.nextLine();
                    System.out.print("Enter Brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter Rental Price per Day: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter Vehicle Type (Cargo/Passenger): ");
                    String type = scanner.nextLine();

                    Vehicle vehicle;
                    if (type.equalsIgnoreCase("Cargo")) {
                        System.out.print("Enter Load Capacity (in tons): ");
                        double capacity = scanner.nextDouble();
                        vehicle = new CargoVehicle(plate, brand, model, price, capacity);
                    } else {
                        System.out.print("Enter Passenger Capacity: ");
                        int passengers = scanner.nextInt();
                        vehicle = new PassengerVehicle(plate, brand, model, price, passengers);
                    }

                    manager.addVehicle(vehicle);
                    break;

                case 2:
                    manager.listVehicles();
                    break;

                case 3:
                    running = false;
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
