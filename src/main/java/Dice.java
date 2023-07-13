import java.util.Random;

public class Dice {

    private final int numOfDice;

    public Dice(int numOfDice) { //Create dice
        this.numOfDice = numOfDice;
    }

    public int tossAndSum() {

        Random rng = new Random();

        int sum = 0;

        for(int i = 0 ; i < numOfDice ; i++) {

           sum += rng.nextInt(6) + 1;

        }

        return sum;
    }

    public int getDieCount(){
        return numOfDice;
    }
}
