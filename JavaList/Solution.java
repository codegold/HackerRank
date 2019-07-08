package JavaList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        //Create and fill in
        List<Integer> myL = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int val = scanner.nextInt();
            myL.add(val);
        }

        //Make queries
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            String command = scanner.next();
            if (command.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                myL.add(index, value);
            } else if (command.equals("Delete")) {
                int deleteIndex = scanner.nextInt();
                myL.remove(deleteIndex);
            }
        }

        //System.out.println(myL);
        for (Integer allNumbers : myL) {
            System.out.print(allNumbers + " ");
        }


    }
}
