import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        // Declare an array of length 10
        String[] userInputs = new String[10];
        Scanner scanner = new Scanner(System.in);

        // Loop to accept input from the user
        for (int i = 0; i < userInputs.length; i++) {
            System.out.print("Enter input for index " + i + ": ");
            userInputs[i] = scanner.nextLine(); // Accept input from the user
        }

        // Using a for-each loop to print out the input entered by the user
        System.out.println("\nYou entered the following inputs:");
        for (String input : userInputs) {
            System.out.println(input);
        }

        // Close the scanner
        scanner.close();
    }
}