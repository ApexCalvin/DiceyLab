import org.junit.Assert;
import org.junit.Test;

public class programTest {

    @Test
    public void numOfDiceTest1() {
       Dice dice = new Dice(2);
        int expected = 2;
        int actual = dice.dieCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numOfDiceTest2() {
        Dice dice = new Dice(3);
        int expected = 3;
        int actual = dice.dieCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numOfDiceBins1() { //value
        Bins testbin = new Bins(1, 6);
        testbin.addRollValuetoBin(4);
        testbin.addRollValuetoBin(4);
        int expected = 2;
        int actual = testbin.getSpecificBin(4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numOfDiceBins2() {
        Bins testbin = new Bins(2, 12);
        testbin.addRollValuetoBin(7);
        testbin.addRollValuetoBin(7);
        testbin.addRollValuetoBin(7);
        testbin.addRollValuetoBin(7);
        int expected = 4;
        int actual = testbin.getSpecificBin(7);
        Assert.assertEquals(expected, actual);
    }
//    @Test
//    public void SpecBinValueTest1() {
//
//        int expected = 1;
//        int actual = 2;
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void SpecBinValueTest2() {
//        int expected = 1;
//        int actual = 2;
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void binRangeTest1() {
        Bins testbin = new Bins(2, 12);
        int expected = 11;
        int actual = testbin.numOfBins();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binRangeTest2() {
        Bins testbin = new Bins(1, 6);
        int expected = 6;
        int actual = testbin.numOfBins();
        Assert.assertEquals(expected, actual);
    }
}
