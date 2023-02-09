package edu.wctc.shipping.iface;

import edu.wctc.shipping.impl.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
