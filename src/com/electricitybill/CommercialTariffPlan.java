package com.electricitybill;

/**
 * Slab-based tariff for business electricity connections.
 */
public class CommercialTariffPlan implements TariffPlan {
    @Override
    public double calculateEnergyCharge(int unitsConsumed) {
        if (unitsConsumed <= 100) {
            return unitsConsumed * 8.0;
        }

        if (unitsConsumed <= 300) {
            return 100 * 8.0 + (unitsConsumed - 100) * 12.0;
        }

        return 100 * 8.0 + 200 * 12.0 + (unitsConsumed - 300) * 16.0;
    }

    @Override
    public double getFixedCharge() {
        return 150.0;
    }

    @Override
    public double getTaxRate() {
        return 0.08;
    }

    @Override
    public String getCustomerType() {
        return "Commercial";
    }
}
