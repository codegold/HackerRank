package day5;

import java.util.Scanner;

public class Solution {

    public static void simpleMath(int j) {
        int multipl = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(j + " x " + multipl + " = " + (j * multipl));
            multipl++;
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
        scanner.close();
        simpleMath(n);
    }

}