import org.junit.Assert;
import org.junit.Test;

public class programTest {

    @Test
    public void numOfDiceTest1() {
       Dice dice = new Dice(2);
        int expected = 2;
        int actual = dice.getDieCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numOfDiceTest2() {
        Dice dice = new Dice(3);
        int expected = 3;
        int actual = dice.getDieCount();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numOfDiceBins1() { //value
        Bins testbin = new Bins(1, 6);
        testbin.addSumToBin(4);
        testbin.addSumToBin(4);
        int expected = 2;
        int actual = testbin.getValueOfBin(4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numOfDiceBins2() {
        Bins testbin = new Bins(2, 12);
        testbin.addSumToBin(7);
        testbin.addSumToBin(7);
        testbin.addSumToBin(7);
        testbin.addSumToBin(7);
        int expected = 4;
        int actual = testbin.getValueOfBin(7);
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
        int actual = testbin.getNumOfBins();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binRangeTest2() {
        Bins testbin = new Bins(1, 6);
        int expected = 6;
        int actual = testbin.getNumOfBins();
        Assert.assertEquals(expected, actual);
    }
}
