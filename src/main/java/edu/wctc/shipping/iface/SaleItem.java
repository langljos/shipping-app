package edu.wctc.shipping.iface;

public class SaleItem {
    private final String customer;
    private final String country;
    private final double amount;
    private final double tax;
    private double shipping;

    public SaleItem(String customer, String country, double amount, double tax, double shipping) {
        this.customer = customer;
        this.country = country;
        this.amount = amount;
        this.tax = tax;
        this.shipping = shipping;
    }

    public String getCustomer() {
        return customer;
    }

    public String getCountry() {
        return country;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }

    public double getShipping() {
        return shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }
}
