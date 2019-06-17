package JavaEndOfFile;

import java.util.Scanner;

public class EndOfFileSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNextLine())
            System.out.println(++i + " " + scanner.nextLine());
        scanner.close();
    }
}
