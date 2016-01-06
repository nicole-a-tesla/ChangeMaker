package com.nicoles_change_maker;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
/**
 * Created by bears8yourface on 1/5/16.
 */
public class ChangeMaker {
    double remainingDollars;

    public HashMap makeChange(double dollarAmount) {
        remainingDollars = dollarAmount;

        if (checkDollarAmountIsValid(dollarAmount)) {
            return evaluateEachCoinAmount();
        }
        throw new IllegalArgumentException();
    }

    public HashMap evaluateEachCoinAmount() {
        HashMap changeCollection = new HashMap();

        Iterator coinIterator = new CoinMap().dictionary.entrySet().iterator(); 

        while(coinIterator.hasNext()) {
            Map.Entry mapping = (Map.Entry) coinIterator.next();
            String coinType = (String) mapping.getKey();
            Double coinValue = (Double) mapping.getValue();

            handlePossibleCoinAddition(coinType, coinValue, changeCollection);
        }
        return changeCollection;
    }

    private void handlePossibleCoinAddition(String coinType, double coinValue, HashMap changeCollection) {
        if (remainingDollars >= coinValue) {
            int numOfCoins = howManyCoins(coinValue);
            changeCollection.put(coinType, numOfCoins);
            deductFromRemainingDollars(numOfCoins, coinValue);
        }
    }

    private void deductFromRemainingDollars(int numOfCoins, double coinValue) {
        double amountCovered = numOfCoins * coinValue;
        remainingDollars = calculateRemainingDollars(amountCovered);
    }

    private double calculateRemainingDollars(double amountCovered) {
        double remainingDollarsExact = remainingDollars - amountCovered;
        return Math.round(remainingDollarsExact * 100.0) / 100.0;

    }

    private int howManyCoins(double coinValue){
        return (int) Math.floor(remainingDollars / coinValue);
    }

    private boolean checkDollarAmountIsValid(double dollarAmount) {
        return dollarAmount >= 0;
    }

}