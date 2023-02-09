package edu.wctc.shipping;

import edu.wctc.shipping.iface.SalesInput;
import edu.wctc.shipping.iface.SalesReport;
import edu.wctc.shipping.iface.ShippingPolicy;
import edu.wctc.shipping.impl.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportApp {

    private SalesInput salesInput;
    private SalesReport salesReport;
    private ShippingPolicy shippingPolicy;

    @Autowired
    public ReportApp(SalesInput salesInput, SalesReport salesReport, ShippingPolicy shippingPolicy){
        this.salesInput = salesInput;
        this.salesReport = salesReport;
        this.shippingPolicy = shippingPolicy;
        System.out.println("App start");
    }


    public void generateReport(){
        List<Sale> allSales = salesInput.getSales();
        for(Sale sale : allSales){
            shippingPolicy.applyShipping(sale);
        }

        salesReport.generateReport(allSales);
    }
}
