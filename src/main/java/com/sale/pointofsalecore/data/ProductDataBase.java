package com.sale.pointofsalecore.data;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author parun
 */
public class ProductDataBase {


    /**
     * available product Items List
     */
    public static final List<ProductItem> PRODUCT_LIST = new ArrayList<>();
    private static final Logger LOG = getLogger(ProductDataBase.class.getName());
    private ProductItem product;

    /**
     *
     */
    public ProductDataBase() {
        product = new ProductItem(1,"Cola",9.2f,"1234");
        PRODUCT_LIST.add(product);
        product = new ProductItem(2,"Arbuz",10.2f,"5678");
        PRODUCT_LIST.add(product);
        product = new ProductItem(3,"Jablka",11.2f,"9999");
        PRODUCT_LIST.add(product);
        LOG.log(Level.FINE, "DataCreated");
    }
}