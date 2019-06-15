package JavaEndOfFile;

import java.io.*;
import java.util.*;


public class EndOfFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNextLine()) {
            System.out.println((++count) + " " + scanner.nextLine());
        }

    }
}

