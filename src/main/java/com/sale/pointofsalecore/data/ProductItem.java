package com.sale.pointofsalecore.data;

import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author parun
 */
public class ProductItem {
    private static final Logger LOG = getLogger(ProductItem.class.getName());
    
    private final Integer id;
    private final String name;
    private final Float price;
    private final String barcode;
    
    /**
     *
     * @param id
     * @param name
     * @param price
     * @param barcode
     */
    public ProductItem(Integer id,String name,Float price, String barcode){
        this.id=id;
        this.name=name;
        this.price=price;
        this.barcode=barcode;
        
        LOG.log(Level.INFO, "Product is set");
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @return the barcode
     */
    public String getBarcode() {
        return barcode;
    }

    
}
