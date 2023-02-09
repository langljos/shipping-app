package edu.wctc.shipping.impl;

public class ConsoleHeaders {
    private final String customer;
    private final String country;
    private final String amount;
    private final String tax;
    private final String shipping;

    public ConsoleHeaders() {
        this.customer = "Customer";
        this.country = "Country";
        this.amount = "Amount";
        this.tax = "Tax";
        this.shipping = "Shipping";
    }

    public String getCustomer() {
        return customer;
    }

    public String getCountry() {
        return country;
    }

    public String getAmount() {
        return amount;
    }

    public String getTax() {
        return tax;
    }

    public String getShipping() {
        return shipping;
    }
}
