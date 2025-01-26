  
  import java.util.Scanner;

public class UserInput2DArray {
    public static void main(String[] args) {
        // Declare a 2D array of size 10 by 10
        int[][] userInputs = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        // Loop to accept input from the user
        for (int i = 0; i < userInputs.length; i++) {
            for (int j = 0; j < userInputs[i].length; j++) {
                System.out.print("Enter input for index [" + i + "][" + j + "]: ");
                userInputs[i][j] = scanner.nextInt(); // Accept input from the user
            }
        }

        // Using a for-each loop to print out the input entered by the user
        System.out.println("\nYou entered the following inputs:");
        for (int[] row : userInputs) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner
        scanner.close();
    }
}

