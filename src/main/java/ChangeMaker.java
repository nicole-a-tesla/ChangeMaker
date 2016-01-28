package main.java;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class ChangeMaker {
    double remainingDollars;

    public static void main(String[] args) {
        
    }

    public HashMap makeChange(double dollarAmount) {
        remainingDollars = dollarAmount;

        if (checkDollarAmountIsValid(dollarAmount)) {
            return evaluateEachCoinAmount();
        }
        throw new IllegalArgumentException();
    }

    private HashMap<String, Integer> evaluateEachCoinAmount() {
        HashMap changeCollection = new HashMap();
        Iterator coinIterator = new CoinMap().getIterator();

        while(coinIterator.hasNext()) {
            Map.Entry coinValueMapping = (Map.Entry) coinIterator.next();
            evaluateCoinAmountForInclusionInChangeCollection(changeCollection, coinValueMapping);
        }

        return changeCollection;
    }

    private void evaluateCoinAmountForInclusionInChangeCollection(HashMap changeCollection, Map.Entry coinValueMapping) {
        String coinType = (String) coinValueMapping.getKey();
        Double coinValue = (Double) coinValueMapping.getValue();

        handlePossibleCoinAddition(coinType, coinValue, changeCollection);
    }

    private void handlePossibleCoinAddition(String coinType, double coinValue, HashMap changeCollection) {
        if (remainingDollars >= coinValue) {
            int numOfCoins = howManyCoins(coinValue);
            changeCollection.put(coinType, numOfCoins);
            remainingDollars = calculateRemainingDollars(numOfCoins * coinValue);
        }
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