package ch.tbz;

import static java.lang.System.*; // System-IO Library for abbreviation purpose to static functions
import static java.lang.Math.*; // Mathematic Library for abbreviation purpose to static functions+
import static ch.tbz.lib.Input.*; // Import Input methods

public class KN_I1_SerieAa_Donart_Marco {

    // Main function which runs the program
    public static void main(String[] args) {

        while (true) { // Loop for continuing calculation until the user says "no"
            // Title
            System.out.println("What do you want to calc? +, -, * or / ?");

            // Input for operation
            String operation = inputString(""); // Empty string, no "User enters"

            // Input for numbers
            double a = inputDouble("Enter the first number: ");
            double b = inputDouble("Enter the second number:");

            // Calculation and result based on the operation
            double c = 0;

            switch (operation) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "*":
                    c = a * b;
                    break;
                case "/":
                    if (b != 0) {
                        c = a / b;
                    } else {
                        out.println("Error: Division by zero is not allowed.");
                        continue; // Skip to the next iteration if division by zero occurs
                    }
                    break;
                default:
                    out.println("Invalid operation!");
                    continue; // Skip to the next iteration if the operation is invalid
            }

            // Round the result to one decimal place
            c = Math.round(c * 10.0) / 10.0;

            // Output result (with one decimal place)
            out.println("Result is: " + c);

            // Ask if the user wants to calculate again
            String again = inputString("Do you want to calculate again? (Yes or No) ");

            // Check if the user entered "no", if so exit the loop
            if (again.equalsIgnoreCase("no")) {
                out.println("Okay, goodbye!");
                break; // Exit the loop and the program
            }
        }
    }
}
