package com.sale.pointofsalecore.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Bartosz Cichowicz
 */
public class Basket {

    private List<String> basketItems;

    /**
     * @return the basketItems
     */
    public List<String> getBasketItems() {
        return basketItems;

    }

    /**
     * @param args
     */
    public void setBasketItems(String... args) {
        
        basketItems = new ArrayList<>();       
        basketItems.addAll(Arrays.asList(args));

    }
}