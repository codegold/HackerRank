package Day10BinaryNumbers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);
    static int count = 0, max = 0;

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (n > 0) {
            convertToBinary(n);
        }

        //scanner.close();
    }

    public static void convertToBinary(int n) {
        if (n < 1) {
            max = (max < count) ? count : max;
            System.out.println(max);
            return;
        }

        if (n % 2 == 1) {
            count += 1;
        } else {
            max = (max < count) ? count : max;
            count = 0;
        }
        convertToBinary(n/2);
    }
}

