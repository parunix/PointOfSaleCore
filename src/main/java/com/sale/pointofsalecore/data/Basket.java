package com.sale.pointofsalecore.data;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author parun
 */
public class Basket {
    private static final Logger LOG = getLogger(Basket.class.getName());

    private List<String> basketItems;

    /**
     * @return the basketItems
     */
    public List<String> getBasketItems() {
        return unmodifiableList(basketItems);

    }

    /**
     * @param args
     */
    public void setBasketItems(String... args) {
        
        basketItems = new ArrayList<>();       
        basketItems.addAll(asList(args));
        
        for(String m : basketItems){
            LOG.log(Level.FINE, m);
        }

    }
}