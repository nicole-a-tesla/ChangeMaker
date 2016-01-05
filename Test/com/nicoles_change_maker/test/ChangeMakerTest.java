package com.nicoles_change_maker.test;
import com.nicoles_change_maker.ChangeMaker;
import org.junit.*;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by bears8yourface on 1/5/16.
 */

public class ChangeMakerTest {
    ChangeMaker changeMaker;
    HashMap expectedChange = new HashMap<String,Integer>();
    HashMap change = new HashMap<String,Integer>();

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
        expectedChange.put("P", 1);
        change = changeMaker.makeChange(.01);
        assertEquals(expectedChange, change);
    }


}