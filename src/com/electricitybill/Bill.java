package com.electricitybill;

/**
 * Immutable bill receipt generated for a customer.
 */
public class Bill {
    private final Customer customer;
    private final MeterReading meterReading;
    private final double energyCharge;
    private final double fixedCharge;
    private final double tax;
    private final double totalAmount;

    public Bill(Customer customer, MeterReading meterReading, double energyCharge, double fixedCharge, double tax) {
        this.customer = customer;
        this.meterReading = meterReading;
        this.energyCharge = energyCharge;
        this.fixedCharge = fixedCharge;
        this.tax = tax;
        this.totalAmount = energyCharge + fixedCharge + tax;
    }

    public void printReceipt() {
        System.out.println("\n========== Electricity Bill ==========");
        System.out.println("Customer ID   : " + customer.getCustomerId());
        System.out.println("Customer Name : " + customer.getName());
        System.out.println("Address       : " + customer.getAddress());
        System.out.println("Customer Type : " + customer.getTariffPlan().getCustomerType());
        System.out.println("Previous Read : " + meterReading.getPreviousReading());
        System.out.println("Current Read  : " + meterReading.getCurrentReading());
        System.out.println("Units Used    : " + meterReading.getUnitsConsumed());
        System.out.printf("Energy Charge : Rs. %.2f%n", energyCharge);
        System.out.printf("Fixed Charge  : Rs. %.2f%n", fixedCharge);
        System.out.printf("Tax           : Rs. %.2f%n", tax);
        System.out.printf("Total Bill    : Rs. %.2f%n", totalAmount);
        System.out.println("======================================");
    }
}
