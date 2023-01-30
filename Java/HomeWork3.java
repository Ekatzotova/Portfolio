import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        task1(array);
        System.out.println(Arrays.toString(array));
        int[] arrayTwo = new int[100];
        task2(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));
        int[] arrayThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        task3(arrayThree);
        System.out.println(Arrays.toString(arrayThree));
        int[][] table = new int[2][2];
        task4(table);
        printArr(table);
        int[] task5arr = task5(5, 10);
        System.out.println(Arrays.toString(task5arr));

    }

    public static void task1(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
    }
    public static void task2(int[] arrayTwo) {
        for (int i = 0; i < 100; i++) {
            arrayTwo[i] = i + 1;
        }
    }
    public static void task3(int[] arrayThree) {
        for (int i = 0; i < arrayThree.length; i++) {
            if (arrayThree[i] < 6) {
                arrayThree[i] = arrayThree[i] * 2;
            }
        }
    }

    public static void task4(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }
            }
        }
    }
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] task5(int initialValue, int lenght) {
        int[] arrayFive = new int[lenght];
        for (int i = 0; i < arrayFive.length; i++) {
            arrayFive[i] = initialValue;
        }
        return arrayFive;

    }
}
