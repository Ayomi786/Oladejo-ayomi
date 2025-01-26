public class assignment1A {
    public static void main(String[] args) {
        int height = 9; // Height of the flag
        int width = 3;  // Width of the flag (3 columns)

        for (int i = 0; i < height; i++) {
            if (i < height / 3 || i >= 2 * (height / 3)) {
                System.out.print("G "); // Green
            } else {
                System.out.print("W "); // White
            }
        }
    }
}