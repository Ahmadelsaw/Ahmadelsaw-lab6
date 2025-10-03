import java.io.PrintStream;
import java.util.Random;

public class ThingList {

  // simple singly-linked list
  private class Node {
    Thing data;
    Node next;
    Node(Thing v) {this.data =v;}
  }

  private Node head;
  private Node tail;

  public void addThing(Thing t) {
    Node n=new Node(t);
    if (head==null) {
      head=tail = n;
    } else {
      tail.next = n;
      tail=n;
    }
  }

  // advance one round for every Thing:
  // 1) let each decide turning (polymorphic)
  // 2) step forward
  public void moveAll(Random rand) {
    for (Node cur = head; cur != null; cur = cur.next) {
      cur.data.maybeTurn(rand);
      cur.data.step();
    }
  }

  // print current round for the plotter
  public void printAll() {
    for (Node cur = head; cur != null; cur = cur.next) {
      System.out.println(cur.data.toString());
    }
    System.out.println("done");
    System.out.flush();
  }
}
