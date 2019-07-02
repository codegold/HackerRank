package Day6;

import java.util.Scanner;

public class SolutionTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intScan = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= intScan; i++) {
            String scanString = scan.nextLine();
            printEvenSpaceOdd(scanString.toCharArray());
        }
    }

    private static void printEvenSpaceOdd(char[] myCharArray) {

        for (int i = 0; i < myCharArray.length; i += 2) {
            System.out.print(myCharArray[i]);
        }
        System.out.print(" ");
        for (int i = 1; i < myCharArray.length; i += 2) {
            System.out.print(myCharArray[i]);
        }
        System.out.println();
    }
}
