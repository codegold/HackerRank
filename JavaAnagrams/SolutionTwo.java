package JavaAnagrams;
import java.util.Scanner;


public class SolutionTwo {
    static boolean isAnagramTwo(String a, String b) {
        // Complete the function
        if (a.length() != b.length()){
            return false;
        }
        int[] letters = new int[256];

        char[] a_array = a.toCharArray();
        for(char c: a_array) {
            a_array[c]++;
        }

        for (int i = 0; i < b.length(); i++) {
            int c = b.charAt(i);
            if (--letters[c] < 0) {
                return false;
            }

        } return true;
    }



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagramTwo(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

