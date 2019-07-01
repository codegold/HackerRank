package Day6;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */

        for (int i = new Scanner(System.in).nextInt(); i > 0; i--) {
            String[] myStringArr =
                    {new Scanner(System.in).nextLine(), "", ""};
            for (int j = 0; j < myStringArr[0].length(); j++) {
                if (j % 2 == 0) myStringArr[1] += myStringArr[0].charAt(j);
                else myStringArr[2] += myStringArr[0].charAt(j);
            }
            System.out.println(myStringArr[1] + " " + myStringArr[2]);
        }


    }
}


