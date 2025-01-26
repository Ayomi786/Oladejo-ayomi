public class assignment2b {
  public class NigeriaFlagNestedLoop {
    public static void main(String[] args) {
        int height = 9; // Height of the flag
        int width = 3;  // Width of the flag (3 columns)

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Determine the color based on the row index
                if (i < height / 3 || i >= 2 * (height / 3)) {
                    System.out.print("G "); // Green
                } else {
                    System.out.print("W "); // White
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
}
