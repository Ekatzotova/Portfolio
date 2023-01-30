public class Animal {
    private int maxRun;
    private int maxSwim;

    public Animal(int maxRun, int maxSwim) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance) {
        if (distance > maxRun) {
            System.out.println("Не смог пробежать " + distance);
            System.out.println("Может только " + maxRun);
        } else {
            System.out.println("Пробежал " + distance + " метров");
        }

        System.out.println();

    }

    public void swim(int distance) {
        if (distance > maxSwim) {
            System.out.println("Не смог проплыть " + distance);
            System.out.println("Может только " + maxSwim);
        } else {
            System.out.println("Проплыл " + distance + " метров");
        }

        System.out.println();

    }
}
