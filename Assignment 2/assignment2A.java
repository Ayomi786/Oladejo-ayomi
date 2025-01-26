public class assignment2A {
  public class NigeriaFlagSingleLoop {
    public static void main(String[] args) {
        int height = 9; // Height of the flag
        int width = 3;  // Width of the flag (3 columns)

        for (int i = 0; i < height; i++) {
            // Determine the color based on the row index
            if (i < height / 3 || i >= 2 * (height / 3)) {
                System.out.println("G G G"); // Green stripes
            } else {
                System.out.println("W W W"); // White stripe
            }
        }
    }
}
}
