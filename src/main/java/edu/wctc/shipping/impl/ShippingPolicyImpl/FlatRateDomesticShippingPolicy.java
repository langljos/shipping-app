package edu.wctc.shipping.impl.ShippingPolicyImpl;

import edu.wctc.shipping.iface.ShippingPolicy;
import edu.wctc.shipping.impl.Sale;

import java.util.HashMap;
import java.util.Map;

public class FlatRateDomesticShippingPolicy implements ShippingPolicy {

    @Override
    public void applyShipping(Sale sale) {
        Sale addShippingItem = sale;
        String country = sale.getCountry();
        double shippingRate = 0.0;

        Map<String, Double> shippingRates = new HashMap<>();

        shippingRates.put("United States", 29.95);
        shippingRates.put("India", 11.79);
        shippingRates.put("Japan", 14.50);
        shippingRates.put("Scotland", 7.54);


        if (shippingRates.containsKey(country)){
            shippingRate = shippingRates.get(country);
            addShippingItem.setShipping(shippingRate);
        } else {
            System.out.println("New country detected. Setting shipping to 0.");
//            System.out.println("New country detected. Add new country?");
            // add implementation to add another country to the dictionary if value is not detected
        }
            }
}
