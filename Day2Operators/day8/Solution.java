package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    static Scanner sc = new Scanner(System.in);
    static int quantityScans = sc.nextInt();
    static Map<String, Integer> phoneBook = new HashMap<String, Integer>();

    public static void main(String[] args) {
        for (int i = 0; i < quantityScans; i++) {
            String s = sc.next();
            int v = sc.nextInt();
            phoneBook.put(s, v);
        }
        while (sc.hasNext()) {
            String searchInBook = sc.next();
            if (phoneBook.get(searchInBook) == null) {
                System.out.println("Not valid");
            } else {
                System.out.println(searchInBook + " = " + phoneBook.get(searchInBook));
            }
        }
        sc.close();
    }

}
