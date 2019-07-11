package RTJavaSHA256;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read scanner from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Easy-peasy - it's the same solution as the MD5 one, except we use SHA-256
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        // Create the MD5 and print it out
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] password  = messageDigest.digest(input.getBytes());

            for (byte b : password){
                System.out.printf("%02x", b);
            }
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}