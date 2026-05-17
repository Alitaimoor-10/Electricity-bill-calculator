package com.electricitybill;

/**
 * Defines the billing rules used by a customer category.
 */
public interface TariffPlan {
    double calculateEnergyCharge(int unitsConsumed);

    double getFixedCharge();

    double getTaxRate();

    String getCustomerType();
}
