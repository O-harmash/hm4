package if_else;

import java.util.Scanner;

public class SortOfThree {
    /*
    Enter and reed three numbers from the console
    Implement method which prints them from highest to lowest
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        printFromHighestToLowest(one, two, three);
        scanner.close();
    }

    private static void printFromHighestToLowest(int a, int b, int c) {
        if (a>=b && b>=c){
            System.out.println(a+ " " + b + " " +c);
        }
        else if (a>=c && c>=b){
            System.out.println(a+ " " + c + " " +b);
        }
        else if (c>=a && a>=b){
            System.out.println(c+ " " + a + " " +b);
        }
        else if (c>=b && b>=a){
            System.out.println(c+ " " + b + " " +a);
        }
        else if (b>=a && a>=c){
            System.out.println(b+ " " + a + " " +c);
        }
        else if (b>=c && c>=a){
            System.out.println(b+ " " + c + " " +a);
        }

//Implement me
    }
}
