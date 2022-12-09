package while_loop;

public class SSquare {
    /*
    print to console a square 10*10 with 'S'
    using loop while
     */
    public static void main(String[] args) {
        {
            int i = 0;
            while (i++ < 10) {
                int j = 0;
                while (j++ < 10)
                    System.out.print(" S");
                System.out.println();
            }
        }
    }
}
