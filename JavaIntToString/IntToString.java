package JavaIntToString;

import java.util.*;
import java.security.*;

public class IntToString {
<<<<<<< HEAD
        public static void main(String[] args) {

            DoNotTerminate.forbidExit();

            try {
                Scanner in = new Scanner(System.in);
                int n = in .nextInt();
                in.close();
                //String s=???; Complete this line below

                //Write your code here
                String s = Integer.toString(n);
                if (n == Integer.parseInt(s)) {
                    System.out.println("Good job");
                } else {
                    System.out.println("Wrong answer.");
                }
            } catch (DoNotTerminate.ExitTrappedException e) {
                System.out.println("Unsuccessful Termination!!");
            }
        }
=======

    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            //String s=???; Complete this line below
            String s = Integer.toString(n);
            //Write your code here


            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
>>>>>>> d3875d14a04f69051aed327ca3aceacc1bb99596
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}

