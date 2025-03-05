# Project Instructions: Object-Oriented Programming - Rent-a-Car System

## Problem Statement
Rent-a-Car BriefDrive, currently undergoing modernization, requires a **desktop application** to store and manage vehicle rental information. The system must differentiate between **cargo** and **passenger vehicles**, each with unique characteristics such as **load capacity** and **number of passengers**.

## Requirements
1. **Unique Vehicle Identification**: Each vehicle must have a **unique license plate**.
2. **Class Structure & Inheritance**:
   - Implement an **abstract parent class** for vehicles.
   - Create **two child classes** for **cargo** and **passenger vehicles**.
3. **Methods**:
   - Implement methods to **display vehicle details** based on type.
   - Include **constructors (empty & parameterized), getters, and setters**.
4. **Invoice Calculation**:
   - Implement an **interface** to calculate rental invoices with **IVA (19%)** and **discounts**:
     - **Cargo Vehicle Discount: 3%**
     - **Passenger Vehicle Discount: 7%**
5. **Vehicle Management**:
   - Develop an **auxiliary class** to:
     - Validate unique license plates.
     - List available vehicles.
     - Filter rentals based on rental duration (7 days or more).
6. **Data Handling**:
   - Store vehicle data in **collections**.
   - Implement **file handling (BufferedReader & FileWriter)** for **data persistence**.
7. **Multithreading & Synchronization**:
   - Optimize data loading & validation using **multithreading**.
   - Apply **synchronization mechanisms** to avoid concurrency issues.
8. **User Interface**:
   - Implement a **graphical user interface (GUI)** for vehicle management.
   - Handle **user events** such as selections and button clicks.

## Development Environment
- The project must be developed using **Apache NetBeans**.
- The final submission should include:
  - A **zipped folder** containing the **complete source code**.
  - A **video demonstration** explaining the code and software functionality.

## How to Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Programacion-Orientada-en-Objetos.git
   cd Programacion-Orientada-en-Objetos
   ```
2. Compile the project in **NetBeans**.
3. Run the application through `Main.java`.
