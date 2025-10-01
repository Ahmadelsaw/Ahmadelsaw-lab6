import java.util.Random;

abstract class Thing {
    protected int row;
    protected int col;
    protected int dir; // 0=down, 1=right, 2=up, 3=left
    protected char lab;

    // Constructor
    public Thing(int r, int c, int d, char l) {
        row = r;
        col = c;
        dir = d;
        lab = l;
    }

    // accessors
    public int getRow () {return row;}
    public int getCol () {return col;}
    public int getLab () {return lab;}

    // movement methods
    public void rightTurn() {dir = (dir + 1) % 4;}
    public void leftTurn() {dir = (dir + 3) % 4;}

    public void step() {
        final int[] dc = {0, 1, 0, -1}, dr = {1, 0, -1, 0};
        row += dr[dir];
        col += dc[dir];
    }

    // polymorphic method to be implemented by subclasses
    public abstract void maybeTurn(Random rand);

    public String toString() {
        return row + " " + col + " " + lab;
    }
}