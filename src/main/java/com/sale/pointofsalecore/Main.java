package com.sale.pointofsalecore;

import com.sale.pointofsalecore.data.Basket;
import com.sale.pointofsalecore.data.ProductDataBase;
import static java.awt.EventQueue.invokeLater;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author parun
 */
public class Main {

    private static final Logger LOG = getLogger(Main.class.getName());

    private Main() {
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ProductDataBase pd = new ProductDataBase();

        LOG.log(Level.INFO, pd.getClass().getName().concat(" database created"));
        final Basket basket = new Basket();
        basket.setBasketItems("1111", "2222", "3333", "4444", "5555", "6666", "7777", "8888", "9999", "5678", "1234");

        invokeLater(new Runnable() {
            @Override
            public void run() {
                new PointOfSaleFrame(basket.getBasketItems()).setVisible(true);
            }
        });
    }
}
