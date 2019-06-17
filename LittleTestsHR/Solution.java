package LittleTestsHR;

import java.util.Scanner;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Date;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d%n", N, i, N * i);
        }

        scanner.close();

        Date date1 = new Date();
        Date date2 = new Date();

        System.out.println(date1.getTime() < date2.getTime()
                ? "date1 later date2": "date1 earlier date2");
    }
}

