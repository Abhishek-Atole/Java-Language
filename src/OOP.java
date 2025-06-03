// Importing the Scanner class from java.util package for user input
import java.util.*;

// Class definition for Arithmetic operations
class Arithmetic {

    // Instance variables to hold the two numbers
    public int value1;
    public int value2;

    // Parameterized constructor to initialize value1 and value2
    public Arithmetic(int a, int b) {
        this.value1 = a;  // Assigning parameter 'a' to instance variable 'value1'
        this.value2 = b;  // Assigning parameter 'b' to instance variable 'value2'
    }

    // Method to perform addition
    public int addition() {
        int result = this.value1 + this.value2;  // Calculate sum
        return result;  // Return result
    }

    // Method to perform subtraction
    public int subtraction() {
        int result = this.value1 - this.value2;  // Calculate difference
        return result;  // Return result
    }

    // (Optional) Method to perform multiplication
    public int multiplication() {
        int result = this.value1 * this.value2;
        return result;
    }

    // (Optional) Method to perform division
    public int division() {
        if (this.value2 != 0) {
            return this.value1 / this.value2;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}

// Main class
public class OOP {

    // Entry point of the program
    public static void main(String[] args) {

        // Variable declarations
        int no1 = 0, no2 = 0, ans = 0;

        // Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter the first number
        System.out.print("Enter the first number: ");
        no1 = scanner.nextInt();  // Read integer input

        // Asking the user to enter the second number
        System.out.print("Enter the second number: ");
        no2 = scanner.nextInt();  // Read integer input

        // Creating an object of Arithmetic class using the constructor
        Arithmetic arithmeticObject = new Arithmetic(no1, no2);

        // Performing addition and printing the result
        ans = arithmeticObject.addition();
        System.out.println("Addition is: " + ans);

        // Performing subtraction and printing the result
        ans = arithmeticObject.subtraction();
        System.out.println("Subtraction is: " + ans);

        // (Optional) Performing multiplication and printing the result
        ans = arithmeticObject.multiplication();
        System.out.println("Multiplication is: " + ans);

        // (Optional) Performing division and printing the result
        ans = arithmeticObject.division();
        System.out.println("Division is: " + ans);

        // Closing the scanner object to release resources
        scanner.close();
    }
}
