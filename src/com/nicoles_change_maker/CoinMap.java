package com.nicoles_change_maker;
import java.util.Iterator;
import java.util.LinkedHashMap;
/**
 * Created by bears8yourface on 1/5/16.
 */
public class CoinMap {

    public static final LinkedHashMap dictionary = new LinkedHashMap<String, Double>() {
        {
            put("H", .50);
            put("Q", .25);
            put("D", .10);
            put("N", .05);
            put("P", .01);
        }
    };

    public Iterator getIterator() {
        return dictionary.entrySet().iterator();
    }

}
