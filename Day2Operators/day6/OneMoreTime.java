package day6;

import java.util.Scanner;

public class OneMoreTime {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int tries = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < tries; i++) {
            String subString = scanner.nextLine();
            printOdssEven(subString.toCharArray());
        }
        scanner.close();
    }

    private static void printOdssEven(char[] chars) {
        for (int i = 0; i < chars.length; i += 2) {
            System.out.print(chars[i]);
        }
        System.out.print(" ");
        for (int j = 1; j < chars.length; j += 2) {
            System.out.print(chars[j]);
        }
        System.out.println();
    }

}

