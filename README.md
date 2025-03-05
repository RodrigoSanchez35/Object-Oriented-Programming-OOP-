# Object-Oriented Programming - Rent-a-Car Management System

## Description
This project is a **desktop application** developed using **Object-Oriented Programming (OOP) principles** in Java. The system is designed for **Rent-a-Car BriefDrive**, enabling efficient management of rental vehicles categorized as either **passenger vehicles** or **cargo vehicles**.

## Features
- **Unique Vehicle Identification**: Ensures each vehicle has a unique license plate.
- **Object-Oriented Design**: Implements **abstract classes**, **inheritance**, and **interfaces** for modular architecture.
- **Vehicle Management**: Allows users to **add, list, and filter vehicles** based on rental duration.
- **Billing System**:
  - Calculates rental invoices with **IVA (19%)** and applicable **discounts**.
  - **Discounts**:
    - **Cargo Vehicles**: 3%
    - **Passenger Vehicles**: 7%
- **Exception Handling**: Uses `try-catch` blocks to prevent runtime errors.
- **Multithreading**: Implements **concurrent processing** for efficient data handling.
- **File Handling**: Reads/writes vehicle records using external files.
- **Graphical User Interface (GUI)**: Provides an intuitive interface for interaction.

## Technologies Used
- **Language**: Java
- **Development Environment**: NetBeans IDE
- **Data Structures**: Collections (ArrayList, HashMap)
- **Concurrency**: Multi-threading
- **File I/O**: BufferedReader, FileWriter

## Installation & Execution
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Programacion-Orientada-en-Objetos.git
   cd Programacion-Orientada-en-Objetos
   ```
2. Open the project in **NetBeans IDE**.
3. Compile and run the project:
   ```bash
   javac -d bin src/*.java
   java -cp bin Main
   ```

## Example Usage
```
=== Rent-a-Car BriefDrive ===
1. Add a Vehicle
2. List All Vehicles
3. Show Rental Invoice
4. Display Long-Term Rentals
5. Exit
Select an option: 1

Enter Vehicle Type (Passenger/Cargo): Passenger
Enter License Plate: ABC123
Enter Rental Duration (days): 10
Vehicle Added Successfully!

Select an option: 3
Vehicle: ABC123
Rental Duration: 10 days
Base Cost: $500
IVA (19%): $95
Discount (7%): -$35
Total Amount: $560
```

## License
This project is licensed under the MIT License. See the `LICENSE` file for details.

## Author
- **Rodrigo Sánchez** - Software Development Student at Duoc UC
