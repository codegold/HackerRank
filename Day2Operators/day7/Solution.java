package day7;

import java.util.Scanner;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int quantity = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < quantity; i++) {
            String subStr = scan.nextLine();
            reverseIt(subStr.toCharArray());
        }

        scan.close();

    }
    private static void reverseIt(char[] chars){
        for (int i = chars.length-1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }
}