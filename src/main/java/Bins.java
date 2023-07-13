import java.util.TreeMap;

public class Bins {

    private final TreeMap<Integer, Integer> theseBins;

    private Integer totalRolls = 0;

    public Bins(int lowerLimit, int upperLimit) {

        theseBins = new TreeMap<Integer, Integer>();

        for (int i = lowerLimit ; i <= upperLimit ; i++) {

            theseBins.put(i, 0);
        }
    }

    public void addSumToBin(Integer roll_binNum) {

        // < key = Sum number, value = Sum Frequency >
        theseBins.put(roll_binNum, theseBins.get(roll_binNum) + 1);

        totalRolls++;
    }

    public Integer getNumOfBins() { return theseBins.size(); }

    public Integer getValueOfBin(Integer roll_binNum) { return theseBins.get(roll_binNum); }

    public Float getRollPercentageOfBin(Integer roll_binNum) {

        return theseBins.get(roll_binNum) / (float) totalRolls;
    }

}
