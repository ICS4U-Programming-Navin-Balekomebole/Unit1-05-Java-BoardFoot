import java.util.Scanner;
/**
* This program calculates the length of a board.
*
* @author  Navin Balekomebole
* @version 1.0
* @since   2023-03-06
*/

public final class BoardFoot {
    /**
    * For style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private BoardFoot() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Print the messages.
    *
    * @param args Unused
    */
    public static void main(String[] args) {
        // This section declare variables.
        String stringInput = "";
        double width = 0;
        double height = 0;
        double length = 0;
        try {
            // This section asks the user to enter the width
            // and height of the board
            System.out.println("Enter the width of the board in inches: ");
            final Scanner line = new Scanner(System.in);
            stringInput = line.nextLine();
            // This section changes from string to double
            width = Double.parseDouble(stringInput);

            System.out.println("Enter the height of the board in inches: ");
            final Scanner newLine = new Scanner(System.in);
            stringInput = line.nextLine();
            // This section changes from string to double
            height = Double.parseDouble(stringInput);

            // This section verifies for negative inputs.
            if (height <= 0 || width <= 0) {
                System.out.println("Error, your input must be positive.");
            } else {
                // This section calculates the length needed for 1 board foot
                length = calculateBoardFoot(width, height);

                // This section outputs the result or the answer.
                System.out.print("To make 1 board foot, ");
                System.out.format("the length is %.2f inches.%n", length);
            }
        } catch (NumberFormatException err) {
            System.out.println("Error. Invalid input.");
        }
    }

    /**
    * This function does the math necessary for the program.
    *
    * @param width of board
    * @param height of board
    * @return functionLength
    */
    public static double calculateBoardFoot(double width, double height) {
        // 1 board foot in cubic inches.
        final double volume = 144.0;

        // Calculate the length.
        final double functionLength = volume / (width * height);

        return functionLength;
    }
}
