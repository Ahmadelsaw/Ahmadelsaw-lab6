import java.util.Random;
 public class TypeC extends Thing {
    private boolean turnright = true; // toggle direction each time
    
    // Constructor
    public TypeC(int r, int c, int d, char l) {
        super(r, c, d, l);
    }

    @Override
    public void maybeTurn(Random rand) {
        if (turnright) rightTurn();
        else leftTurn();
        turnright = !turnright;

        }
    }