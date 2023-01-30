public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println(food);
    }

    public void decreaseFood(int appetite) {
        if (!hasEnoughFoodFor(appetite)) {
            System.out.println("Аппетиты больше, чем еды в тарелке!");
        }
        else {
            food = food - appetite;
        }
    }
    public void showInfo() { System.out.println("В тарелке осталось " + food); }
    public boolean hasEnoughFoodFor(int appetite) { return appetite <= food; }

    public void increaseFood(int countFood) {
        food += countFood;
    }

}

