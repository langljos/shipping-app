package edu.wctc.shipping.impl.ShippingPolicyImpl;

import edu.wctc.shipping.iface.ShippingPolicy;
import edu.wctc.shipping.impl.Sale;

public class FreeShippingPolicy implements ShippingPolicy {
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(0);
    }
}
