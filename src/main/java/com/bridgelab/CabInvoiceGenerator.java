package com.bridgelab;

public class CabInvoiceGenerator {
    CabInvoiceGenerator cab;
    private static final double MINIMUM_COST_PER_KM = 10;
    private static final int MINIMUM_COST_PER_MIN = 1;
    private static final double MINIMUM_FARE = 5;



    public double calculateNormalFare(double distance, int time) {
        double fare = (distance * MINIMUM_COST_PER_KM) + (time * MINIMUM_COST_PER_MIN);
        return (fare < MINIMUM_FARE) ? MINIMUM_FARE : fare;
    }
}

