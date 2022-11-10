import java.util.Random;

public class Simulation {

    public static void main(String[] args) {

        int numOfDice = 3;
        int amountOfRolls = 10000;
        int binUpperLimit = numOfDice * 6;

        Dice dice = new Dice(numOfDice); //creates plural obj & set num of die
        Bins batchOfBins = new Bins(numOfDice, binUpperLimit); //creates a map of bins, ex. 2 to 12

        runSim(dice, batchOfBins, amountOfRolls);
        displayResult(batchOfBins, numOfDice, binUpperLimit);
    }

    public static void runSim(Dice dice, Bins batchOfBins, int amountOfRolls) {
        for(int i = 0 ; i < amountOfRolls ; i++) {
            batchOfBins.addRollValuetoBin(dice.tossAndSum());
        }
    }
    public static void displayResult(Bins batchOfBins, int numOfDice, int binUpperLimit) {
        System.out.println("");
        for(int i = numOfDice; i <= binUpperLimit ; i++) {
            System.out.println(String.format("%2s | %10s | %.2f ", i,
                    batchOfBins.getSpecificBin(i).toString(), batchOfBins.rollPercPerBin(i)));
        }
    }

}
