package LittleTests;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
   /**nextLine() читает до конца текущей строки (символа перевода строки или конца потока) и возвращает всё, что было в этой строке.

        nextDouble() читает double. Оно не читает и не пропускает ничего ПОСЛЕ double.

        Итак вы вводите что-то вроде "3.15\n", где \n — символ перевода строки.
        nextDouble() извлекает 3.14 и оставляет "\n" в буфере.
        nextLine() натыкается на \n и прекращает работу, прочитав 0 символов — пустую строку.

        Проверьте: введите в одной строке "1 2 Иванов", и оно заработает (Правда пробел перед Иванов прочтётся как часть фамилии)

        Модно вызвать nextLine(), чтобы поглотить этот перенос строки и ожидать новой строки.
*/