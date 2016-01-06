package com.nicoles_change_maker;
import java.util.*;
import java.util.ArrayList;
/**
 * Created by bears8yourface on 1/5/16.
 */
public class ChangeMaker {
    public HashMap change = new HashMap<String, Integer>();
    double remainingDollars;
    public CoinValues coinValues = new CoinValues();
    public ArrayList<String> coinTypes = new ArrayList<String>(Arrays.asList("H", "Q", "D", "N", "P"));

    public HashMap makeChange(double dollarAmount) {
        remainingDollars = dollarAmount;

        if (checkDollarAmountIsValid(dollarAmount)) {
            return calculateChange();
        }
        throw new IllegalArgumentException();
    }

    private HashMap calculateChange() {
        handleCoins(coinTypes);
        return change;
    }

    public void handleCoins(ArrayList<String> coinTypes) {
        for (String coinType : coinTypes) {
            handleCoin(coinType);
        }
    }

    public void handleCoin(String coinType) {
        double coinValue = getCoinValue(coinType);

        if (remainingDollars >= coinValue) {
            int numOfCoins = howManyCoins(remainingDollars, coinType);
            change.put(coinType, numOfCoins);
            double amountCovered = numOfCoins * coinValue;
            remainingDollars = calculateRemainingDollars(amountCovered);

        }
    }

    public double calculateRemainingDollars(double amountCovered) {
        double remainingDollarsExact = remainingDollars - amountCovered;
        return Math.round(remainingDollarsExact * 100.0) / 100.0;

    }

    public double getCoinValue(String coinType) {
        return coinValues.lookup(coinType);
    }

    public int howManyCoins(double remainingDollars, String coinType){
        double coinValue = getCoinValue(coinType);
        return (int) Math.floor(remainingDollars / coinValue);
    }

    private boolean checkDollarAmountIsValid(double dollarAmount) {
        return dollarAmount >= 0;
    }

}