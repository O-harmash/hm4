package if_else;

import java.util.Scanner;

public class CompareNames {
    /*
    Enter and reed two names from the console
    Implement method which prints:
    If names are the same - "Names are the same"
    If names are different but length them are the same - "Length of names are the same"
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two names:");
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();

        printComparisonNameResult(firstName.trim(), secondName.trim());
        scanner.close();
    }

    private static void printComparisonNameResult(String firstName, String secondName) {
        int firlen = firstName.length();
        int seclen = secondName.length();
        if (firlen == seclen){
            System.out.println("Length of names are the same");
            if (firstName.equals(secondName)) {
                System.out.println("Names are the same");
            }

        }

            //Implement me
    }
}
