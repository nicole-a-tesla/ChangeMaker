package com.nicoles_change_maker;

/**
 * Created by bears8yourface on 1/5/16.
 */
public class ChangeMaker {
    public static void main(String[] args) {}

    public void makeChange(Integer dollarAmount) {
        if (dollarAmount < 0) {
            throw new IllegalArgumentException();
        }
    }
}
    