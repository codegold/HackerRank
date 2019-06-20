package JavaSubstringCompressions;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SolutionAnother {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int k = scan.nextInt();
        SortedSet<String> mySet = new TreeSet<String>();
        /*
        TreeSet automatically sorts the values so you just need
        to feed the strings into the TreeSet and once you are
        done with that, simply return first and last element.
        */

        for (int i = 0; i < str.length() - k; i++) {
            mySet.add(str.substring(i, i + k));
            //in first iteration, str.substring(0,3) = abc in second
            //iteration, str.subtring(1,4) = bcd so on...
        }
        System.out.println(mySet.first());
        System.out.println(mySet.last());
    }
}
