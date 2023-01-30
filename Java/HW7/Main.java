public class Main {
    public static void main(String[] arg) {

        Cat[] cats = {
                new Cat( "Пушок", 1),
                new Cat( "Барсик", 8),
                new Cat( "Черныш", 5)
        };
        Plate plate = new Plate(10);
        plate.showInfo();

        for (Cat cat : cats) {
            cat.eat(plate);
            plate.showInfo();
        }

        plate.increaseFood(5);
        for (Cat cat : cats) {
            cat.eat(plate);
            plate.showInfo();
        }
    }
}
