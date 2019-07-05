package JavaBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        BigInteger aa = new BigInteger(a);
        BigInteger bb = new BigInteger(b);

        System.out.println(aa.add(bb));
        System.out.println(aa.multiply(bb));

        scanner.close();

    }

}
