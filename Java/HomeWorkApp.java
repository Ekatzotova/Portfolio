import org.w3c.dom.ranges.DocumentRange;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSing() {
        int a = 5;
        int b = 7;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }
    public static void printColor() {
        int value = -5;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
    }
    public static void compareNumbers() {
        int a = 67;
        int b = 13;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}

