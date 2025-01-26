public class assignment1b {
     public static void main(String[] args) {
  int height = 9; // Height of the flag
  int width = 3;  // Width of the flag (3 columns)

  for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
          if (j == 0 || j == 2) {
              System.out.print("G "); // Green
          } else {
              System.out.print("W "); // White
          }
      }
      System.out.println(); // Move to the next line after each row
  }
}
}