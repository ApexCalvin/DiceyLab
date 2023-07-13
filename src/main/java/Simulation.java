public class Simulation {

    private final int numOfDice;

    private final int amountOfRolls;

    private final Bins binsContainer;

    private final int binUpperLimit;

    public Simulation(int numOfDice, int amountOfRolls) {

        this.numOfDice = numOfDice;
        this.amountOfRolls = amountOfRolls;

        binUpperLimit = numOfDice * 6;

        binsContainer = new Bins(numOfDice, binUpperLimit);
    }

    public void runSim() {

        Dice diceInHand = new Dice(numOfDice); //creates plural obj & set num of die

        for(int i = 0 ; i < amountOfRolls ; i++) {

            binsContainer.addSumToBin(diceInHand.tossAndSum());
        }
    }

    public void displayResult() {

        System.out.println();

        for(int i = numOfDice ; i <= binUpperLimit ; i++) {
            System.out.printf("%2s | %10s | %.2f | %2s %n", i,
                    binsContainer.getValueOfBin(i).toString(), binsContainer.getRollPercentageOfBin(i), displayStars(i));
        }
    }

    public String displayStars(int binNum) {

        StringBuilder stars = new StringBuilder();

        for(int j = 0 ; j < Math.round(binsContainer.getRollPercentageOfBin(binNum) * 100) ; j++) {

            stars.append("*");
        }

        return stars.toString();
    }
}
