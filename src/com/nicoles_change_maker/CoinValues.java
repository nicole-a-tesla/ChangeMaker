package com.nicoles_change_maker;

import java.util.HashMap;

/**
 * Created by bears8yourface on 1/5/16.
 */
public class CoinValues {

    public static final HashMap dictionary = new HashMap<String, Double>() {
        {
            put("H", .50);
            put("Q", .25);
            put("D", .10);
            put("N", .05);
            put("P", .01);
        }
    };

    public double lookup(String coinKey) {
        return (double) dictionary.get(coinKey);
    }
}
