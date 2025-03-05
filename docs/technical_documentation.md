# Technical Documentation: Object-Oriented Programming - Rent-a-Car System

## Project Overview
This project implements a **vehicle rental system** using **object-oriented programming (OOP)** principles. It includes **inheritance, interfaces, file handling, and multithreading**.

## Code Structure
### 1. **Model Layer (`models/`)**
- `Vehicle.java` → **Abstract parent class** containing common attributes and methods.
- `PassengerVehicle.java` → **Child class** for passenger vehicles.
- `CargoVehicle.java` → **Child class** for cargo vehicles.
- `Rentable.java` → **Interface** defining the invoice calculation method.

### 2. **Utility Classes (`utils/`)**
- `VehicleManager.java` → Handles vehicle registration, unique validation, and filtering.
- `FileHandler.java` → Manages **reading/writing vehicle data** to external files.

### 3. **User Interface (`ui/`)**
- `MainGUI.java` → Provides a **graphical interface** for managing vehicle rentals.

### 4. **Main Entry (`Main.java`)**
- Controls the **program flow** and calls the necessary components.

## Key Features
- **Encapsulation & Abstraction** → Classes follow **OOP best practices**.
- **File Handling** → Data is stored persistently using **BufferedReader/FileWriter**.
- **Multithreading** → Improves **performance** in data validation.
- **GUI Implementation** → Enables **interactive vehicle management**.

## Expected Output Example
```
=== Rent-a-Car BriefDrive ===
1. Register Vehicle
2. List Available Vehicles
3. Generate Invoice
4. Exit
Select an option: 1

Enter License Plate: ABC-123
Enter Vehicle Type (Cargo/Passenger): Passenger
Enter Number of Passengers: 5

Vehicle Registered Successfully!
```

## How to Run the Project
1. Open the project in **NetBeans**.
2. Compile and execute `Main.java`.
