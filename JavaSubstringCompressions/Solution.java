package JavaSubstringCompressions;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


        int size = s.length() - (k - 1); //exit from array to avoid OUTofBOUNDS ERROR
        String[] stringArr = new String[size];
        int start = 0;
        int finish = k;
        for (int i = 0; i < size; i++) { //breaks up
            stringArr[i] = s.substring(start, finish); //substring breaks up on substrings
            start++;
            finish++; //move to next subString

        }
        for (int i = 0; i < size - 1; i++) { //13 times makes that printed lower
            for (int j = i + 1; j < stringArr.length; j++) {
                if (stringArr[i].compareTo(stringArr[j]) > 0) {
                    String temp = stringArr[i];
                    stringArr[i] = stringArr[j];
                    stringArr[j] = temp;
                }
            }
        }
        smallest = stringArr[0];
        largest = stringArr[stringArr.length - 1];

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//
//        scan.close();
        String s = "welcometojava"; //13 symbols
        int k = 3;

        System.out.println(getSmallestAndLargest(s, k));


    }
}
