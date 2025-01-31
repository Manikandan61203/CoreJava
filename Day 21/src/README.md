Project Overview

The Student Management System is a Java-based CLI application that efficiently manages student records with JSON-based data persistence. It allows users to add, update, search, delete, filter, and sort student details while ensuring data is stored and retrieved automatically. The system uses TreeMap to keep records sorted by ID and Java 8 features like Streams and Lambda Expressions for efficient data handling. Multithreading ensures smooth background data-saving, while input validation and exception handling enhance reliability. This project serves as a great foundation for learning backend development, focusing on file handling, data processing, and concurrent programming.


Key Features of the Student Management System

-> Student Management Operations – Allows adding, viewing, updating, deleting, and searching student records efficiently.

-> JSON-based Data Persistence – Automatically saves and retrieves student data in a structured JSON format.

-> Sorting and Filtering – Sort students by name or age and filter them based on grades.

-> Multithreading for Data Saving – Ensures smooth operation by saving data in the background without affecting user experience.

-> TreeMap for Sorted Storage – Maintains student records in sorted order based on student IDs.

-> Java 8 Features – Uses Streams, Lambda Expressions, Method References, and Optional to optimize performance and readability.

-> Exception Handling & Input Validation – Prevents errors by validating inputs and handling exceptions gracefully.

-> User-friendly CLI Interface – Provides an interactive, menu-driven system for ease of use.

Technologies Used

The project is built using Java 8+, utilizing Streams, Lambda Expressions, and Functional Interfaces for efficient data processing. The Jackson Library is employed for JSON parsing and serialization. The system leverages multithreading for background data saving, ensuring a responsive interface. The TreeMap data structure is used instead of a HashMap to maintain the natural order of student records, providing an organized and structured dataset.

Project Structure

The project consists of three main Java classes. The StudentManagementSystem class serves as the entry point and provides the CLI interface. The Student class acts as a model for student records, encapsulating attributes such as ID, Name, Age, Grade, and Email. The AccessData class contains all the core operations, including CRUD functionalities, sorting, filtering, and JSON file handling. Additionally, a StudentData.JSON file is used to store student records persistently, ensuring data is retained between sessions.

How to Run

To run the system, ensure that Java 8+ is installed along with the Jackson Databind Library for JSON handling. The program can be compiled and executed via the command line or an integrated development environment (IDE) such as IntelliJ IDEA or Eclipse. Upon launching, users will be presented with a menu-driven interface where they can select operations by entering the corresponding number. The program will execute the selected operation and prompt the user for any necessary input.

JSON Storage Format

The student records are stored in a JSON file, where each student entry is identified by a unique student ID as the key. The data is formatted using pretty-printing to enhance readability. The JSON file structure ensures that records are stored line by line, making it easier to process and retrieve data. By using a TreeMap, the records are stored in sorted order based on student ID, ensuring an organized dataset. The retrieval process automatically loads the data from the JSON file into memory when the application starts, allowing seamless access to student records.

