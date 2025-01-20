# Java Exceptions Exercises

This repository contains exercises designed to practice exception handling in Java, including custom exceptions and robust input validation. Below are the details of each exercise, grouped by level.

---

## **Level 1**

### **Exercise 1: Product and Sale**
- Create a `Producte` class with attributes `nom` (name) and `preu` (price).
- Create a `Venda` class with:
  - A collection of `Producte` objects.
  - An attribute `preuTotal` (total price) for the sale.
- The `Venda` class includes a method `calcularTotal()`:
  - If the collection is empty, throw a custom exception `VendaBuidaException` with the message: *"Per fer una venda primer has d’afegir productes"* (To make a sale, you must first add products).
  - If the collection has products, calculate the total price of all products and store it in `preuTotal`.
- The custom exception `VendaBuidaException` inherits from `Exception` and should display the error message using `getMessage()`.
- Write code to generate and capture an `IndexOutOfBoundsException`.

---

## **Level 2**

### **Exercise 1: Input Validation**
- Create a class `Entrada` to handle various exceptions that can occur when reading data from the console using the `Scanner` class.
- Implement static methods to read different data types:
  - **Handle `InputMismatchException`:**
    - `public static byte llegirByte(String missatge)`
    - `public static int llegirInt(String missatge)`
    - `public static float llegirFloat(String missatge)`
    - `public static double llegirDouble(String missatge)`
  - **Handle custom exceptions:**
    - `public static char llegirChar(String missatge)`
    - `public static String llegirString(String missatge)`
    - `public static boolean llegirSiNo(String missatge)`:
      - Return `true` if the user inputs "s".
      - Return `false` if the user inputs "n".
- Ensure that:
  - If an invalid value is entered, show an appropriate error message (e.g., *"Error de format"*).
  - Prompt the user until valid input is provided.

---

This repository focuses on mastering exception handling in Java by implementing custom exceptions, managing built-in exceptions, and creating robust user input validation mechanisms.
