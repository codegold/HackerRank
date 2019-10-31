package day10;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    static int[] arrToKeepNums = new int[20];

    public static void convertToBin(int n) {
        int counter = 0;

        while (n > 0) {
            arrToKeepNums[counter++] = n % 2;
            n = n / 2;
        }
        for (int i = counter - 1; i >= 0; i--) {
            System.out.print(arrToKeepNums[i]);
        }
        System.out.println();
        System.out.println("my");
    }

    public static void convertToBinAndCountOnes(int n) {
        int counter = 0, tail = 0, sequence = 0;
        while (n > 0) {
            tail = n % 2;
            n = n / 2;
            if(tail == 1) {
                sequence++;
                if (sequence >= counter) {
                    counter = sequence;
                }
            } else sequence = 0;
        }
        System.out.print(counter);
    }


    public static void main(String[] args) {
        convertToBin(150);
        System.out.println(Integer.toBinaryString(150));
        System.out.println(Integer.toBinaryString(13));
        convertToBinAndCountOnes(150);

    }
}
