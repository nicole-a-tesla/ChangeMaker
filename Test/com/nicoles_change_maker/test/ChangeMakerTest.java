package com.nicoles_change_maker.test;
import com.nicoles_change_maker.ChangeMaker;
import org.junit.*;
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

    @Test(expected = IllegalArgumentException.class)
    public void testInputRejectsNegativeInteger() {
        changeMaker.makeChange(-2);
    }


}