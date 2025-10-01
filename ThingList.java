import java.io.PrintStream;
import java.util.Random;

public class ThingList {

  // simple singly-linked list
  private static class Node {
    Thing val;
    Node next;
    Node(Thing v) {this.val=v;}
  }

  private Node head;
  private Node tail;

  public void add(Thing t) {
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
      cur.val.maybeTurn(rand);
      cur.val.step();
    }
  }

  // print current round for the plotter
  public void printAll(PrintStream out) {
    for (Node cur = head; cur != null; cur = cur.next) {
      out.println(cur.val.toString());
    }
    out.println("done");
  }
}
