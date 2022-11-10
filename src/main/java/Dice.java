import java.util.Random;
import java.lang.Math;

public class Dice {
    public int numOfDice;
    public Dice(int numOfDice) { //Create dice
        this.numOfDice = numOfDice;
    }

    public int tossAndSum() { //rolls dice
        Random rand = new Random();
        int sum = 0;
        for(int i = 0 ; i < numOfDice ; i++) { //rolls amount of die
           sum += rand.nextInt(6) + 1; //adds result to get sum
        }
        return sum;
    }
}
