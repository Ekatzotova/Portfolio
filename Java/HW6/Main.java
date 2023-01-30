public class Main {
   public static void main(String[] args) {
       Cat myCat = new Cat(200, 0);
       Dog myDog = new Dog( 500, 10);

      myCat.run(100);
      myCat.swim(3);

      myDog.run(600);
      myDog.swim(1);
   }
}

