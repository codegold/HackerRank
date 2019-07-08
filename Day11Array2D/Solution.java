package Day11Array2D;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int sum = 0;
        int max = 0;
        int fakeRow = 0;
        int fakeColumn = 0;
        int midColumns = 0;
        int capCons = 1;

        //Hourglasses
        for (int column = 0; column < 4; column++) {
            fakeColumn = column;
            midColumns++;
            capCons++;

            // Limit 3 digits on top and bottom row only
            for (int row = 0; row < 4; row++) {
                sum = 0;
                fakeRow = row;


                //first row (abc)
                for (int k = column; k <= capCons; k++) {
                    sum += arr[fakeRow][k];
                }

                //second row (xdx)
                fakeRow++;
                sum += arr[fakeRow][midColumns];

                //third row (efg)
                fakeRow++;
                for (int k = column; k <= capCons; k++) {
                    sum += arr[fakeRow][k];
                }
                if (column == 0 && row == 0 || sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}

