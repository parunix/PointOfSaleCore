package com.sale.pointofsalecore;

import com.sale.pointofsalecore.data.ProductItem;
import com.sale.pointofsalecore.devices.BarCodeScanner;
import com.sale.pointofsalecore.devices.LcdDisplay;
import com.sale.pointofsalecore.devices.PrinterDevice;
import com.sale.pointofsalecore.tools.ScannerCodes;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author parun
 */
public class Sale {
    private static final Logger LOG = getLogger(Sale.class.getName());

    private BarCodeScanner barCodeScanner;
    private PrinterDevice printerDevice;
    private LcdDisplay lcd;

    /**
     *
     * @return
     */
    public LcdDisplay getLcd() {
        return lcd;
    }

    /**
     *
     * @return
     */
    public PrinterDevice getPrinterDevice() {
        return printerDevice;
    }

    /**
     *
     * @param barCode
     * @return
     */
    public String itemProcessing(String barCode) {
        
        LOG.log(Level.INFO, barCode);
        
        barCodeScanner = new BarCodeScanner(barCode);
        lcd = new LcdDisplay();
        if (barCodeScanner.getScannerCode().equals(ScannerCodes.PRODUCT_FOUND)) {
            lcd.setMessage(barCodeScanner.getProductItem().getName() + "  "
                    + barCodeScanner.getProductItem().getPrice() + " PLN");
        } else {
            lcd.setMessage(barCodeScanner.getScannerCode());
        }
        return lcd.getMessage();
    }

    /**
     *
     * @param barCodes
     */
    public void countSum(List<String> barCodes) {
        
        for(String m : barCodes){
            LOG.log(Level.FINE, m);
        }
        
        printerDevice = new PrinterDevice();
        lcd = new LcdDisplay();
        List<String> billList = new ArrayList<>();
        List<ProductItem> products = new ArrayList<>();
        String summary;
        float sum = 0.0f;

        for (String s : barCodes) {
            if (checkCodeInDb(s) != null) {
                products.add(checkCodeInDb(s));
            }
        }

        for (ProductItem p : products) {
            billList.add(p.getName() + " " + valueOf(p.getPrice()));
            sum += p.getPrice();
        }

        summary = "Sum: " + valueOf(sum);

        billList.add(summary);

        printerDevice.setBill(billList);
        lcd.setMessage(summary);

    }

    private ProductItem checkCodeInDb(String barCode) {

        ProductItem productItem;

        barCodeScanner = new BarCodeScanner(barCode);

        if (barCodeScanner.getScannerCode().equals(ScannerCodes.PRODUCT_FOUND)) {
            productItem = barCodeScanner.getProductItem();
        } else {
            productItem = null;
        }
        return productItem;
    }
}
