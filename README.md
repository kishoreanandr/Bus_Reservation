Bus Booking System

A simple Java application that simulates a bus booking system. This project demonstrates object-oriented programming (OOP) concepts such as classes, encapsulation, inheritance, and polymorphism, as well as collections like `ArrayList` for managing bus and booking data.

Features
1. Bus Management: View details of available buses, including bus number, AC type, and capacity.
2. Passenger Booking: Allows passengers to book tickets for a specific bus on a particular date.
3. Capacity Management: Ensures bookings do not exceed the bus capacity for the chosen date.
4. Real-time Updates: Updates bus availability dynamically based on bookings.

---

## How It Works

### Classes Used
1. **`Bus`**:
   - Represents a bus with attributes like `bus_no`, `ac` (AC or non-AC), and `capacity`.
   - Contains methods to:
     - Get and set bus capacity.
     - Check if the bus is AC or non-AC.
     - Display bus details.

2. **`passanger_details`**:
   - Represents a passenger booking with attributes like `passenger_name`, `bus_no`, and `date`.
   - Includes methods to:
     - Collect passenger details interactively via console input.
     - Check the availability of seats for the requested bus and date.

3. **`Main_bus`**:
   - The entry point of the application.
   - Manages the list of buses and bookings using `ArrayList`.
   - Provides options to the user to book a ticket or exit.

---

### Program Flow

1. **Initialize Buses**:
   - Four buses are predefined with various capacities and AC/non-AC statuses.
   - These buses are displayed to the user at the start.

2. **Booking Tickets**:
   - The user is prompted to book a ticket.
   - Details such as name, bus number, and travel date are collected.
   - The `isAvailable` method checks if the requested bus has available seats on the chosen date:
     - Compares the bus capacity with the number of already booked tickets for that date.

3. **Dynamic Updates**:
   - If the booking is successful, the system confirms the ticket and updates the bookings list.
   - If the bus is fully booked, the user is informed, and they can try another bus or date.

4. **Exit**:
   - The user can exit the program at any time.

---


---

## How to Run the Program
1. Clone the repository or download the code files.
2. Compile and run the `Main_bus` class using a Java IDE or command line:
   ```bash
   javac Main_bus.java
   java Main_bus
   ```
3. Follow the on-screen prompts to:
   - View available buses.
   - Book tickets by providing the required details.
   - Exit the program when done.

---

## Example Output
```
The buses are:
Bus No: 1, AC: false, Total Capacity: 2
Bus No: 2, AC: true, Total Capacity: 40
Bus No: 3, AC: true, Total Capacity: 60
Bus No: 4, AC: false, Total Capacity: 20

Enter 1 to book and 2 to Exit
1
Enter your Name:
John
Enter Bus No:
2
Enter date of travelling(dd-mm-yyyy):
25-12-2024
Congratulations! John Your Ticket is Confirmed

Enter 1 to book and 2 to Exit
2
```

---

## Concepts Demonstrated
1. **Object-Oriented Programming**:
   - Encapsulation: `Bus` and `passanger_details` classes encapsulate their respective data and methods.
   - Abstraction: Simplified bus and booking processes.
   - Polymorphism: Could be extended for different bus types or ticketing systems.

2. **Java Collections**:
   - `ArrayList` used for managing buses and bookings dynamically.

3. **Date Handling**:
   - `SimpleDateFormat` for parsing and formatting dates.
   - `Date` class for comparing travel dates.

---

## Future Enhancements
- Add GUI for better user interaction.
- Implement persistence using a database for storing buses and bookings.
- Introduce cancellation and modification of bookings.
- Add price calculation based on AC type and distance.

---
