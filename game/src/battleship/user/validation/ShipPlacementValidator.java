package battleship.user.validation;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShipPlacementValidator {
    Scanner input = new Scanner(System.in);

    public int getRow() {
        int row = -1; // Initialize to an invalid value
        boolean validInput = false; // Flag to check for valid input

        // Loop until a valid row value is entered
        while (!validInput) {
            System.out.print("Enter a valid row (1):");
            try {
                // Read the user's input and store it in the row variable
                row = input.nextInt();

                // Check if the entered value is equal to 1
                if (row == 1) {
                    validInput = true; // Set the flag to true if input is valid
                } else {
                    // If the input is invalid, display an error message
                    System.out.println("Invalid row. Please try again.");
                }
            } catch (InputMismatchException e) {
                // If the input is not an integer, show an error message
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Clear the invalid input
            }
        }

        // Return the entered row value (which will be 1 in this case)
        return row;
    }

    public int getColumn() {
        int column = -1; // Initialize to an invalid value
        boolean validInput = false; // Flag to check for valid input

        // Loop until a valid row value is entered
        while (!validInput) {
            System.out.print("Enter a valid column (2):");
            try {
                // Read the user's input and store it in the column variable
                column = input.nextInt();

                // Check if the entered value is equal to 1
                if (column == 1) {
                    validInput = true; // Set the flag to true if input is valid
                } else {
                    // If the input is invalid, display an error message
                    System.out.println("Invalid column. Please try again.");
                }
            } catch (InputMismatchException e) {
                // If the input is not an integer, show an error message
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // Clear the invalid input
            }
        }

        // Return the entered row value (which will be 1 in this case)
        return column;
    }
}
