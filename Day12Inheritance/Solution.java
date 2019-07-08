package Day12Inheritance;

import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }


    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here

    String calculate() {
        int average;
        int sum = 0;

        String string1 = "O";
        String string2 = "E";
        String string3 = "A";
        String string4 = "P";
        String string5 = "D";
        String string6 = "T";

        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        average = sum / testScores.length;

        if (90 <= average && average <= 100) {
            return string1;
        } else if (80 <= average && average < 90) {
            return string2;
        } else if (70 <= average && average < 80) {
            return string3;
        } else if (55 <= average && average < 70) {
            return string4;
        } else if (40 <= average && average < 55) {
            return string5;
        } else {
            return string6;
        }

    }
}


class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
