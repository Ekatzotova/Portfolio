import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findWord();

    }

    public static void findWord() {
        Random random = new Random();
        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
        };
        int computerWordIndex = random.nextInt(words.length);
        String computerWord = words[computerWordIndex];
        System.out.println("Слово загадано! Введите Ваш вариант.");

        String myWord;
        Scanner scanner = new Scanner(System.in);

        do {
            myWord = scanner.nextLine();

            if (myWord.equals(computerWord)) {
                System.out.println("Вы угадали!");
            }
            else {
                help(myWord, computerWord);
            }
        }
        while (!(myWord.equals(computerWord)));
    }

    static void help(String myWord, String computerWord) {
        String help = "";
        for (int i = 0; i < 15; i ++) {
            if (i >= myWord.length() || i >= computerWord.length()) {
                help += "#";
            }
            else if (myWord.charAt(i) == computerWord.charAt(i)) {
                help += myWord.charAt(i);
            }
            else {
                help += "#";
            }
        }
        System.out.println(help);
    }
}
