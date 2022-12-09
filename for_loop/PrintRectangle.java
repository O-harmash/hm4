package for_loop;

import java.util.Scanner;

public class PrintRectangle {
    /*
    Read 2 numbers from console (m & n)
    using for loop
    print to console a rectangle size m * n from 8 numbers

    Example:
    m=2, n=4
    8888
    8888
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of lines and columns: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        // implement here

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("8");
            }
            System.out.println();

        }
    }
}
