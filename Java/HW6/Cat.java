public class Cat extends Animal {
    public Cat(int maxRun, int maxSwim) { super(maxRun, maxSwim); }

    @Override
    public void swim(int distance) {
        System.out.println("Кошки плавать не умеют!");
    }


}
