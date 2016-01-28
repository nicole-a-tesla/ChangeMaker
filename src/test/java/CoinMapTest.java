package test.java;
import main.java.CoinMap;
import org.junit.*;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;

public class CoinMapTest {
    CoinMap coinMap = new CoinMap();
    HashMap dictionary = coinMap.dictionary;
    private static final double DELTA = .001;

    @Test
    public void testPennyValue() {
        Assert.assertEquals(.01, dictionary.get("P"));
    }

    @Test
    public void testNickelValue() {
        Assert.assertEquals(.05, dictionary.get("N"));
    }

    @Test
    public void testDimeValue() {
        Assert.assertEquals(.10, dictionary.get("D"));
    }

    @Test
    public void testQuarterValue() {
        Assert.assertEquals(.25, dictionary.get("Q"));
    }

    @Test
    public void testHalfDollarValue() {
        Assert.assertEquals(.50, dictionary.get("H"));
    }
}
