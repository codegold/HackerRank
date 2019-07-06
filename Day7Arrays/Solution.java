package Day7Arrays;



import java.util.*;


public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }

            for (int j = arr.length-1; j>=0; j--) {
                System.out.print(arr[j] + " ");
            }
        }

        scanner.close();
    }
}
