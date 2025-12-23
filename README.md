
# Custom Vector Implementation in Java

This project is a **from-scratch implementation of a vector (dynamic array)** in Java.
It is built to Simulate how vectors work internally, including **dynamic resizing, memory management, and index handling**.

---

## Features
- Dynamic resizing (capacity doubles when full)
- `push_back` – add element to the end
- `pop_back` – remove last element
- `get(index)` – access element by index with bounds checking
- `print` – display all elements
- Menu-driven console interface

---

##  Why This Project?
Java provides `ArrayList`, but this project recreates similar behavior **without using Java Collections** to simulate:
- How dynamic arrays grow
- Difference between `size` and `capacity`
- Common off-by-one errors
- Amortized time complexity

---

## Technologies Used
- Java
- Command Line / Terminal
- Git & GitHub

---

## :open_file_folder: Project Structure
vectorImpl.java
 - vector → Core dynamic array implementation
 - vectorImpl → Driver class with menu-based interaction
 
 ## ▶️ How to Run
 
 # Compile
 javac vectorImpl.java
 # Run
 java vectorImpl
