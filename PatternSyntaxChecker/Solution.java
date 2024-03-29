package PatternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.*;

import static javafx.scene.input.KeyCode.Z;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String p1 = in.nextLine();
            try {
                Pattern.compile(p1);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }


        }
    }
}

