public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(between(10,20));

        positive(15);
        System.out.println(taskThree(-7));
        taskFour("Hello!", 5);
    }
    public static boolean between(int a, int b) {
        int c = a + b;
        if ((10 < c) && (c <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void  positive(int a) {
        if (a >= 0) {
            System.out.println("а - положительно");
        } else {
            System.out.println("а - отрицательно");
        }
    }
    public static boolean taskThree(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void taskFour(String myTxt, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(myTxt);
        }
    }
}
