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

//        System.out.println("2 " + displayStars(2));
//        System.out.println("4 " + displayStars(4));
//        System.out.println("6 " + displayStars(6));
//        System.out.println("8 " + displayStars(8));
//        System.out.println("10 " + displayStars(10));
    }
    public static String displayStars(int binNum) {
        String stars = "";
            for(int i = 0 ; i < Math.round(batchOfBins.getAverage(binNum)) ; i++) { stars += "*"; }
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
            System.out.printf("%2s | %10s | %.2f %n", i,
                    batchOfBins.getSpecificBin(i).toString(), batchOfBins.rollPercPerBin(i));
        }
    }
}
