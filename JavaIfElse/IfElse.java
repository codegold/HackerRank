package JavaIfElse;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        String answer = "";

        if (n >= 1 && n <=100 && n%2 != 0) answer = "Weird";
        else if (n % 2 == 0 && n>=2 && n <=5) answer = "Not Weird";
        else if (n % 2 == 0 && n>=6 && n <=20) answer = "Weird";
        else if (n % 2 == 0 && n>20) answer = "Not Weird";

        System.out.println(answer);

    }
}
