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

    @Before
    public void setUp() {
        changeMaker = new ChangeMaker();
    }

    @Test
    public void testInputTakesPositiveInteger() {
        changeMaker.makeChange(0);
    }

    @Test
    public void testChangeForZeroDollars() {
        HashMap expectedChange = new HashMap<String,String>();
        HashMap change = changeMaker.makeChange(0);
        assertEquals(expectedChange, change);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInputRejectsNegativeInteger() {
        changeMaker.makeChange(-2);
    }


}