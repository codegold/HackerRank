package JavaGenerics;

public class Solution {
    public static void main(String[] args) {
        class Printer {
            public void printArray(Object[] array) {
                for(Object o: array){
                    System.out.println(o);
                }
            }
        }
    }
}
