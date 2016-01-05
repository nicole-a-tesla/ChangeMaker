package com.nicoles_change_maker;
import java.util.HashMap;

/**
 * Created by bears8yourface on 1/5/16.
 */
public class ChangeMaker {
    public static void main(String[] args) {}

    public HashMap makeChange(Integer dollarAmount) {
        Boolean dollarAmountIsValid = validateDollarAmount(dollarAmount);

        if (dollarAmountIsValid) {
            return new HashMap<String,String>();
        } else {
            throw new IllegalArgumentException();
        }
    }


    private boolean validateDollarAmount(Integer dollarAmount) {
        return dollarAmount >= 0;
    }

}
