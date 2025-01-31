# Student Management System

This project is a Java-based CLI application that efficiently manages student records with JSON-based data persistence. It allows users to add, update, search, delete, filter, and sort student details while ensuring data is stored and retrieved automatically. The system uses TreeMap to keep records sorted by ID and Java 8 features like Streams and Lambda Expressions for efficient data handling. Multithreading ensures smooth background data-saving, while input validation and exception handling enhance reliability. This project serves as a great foundation for learning backend development, focusing on file handling, data processing, and concurrent programming.

## Features

- **Student Management Operations**: Allows adding, viewing, updating, deleting, and searching student records efficiently.
- **JSON-based Data Persistence**: Automatically saves and retrieves student data in a structured JSON format.
- **Sorting and Filtering**: Sort students by name or age and filter them based on grades.
- **Multithreading for Data Saving**: Ensures smooth operation by saving data in the background without affecting user experience.
- **TreeMap for Sorted Storage**: Maintains student records in sorted order based on student IDs.
- **Java 8 Features**: Uses Streams, Lambda Expressions, Method References, and Optional to optimize performance and readability.
- **Exception Handling & Input Validation**: Prevents errors by validating inputs and handling exceptions gracefully.
- **User-friendly CLI Interface**: Provides an interactive, menu-driven system for ease of use.

## Technologies Used

The project is built using **Java 8+**, utilizing **Streams, Lambda Expressions, and Functional Interfaces** for efficient data processing. The **Jackson Library** is employed for JSON parsing and serialization. The system leverages **multithreading** for background data saving, ensuring a responsive interface. Instead of a HashMap, a **TreeMap** data structure is used to maintain the natural order of student records, providing an organized and structured dataset.

## Project Structure

The project consists of three main Java classes:

- **StudentManagementSystem**: Serves as the entry point and provides the **CLI interface**.
- **Student**: Acts as a **model** for student records, encapsulating attributes such as **ID, Name, Age, Grade, and Email**.
- **AccessData**: Contains core functionalities, including **CRUD operations, sorting, filtering, and JSON file handling**.
- **StudentData.JSON**: Stores student records persistently, ensuring data is retained between sessions.

## How to Run

1. **Prerequisites**:
   - Ensure **Java 8+** is installed.
   - Include the **Jackson Databind Library** for JSON handling.

2. **Execution**:
   - Compile and run the program via **command line** or an **IDE** (e.g., IntelliJ IDEA, Eclipse).
   - Upon launching, users will be presented with a **menu-driven interface**.
   - Select an operation by entering the corresponding **menu number**.
   - Follow the prompts to input necessary details.

## JSON Storage Format

- Student records are stored in a **JSON file**, with each entry identified by a **unique student ID** as the key.
- The data is formatted using **pretty-printing** for enhanced readability.
- The **TreeMap** ensures that records are stored in **sorted order based on student ID**.
- The retrieval process **automatically loads the data** into memory at startup, enabling seamless access to student records.
