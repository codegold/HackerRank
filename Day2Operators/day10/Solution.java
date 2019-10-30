package day10;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    //public static int[] binaryArray = {1, 2, 4, 8, 16, 32, 64, 128};
    //static Scanner scanner = new Scanner(System.in);
    //static int myScan = scanner.nextInt();


    public static void convertToBin(int num) {
        int index = 0;
        int binary[] = new int[40];
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

    }

    public static void main(String[] args) {
        convertToBin(124);
        System.out.println();
        System.out.println(Integer.toBinaryString(124));
    }



}
