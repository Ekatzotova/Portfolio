public class Cat {
    private boolean isFull;
    private int appetite;
    private String name;



    public Cat(String name, int appetite) {
        isFull = false;
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate) {
        if (plate.hasEnoughFoodFor(appetite) && !isFull) {
            System.out.println(name + " кушает");
            plate.decreaseFood(appetite);
            isFull = true;
        }
        else if (!plate.hasEnoughFoodFor(appetite)) {
            System.out.println(name + " смотрит на пустую тарелку");

        }
        else if (isFull) {
            System.out.println(name + " уже сытая");
        }
    }
}
