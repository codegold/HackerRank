package JavaPallindrom;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reversedString = new StringBuffer(A).reverse().toString();
        if (A.equals(reversedString)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }

}