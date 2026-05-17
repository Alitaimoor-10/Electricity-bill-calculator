package com.electricitybill;

/**
 * Customer type for business electricity connections.
 */
public class CommercialCustomer extends Customer {
    private final TariffPlan tariffPlan;

    public CommercialCustomer(String customerId, String name, String address) {
        super(customerId, name, address);
        this.tariffPlan = new CommercialTariffPlan();
    }

    @Override
    public TariffPlan getTariffPlan() {
        return tariffPlan;
    }
}
