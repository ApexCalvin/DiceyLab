import java.util.Random;

public class Simulation {
    public static int numOfDice;
    public static int amountOfRolls;
    public static int binUpperLimit;
    public static Bins batchOfBins;

    public static void main(String[] args) {

        int numOfDice = 2;
        int amountOfRolls = 100000; //hunned thou

        Simulation sim = new Simulation(numOfDice, amountOfRolls);

        sim.runSim();
        sim.displayResult();
    }
    public static String displayStars(int binNum) {
        String stars = "";
        for(int j = 0 ; j < Math.round(batchOfBins.rollPercPerBin(binNum) * 100) ; j++) {
            stars += "*";
        }
        return stars;
    }
    public Simulation(int numOfDice, int amountOfRolls) { //[CONSTRUCTOR]
        Simulation.numOfDice = numOfDice;
        Simulation.amountOfRolls = amountOfRolls;

        binUpperLimit = numOfDice * 6;

        batchOfBins = new Bins(numOfDice, binUpperLimit); //creates a map of bins, ex. 2 to 12
    }
    public void runSim() {
        Dice dice = new Dice(numOfDice);
        //Dice dice = new Dice(numOfDice); //creates plural obj & set num of die

        for(int i = 0 ; i < amountOfRolls ; i++) {
            batchOfBins.addRollValuetoBin(dice.tossAndSum());
        }
    }
    public void displayResult() {
        System.out.println("");
        for(int i = numOfDice; i <= binUpperLimit ; i++) {
            System.out.printf("%2s | %10s | %.2f | %2s %n", i,
                    batchOfBins.getSpecificBin(i).toString(), batchOfBins.rollPercPerBin(i), displayStars(i));
        }
    }
}
