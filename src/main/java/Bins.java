import java.util.TreeMap;

public class Bins {
    private final TreeMap<Integer, Integer> theBins;
    private Integer totalincrements = 0; //amount of simulations/rolls
    public Bins(final int firstInteger, final int lastInteger) { //[CONSTRUCTOR]

        theBins = new TreeMap<Integer, Integer>(); //creating batch (of bins)

        //Creates bins (IN the batch)
        for (Integer i = firstInteger ; i <= lastInteger; i++) { theBins.put(i, 0); }
    }

    public Integer numOfBins() { return theBins.size(); }
    public Integer getSpecificBin(Integer roll_binNum) { return theBins.get(roll_binNum); }
    public void addRollValuetoBin(Integer roll_binNum) {
        //System.out.print(roll_binNum + " ");
        //Searching thebins for the correct bin , get current value of bin & add roll (+1)
        theBins.put(roll_binNum, theBins.get(roll_binNum) + 1);

        totalincrements++;
    }
    public Float rollPercPerBin( Integer roll_binNum) {
        // the value of rolls in the spec bin of the param / totalinc
        return theBins.get(roll_binNum) / (float) totalincrements;
    }
}
