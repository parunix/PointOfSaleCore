package com.sale.pointofsalecore.data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bartosz Cichowicz
 */
public class ProductDataBase {

    private ProductItem productItem;

    /**
     * available product Items List
     */
    public static final List<ProductItem> PRODUCT_LIST = new ArrayList<>();

    public ProductDataBase() {
        productItem=new ProductItem();
        productItem.setId(1);
        productItem.setName("Cola");
        productItem.setPrice(9.2f);
        productItem.setBarcode("1234");
        PRODUCT_LIST.add(productItem);
        productItem=new ProductItem();
        productItem.setId(2);
        productItem.setName("Arbuz");
        productItem.setPrice(10.2f);
        productItem.setBarcode("5678");
        PRODUCT_LIST.add(productItem);
        productItem=new ProductItem();
        productItem.setId(3);
        productItem.setName("Jablka");
        productItem.setPrice(11.2f);
        productItem.setBarcode("9999");
        PRODUCT_LIST.add(productItem);
    }
}