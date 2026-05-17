package com.electricitybill;

/**
 * Calculates bill totals by applying the customer's tariff plan.
 */
public class BillCalculator {
    public Bill generateBill(Customer customer, MeterReading meterReading) {
        TariffPlan tariffPlan = customer.getTariffPlan();
        double energyCharge = tariffPlan.calculateEnergyCharge(meterReading.getUnitsConsumed());
        double fixedCharge = tariffPlan.getFixedCharge();
        double tax = energyCharge * tariffPlan.getTaxRate();

        return new Bill(customer, meterReading, energyCharge, fixedCharge, tax);
    }
}
