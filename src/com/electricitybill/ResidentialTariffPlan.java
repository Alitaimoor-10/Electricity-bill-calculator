package com.electricitybill;

/**
 * Slab-based tariff for home electricity connections.
 */
public class ResidentialTariffPlan implements TariffPlan {
    @Override
    public double calculateEnergyCharge(int unitsConsumed) {
        if (unitsConsumed <= 100) {
            return unitsConsumed * 5.0;
        }

        if (unitsConsumed <= 200) {
            return 100 * 5.0 + (unitsConsumed - 100) * 9.5;
        }

        return 100 * 5.0 + 100 * 9.5 + (unitsConsumed - 200) * 14.0;
    }

    @Override
    public double getFixedCharge() {
        return 75.0;
    }

    @Override
    public double getTaxRate() {
        return 0.05;
    }

    @Override
    public String getCustomerType() {
        return "Residential";
    }
}
