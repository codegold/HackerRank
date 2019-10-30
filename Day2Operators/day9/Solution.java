package day9;

public class Solution {
    public static int factorialOne(int i) {
        int result;
        if (i <= 1) return 1;
        else {
            result = factorialOne(i - 1) * i;
        }
        return result;
    }

    public static int factorialTwo(int i) {
        int result = 1;
        for (int j = 1; j <= i; j++) {
            result *= j;
        }
        return result;
    }

    public static int summation(int i) {
        int result = 0;
        int step = 1;

        for (int j = 1; j <= i; j++) {
            result += j;
            System.out.println("On first step: " + step + " its " + result);
            step++;
        }

        return result;
    }

    public static int exponential(int num, int pow) {
        if (pow <= 0) return 1;
        else return num * exponential(num, pow - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorialOne(5));
        System.out.println(factorialTwo(5));
        System.out.println(summation(5));
        System.out.println("expo time!");
        System.out.println(exponential(5, 3));

    }
}
