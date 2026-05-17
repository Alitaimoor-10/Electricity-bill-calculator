package com.electricitybill;

/**
 * Customer type for home electricity connections.
 */
public class ResidentialCustomer extends Customer {
    private final TariffPlan tariffPlan;

    public ResidentialCustomer(String customerId, String name, String address) {
        super(customerId, name, address);
        this.tariffPlan = new ResidentialTariffPlan();
    }

    @Override
    public TariffPlan getTariffPlan() {
        return tariffPlan;
    }
}
