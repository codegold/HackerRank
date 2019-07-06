package JavaMap;

//Complete this code or write your own from scratch

import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int quantEntries = scanner.nextInt();
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
        scanner.nextLine();

        //Here quantity of entries.
        for (int i = 0; i < quantEntries; i++) {
            String name = scanner.nextLine();
            int phone = scanner.nextInt();
            phoneBook.put(name, phone);
            scanner.nextLine();

        }
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            try {
                int temp = phoneBook.get(s);
                System.out.println(s + "=" + temp);
            } catch (Exception e) {
                System.out.println("Not found");
            }

        }
    }
}