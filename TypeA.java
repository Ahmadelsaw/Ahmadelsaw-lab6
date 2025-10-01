import java.util.Random;

public class TypeA extends Thing {
    // Constructor
    public TypeA(int r, int c, int d, char l) {
        super(r, c, d, l);
    }

    @Override
    public void maybeTurn(Random rand) {
        int i = rand.nextInt(3);
        if (i == 1) rightTurn();
        else if (i == 2) leftTurn();
        }
}