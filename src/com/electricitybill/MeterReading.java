package com.electricitybill;

/**
 * Stores meter readings and calculates consumed electricity units.
 */
public class MeterReading {
    private final int previousReading;
    private final int currentReading;

    public MeterReading(int previousReading, int currentReading) {
        if (previousReading < 0 || currentReading < 0) {
            throw new IllegalArgumentException("Meter readings cannot be negative.");
        }

        if (currentReading < previousReading) {
            throw new IllegalArgumentException("Current reading must be greater than or equal to previous reading.");
        }

        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    public int getPreviousReading() {
        return previousReading;
    }

    public int getCurrentReading() {
        return currentReading;
    }

    public int getUnitsConsumed() {
        return currentReading - previousReading;
    }
}
