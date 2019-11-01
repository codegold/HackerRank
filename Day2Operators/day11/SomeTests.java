package day11;

public class SomeTests {

    public static void main(String[] args) {
        int counter=10;
        int rowSize = 4;
        int colSize = 5;
        int[][] doubleArr = new int[rowSize][colSize];

        for (int i = 0; i < rowSize; i++, counter++) {
            for (int j = 0; j < colSize; j++, counter++) {
                doubleArr[i][j] = counter;
            }
        }

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(doubleArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
