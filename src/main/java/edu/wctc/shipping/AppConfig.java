package edu.wctc.shipping;

import edu.wctc.shipping.iface.SalesInput;
import edu.wctc.shipping.iface.SalesReport;
import edu.wctc.shipping.iface.ShippingPolicy;
import edu.wctc.shipping.impl.*;
import edu.wctc.shipping.impl.SalesInputImpl.ConsoleSalesInput;
import edu.wctc.shipping.impl.SalesInputImpl.FileSalesInput;
import edu.wctc.shipping.impl.SalesReportImpl.CountrySummaryReport;
import edu.wctc.shipping.impl.SalesReportImpl.DetailedSalesReport;
import edu.wctc.shipping.impl.ShippingPolicyImpl.FlatRateDomesticShippingPolicy;
import edu.wctc.shipping.impl.ShippingPolicyImpl.FreeShippingPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.shipping")
public class AppConfig {
    @Bean
    public SalesReport salesReport() {
//        return new CountrySummaryReport();
        return new DetailedSalesReport();
    }

    @Bean
    public SalesInput salesInput() {
        return new FileSalesInput();
//        return new ConsoleSalesInput();
    }

    @Bean
    public ShippingPolicy shippingPolicy() {
//        return new FreeShippingPolicy();
        return new FlatRateDomesticShippingPolicy();
    }

}
