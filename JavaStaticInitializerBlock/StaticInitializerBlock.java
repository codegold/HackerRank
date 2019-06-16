package JavaStaticInitializerBlock;
/*https://vertex-academy.com/tutorials/ru/bloki-inicializacii-v-java-chast-1/
Very usefull sourse
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializerBlock {
    private static int B;
    private static int H;
    private static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        if (!(B <= 0 || H <= 0)) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }




    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

