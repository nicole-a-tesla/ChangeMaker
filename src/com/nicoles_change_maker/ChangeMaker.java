package com.nicoles_change_maker;

/**
 * Created by bears8yourface on 1/5/16.
 */
public class ChangeMaker {
    public static void main(String[] args) {}

    public void makeChange(Integer dollarAmount) {
        Boolean dollarAmountIsValid = validateDollarAmount(dollarAmount);

        if (dollarAmountIsValid) {
            // calculate change
        } else {
            throw new IllegalArgumentException();
        }
    }

    private boolean validateDollarAmount(Integer dollarAmount) {
        return dollarAmount >= 0;
    }

}
