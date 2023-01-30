import java.util.Random;
import java.util.Scanner;

public class isWinnerChange {

    public static char[][] map;
    public static char DOT_EMPTY = '.';
    public static char DOT_X = 'X';
    public static char DOT_O = 'O';
    public static int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    public static void main(String[] args) {
        initMap();
        showMap();

        while (true) {
            humanTurn();
            showMap();
            if (isWinner(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiturn();
            showMap();
            if (isWinner(DOT_O)) {
                System.out.println("Победил Т-1000!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;

            }
        }
    }
    public static void showMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i);
            System.out.print(" ");
        }

        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1));
            System.out.print((" "));
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j]);
                System.out.print((" "));
            }
            System.out.println();
        }
    }
    public static void humanTurn() {
        int x;
        int y;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите координаты Х и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() -1;
        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static void aiturn() {
        int x;
        int y;

        Random myRandom = new Random();

        do {
            x = myRandom.nextInt(SIZE);
            y = myRandom.nextInt(SIZE);
        } while (!isCellValid(x, y));

        System.out.println("Компьютер сходил в точки: ");
        System.out.println("X-" + (x+1));
        System.out.println("Y-" + (y+1));

        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }

        if (map[y][x] == DOT_EMPTY) {
            return true;
        }

        return false;
    }

    public static boolean isWinner(char symb) {
           return isLinesFilledWith(symb) || diag(symb);
    }
    public static boolean isLinesFilledWith(char symb) {
        for (int a = 0; a < map.length; a++) {
            int horCalc = 0;
            int verCalc = 0;

            for (int b = 0; b < map.length; b++) {
                if (map[a][b] == symb) {
                    horCalc++;
                }

                if (map[b][a] == symb) {
                    verCalc++;
                }
            }
            if (horCalc == DOTS_TO_WIN || verCalc == DOTS_TO_WIN) {
                return true;
            }
        }
            return false;
    }

    public static boolean diag(char symb) {
            int diagCalc1 = 0;
            int diagCalc2 = 0;

            for (int a = 0; a < DOTS_TO_WIN; a++) {
                if (map[a][a] == symb) {
                    diagCalc1++;
                }
                if (map[a][DOTS_TO_WIN - 1 - a] == symb) {
                    diagCalc2++;
                }
            }
            return (diagCalc1 == DOTS_TO_WIN) || (diagCalc2 == DOTS_TO_WIN);
        }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}

