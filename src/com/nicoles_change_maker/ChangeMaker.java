package com.nicoles_change_maker;
import java.util.HashMap;

/**
 * Created by bears8yourface on 1/5/16.
 */
public class ChangeMaker {
    public static void main(String[] args) {}

    public HashMap makeChange(double dollarAmount) {

        if (checkDollarAmountIsValid(dollarAmount)) {
            return calculateChange(dollarAmount);
        } else {
            throw new IllegalArgumentException();
        }
    }

    private HashMap calculateChange(double dollarAmount) {
        HashMap change = new HashMap<String, Integer>();

        if (dollarAmount == .01) {
            change.put("P", 1);
        }
        return change;
    }

    private boolean checkDollarAmountIsValid(double dollarAmount) {
        return dollarAmount >= 0;
    }

}
