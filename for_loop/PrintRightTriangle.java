package for_loop;

public class PrintRightTriangle {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; ++j) {
                System.out.print("8 ");
            }
            System.out.print("\n");
        }
    }
    /*
    using for loop print right triangle from 8
    with size 10*10

    Example:
    8
    88
    888
    8888
    .....
     */
}
