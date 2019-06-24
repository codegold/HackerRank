package LittleTests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    public static void main(String[] args) {

        String input = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern p1 = Pattern.compile("Java(\\w*)");
        Matcher m1 = p1.matcher(input);
        while (m1.find()) {
            System.out.println(m1.group());
        }
    }
}