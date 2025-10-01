import java.util.Random;

public class TypeB extends Thing {
    private int rounds = 0;
    
    // Constructor
    public TypeB(int r, int c, int d, char l) {
        super(r, c, d, l);
    }

    @Override
    public void maybeTurn(Random rand) {
        rounds++;
        if(rounds % 10 == 0){
        int i = rand.nextInt(3);
        if (i == 0) rightTurn();
        else if (i == 1) leftTurn();
        }
    }
}