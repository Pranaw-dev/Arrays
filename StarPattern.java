import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        int cols = 2 * n - 1; // Number of columns to maintain symmetry

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cols; j++) {
                // Condition to print stars in a symmetric pattern
                if (j >= (cols / 2 - i) && j <= (cols / 2 + i)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); // Move to next line
        }
        scanner.close();
    }
}
