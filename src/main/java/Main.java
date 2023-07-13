public class Main {
    public static void main(String[] args) {

        int numOfDice = 2;
        int amountOfRolls = 100000; //hunned thou

        Simulation sim = new Simulation(numOfDice, amountOfRolls);

        sim.runSim();
        sim.displayResult();
    }
}
