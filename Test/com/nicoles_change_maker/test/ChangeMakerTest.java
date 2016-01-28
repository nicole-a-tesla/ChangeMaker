package com.nicoles_change_maker.test;
import com.nicoles_change_maker.ChangeMaker;
import org.junit.*;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;


public class ChangeMakerTest {
    ChangeMaker changeMaker;
    HashMap <String,Integer> expectedChange = new HashMap();
    HashMap <String,Integer> change = new HashMap();

    @Before
    public void setUp() {
        changeMaker = new ChangeMaker();
    }

    @Test
    public void testInputTakesPositiveInteger() {
        changeMaker.makeChange(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInputRejectsNegativeInteger() {
        changeMaker.makeChange(-2);
    }

    @Test
    public void testChangeForZeroDollars() {
        change = changeMaker.makeChange(0);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForOneCent() {
//        expectedChange.put("P", 1);
        change = changeMaker.makeChange(.01);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForTwoCents() {
        expectedChange.put("P", 2);
        change = changeMaker.makeChange(.02);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForThreeCents() {
        expectedChange.put("P", 3);
        change = changeMaker.makeChange(.03);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForFourCents() {
        expectedChange.put("P", 4);
        change = changeMaker.makeChange(.04);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForFiveCents(){
        expectedChange.put("N", 1);
        change = changeMaker.makeChange(.05);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForSixCents(){
        expectedChange.put("N", 1);
        expectedChange.put("P", 1);
        change = changeMaker.makeChange(.06);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForSevenCents(){
        expectedChange.put("N", 1);
        expectedChange.put("P", 2);
        change = changeMaker.makeChange(.07);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForEightCents(){
        expectedChange.put("N", 1);
        expectedChange.put("P", 3);
        change = changeMaker.makeChange(.08);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForNineCents(){
        expectedChange.put("N", 1);
        expectedChange.put("P", 4);
        change = changeMaker.makeChange(.09);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForTenCents(){
        expectedChange.put("D", 1);
        change = changeMaker.makeChange(.10);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForElevenCents(){
        expectedChange.put("D", 1);
        expectedChange.put("P", 1);
        change = changeMaker.makeChange(.11);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForTwelveCents(){
        expectedChange.put("D", 1);
        expectedChange.put("P", 2);
        change = changeMaker.makeChange(.12);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForThirteenCents(){
        expectedChange.put("D", 1);
        expectedChange.put("P", 3);
        change = changeMaker.makeChange(.13);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForFourteenCents(){
        expectedChange.put("D", 1);
        expectedChange.put("P", 4);
        change = changeMaker.makeChange(.14);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForFifteenCents(){
        expectedChange.put("D", 1);
        expectedChange.put("N", 1);
        change = changeMaker.makeChange(.15);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForSixteenCents(){
        expectedChange.put("D", 1);
        expectedChange.put("N", 1);
        expectedChange.put("P", 1);
        change = changeMaker.makeChange(.16);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForSeventeenCents(){
        expectedChange.put("D", 1);
        expectedChange.put("N", 1);
        expectedChange.put("P", 2);
        change = changeMaker.makeChange(.17);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForEighteenCents(){
        expectedChange.put("D", 1);
        expectedChange.put("N", 1);
        expectedChange.put("P", 3);
        change = changeMaker.makeChange(.18);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForNineteenCents(){
        expectedChange.put("D", 1);
        expectedChange.put("N", 1);
        expectedChange.put("P", 4);
        change = changeMaker.makeChange(.19);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForTwentyCents(){
        expectedChange.put("D", 2);
        change = changeMaker.makeChange(.20);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForTwentyFiveCents(){
        expectedChange.put("Q", 1);
        change = changeMaker.makeChange(.25);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForThirtySevenCents(){
        expectedChange.put("Q", 1);
        expectedChange.put("D", 1);
        expectedChange.put("P", 2);
        change = changeMaker.makeChange(.37);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForFiftyCents(){
        expectedChange.put("H", 1);
        change = changeMaker.makeChange(.50);
        assertEquals(expectedChange, change);
    }


    @Test
    public void testChangeForOneDollar(){
        expectedChange.put("H", 2);
        change = changeMaker.makeChange(1);
        assertEquals(expectedChange, change);
    }

    @Test
    public void testChangeForOneDollarThirtyThree(){
        expectedChange.put("H", 2);
        expectedChange.put("Q", 1);
        expectedChange.put("N", 1);
        expectedChange.put("P", 3);
        change = changeMaker.makeChange(1.33);
        assertEquals(expectedChange, change);
    }
}