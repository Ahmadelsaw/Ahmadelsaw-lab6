import java.util.Random;

public class DotChaser {
  public static void main(String[] args) {
    Random rand = new Random(12345);   // deterministic for grading

    ThingList list = new ThingList();
    // same two originals (blue + red)
    list.addThing(new TypeA(55, 50, 0, 'b')); // dir: 0=N
    list.addThing(new TypeB(45, 50, 1, 'r')); // dir: 1=E
    list.addThing(new TypeC(50, 30, 0, 'y')); // dir: 0=N

    final int ROUNDS = 2000; // finite loop instead of while(true)
    for (int i = 0; i < ROUNDS; i++) {
      list.printAll();        // prints all dots, then "done"
      list.moveAll(rand);     // maybeTurn (poly) + step for each
    }
  }
}
