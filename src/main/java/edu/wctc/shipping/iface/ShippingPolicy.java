package edu.wctc.shipping.iface;

import edu.wctc.shipping.impl.Sale;

public interface ShippingPolicy {
    void applyShipping(Sale sale);
}
