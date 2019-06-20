package JavaSubstringCompressions;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


        int size = s.length() - (k - 1);
        String[] strintArr = new String[size];
        int start = 0;
        int finish = k;
        for (int i = 0; i < size; i++) {
            strintArr[i] = s.substring(start, finish);
            start++;
            finish++;

        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < strintArr.length; j++) {
                if (strintArr[i].compareTo(strintArr[j]) > 0) {
                    String temp = strintArr[i];
                    strintArr[i] = strintArr[j];
                    strintArr[j] = temp;
                }
            }
        }
        smallest = strintArr[0];
        largest = strintArr[strintArr.length - 1];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();

        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
        

    }
}
