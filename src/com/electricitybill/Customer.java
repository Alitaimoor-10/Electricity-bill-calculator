package com.electricitybill;

/**
 * Base class that stores common customer details.
 */
public abstract class Customer {
    private final String customerId;
    private final String name;
    private final String address;

    public Customer(String customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public abstract TariffPlan getTariffPlan();
}
