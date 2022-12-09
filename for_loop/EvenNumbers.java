package for_loop;

public class EvenNumbers {

    public static void Print100Number() {
        for (int i = 1; i <= 100; i++) {
            if (i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
    /*
    using for loop
    print even number from 1 to 100 include
    from new line
     */
    public static void main(String[] args) {
        Print100Number();
    }
}
