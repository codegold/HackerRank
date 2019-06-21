package JavaSubstringCompressions;


public class MySolution {

    public static String getSmallestAndLargestMy(String s1, int k1) {

        String smallest = "";
        String largest = "";

        int newSize = s1.length() - (k1 - 1);
        String[] myStringArr = new String[newSize];

        int myStart = 0;
        int myFinish = k1;

        for (int i = 0; i < myStringArr.length; i++) {
            myStringArr[i] = s1.substring(myStart, myFinish);
            myStart++;
            myFinish++;
        }

        for (int i = 0; i < myStringArr.length; i++) {
            for (int j = i + 1; j < myStringArr.length; j++) {
                if (myStringArr[i].compareTo(myStringArr[j]) > 0) {
                    String temp = myStringArr[i];
                    myStringArr[i] = myStringArr[j];
                    myStringArr[j] = temp;
                }

            }
        }

        smallest = myStringArr[0];
        largest = myStringArr[myStringArr.length-1];

        return smallest + "\n" + largest;


    }


    public static void main(String[] args) {

        String s1 = "welcometojava"; //13 symbols
        int k1 = 3;

        System.out.println(getSmallestAndLargestMy(s1, k1));


    }
}