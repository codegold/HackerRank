package Day6;
import java.util.Scanner;

public class SolutionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intScan = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i <= intScan; i++) {
            String stringScan = scanner.nextLine();
            printWithSpacesOddEven(stringScan.toCharArray());
        }
    }
    public static void printWithSpacesOddEven(char[] myCharArray) {
        for (int i = 0; i < myCharArray.length; i+=2) {
            System.out.print(myCharArray[i]);
        }
        System.out.print(" ");

        for (int i = 1; i < myCharArray.length; i+=2) {
            System.out.print(myCharArray[i]);
        }
        System.out.println();
    }

}
