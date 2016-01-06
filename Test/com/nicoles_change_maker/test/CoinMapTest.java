package com.nicoles_change_maker.test;
import com.nicoles_change_maker.CoinMap;
import org.junit.*;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;

/**
 * Created by bears8yourface on 1/5/16.
 */
public class CoinMapTest {
    CoinMap coinMap = new CoinMap();
    HashMap dictionary = coinMap.dictionary;
    private static final double DELTA = .001;

    @Test
    public void testPennyValue() {
        assertEquals(.01, dictionary.get("P"));
    }

    @Test
    public void testNickelValue() {
        assertEquals(.05, dictionary.get("N"));
    }

    @Test
    public void testDimeValue() {
        assertEquals(.10, dictionary.get("D"));
    }

    @Test
    public void testQuarterValue() {
        assertEquals(.25, dictionary.get("Q"));
    }

    @Test
    public void testHalfDollarValue() {
        assertEquals(.50, dictionary.get("H"));
    }
}
