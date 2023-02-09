package edu.wctc.shipping.impl;

import edu.wctc.shipping.iface.SaleItem;

public class Sale extends SaleItem {

    public Sale(String customer, String country, double amount, double tax, double shipping) {
        super(customer, country, amount, tax, shipping);
    }
}
