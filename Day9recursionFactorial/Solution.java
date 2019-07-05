package Day9recursionFactorial;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Solution ob=new Solution();
        int result=ob.factorial(n);
        System.out.println(result);
    }
    int factorial(int n)
    {
        if(n<=1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
