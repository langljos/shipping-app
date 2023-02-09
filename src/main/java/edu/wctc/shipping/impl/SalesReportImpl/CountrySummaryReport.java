package edu.wctc.shipping.impl.SalesReportImpl;

import edu.wctc.shipping.iface.SalesReport;
import edu.wctc.shipping.impl.ConsoleHeaders;
import edu.wctc.shipping.impl.Sale;

import java.util.List;

public class CountrySummaryReport implements SalesReport {

    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("SALES SUMMARY REPORT");
        ConsoleHeaders consoleHeaders = new ConsoleHeaders();
        System.out.printf("%-24s%-11s%-10s%-10s%n", consoleHeaders.getCountry(), consoleHeaders.getAmount(), consoleHeaders.getTax(), consoleHeaders.getShipping());
        for (Sale sale : salesList) {
            System.out.printf("%-20s%10.2f%10.2f%10.2f%n", sale.getCountry(), sale.getAmount(), sale.getTax(), sale.getShipping());
        }
    }
}
