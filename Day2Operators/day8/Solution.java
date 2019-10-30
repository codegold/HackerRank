package day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, Integer> phoneBook = new HashMap<String, Integer>();
    static int quantityScan = scanner.nextInt();

    public static void main(String[] args) {
        for (int i = 0; i < quantityScan; i++) {
            String name = scanner.next();
            int number = scanner.nextInt();
            phoneBook.put(name, number);
        }

        while (scanner.hasNext()){
            String searchInBook = scanner.next();
            if(phoneBook.get(searchInBook) == null){
                System.out.println("no such");
            } else {
                System.out.println(searchInBook +" = "+ phoneBook.get(searchInBook));
            }
        }
    }

}



