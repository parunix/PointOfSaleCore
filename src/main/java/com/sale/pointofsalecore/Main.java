package com.sale.pointofsalecore;

import com.sale.pointofsalecore.data.Basket;
import com.sale.pointofsalecore.data.ProductDataBase;


/**
 *
 * @author Bartosz Cichowicz
 */
public class Main {

    public static void main(String args[]) {
        ProductDataBase pd = new ProductDataBase();

        final Basket basket = new Basket();
        basket.setBasketItems("1111", "2222", "3333", "4444", "5555", "6666", "7777", "8888", "9999", "5678", "1234");

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PointOfSaleFrame(basket.getBasketItems()).setVisible(true);
            }
        });

    }
}
