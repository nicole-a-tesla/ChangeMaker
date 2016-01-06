package com.nicoles_change_maker.test;
import com.nicoles_change_maker.CoinMap;
import org.junit.*;
import java.util.HashMap;
import static org.junit.Assert.assertEquals;

/**
 * Created by bears8yourface on 1/5/16.
 */
public class CoinValuesTest {
    CoinMap coinValues = new CoinMap();
    HashMap dictionary = coinValues.dictionary;
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

    @Test
    public void testPennyLookup(){
        assertEquals(.01, coinValues.lookup("P"), DELTA);
    }

    @Test
    public void testNickelLookup(){
        assertEquals(.05, coinValues.lookup("N"), DELTA);
    }

    @Test
    public void testDimeLookup(){
        assertEquals(.10, coinValues.lookup("D"), DELTA);
    }

    @Test
    public void testQuarterLookup(){
        assertEquals(.25, coinValues.lookup("Q"), DELTA);
    }

    @Test
    public void testHalfDollarLookup(){
        assertEquals(.50, coinValues.lookup("H"), DELTA);
    }
}
