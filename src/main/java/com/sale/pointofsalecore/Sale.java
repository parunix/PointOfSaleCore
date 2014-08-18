package com.sale.pointofsalecore;

import com.sale.pointofsalecore.data.ProductItem;
import com.sale.pointofsalecore.devices.BarCodeScanner;
import com.sale.pointofsalecore.devices.LcdDisplay;
import com.sale.pointofsalecore.devices.PrinterDevice;
import com.sale.pointofsalecore.tools.ScannerCodes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bartosz Cichowicz
 */
public class Sale {

    private BarCodeScanner barCodeScanner;
    private PrinterDevice printerDevice;
    private LcdDisplay lcd;

    public LcdDisplay getLcd() {
        return lcd;
    }

    public PrinterDevice getPrinterDevice() {
        return printerDevice;
    }

    public String itemProcessing(String barCode) {
        barCodeScanner = new BarCodeScanner(barCode);
        lcd = new LcdDisplay();
        if (barCodeScanner.scannerCode.equals(ScannerCodes.PRODUCT_FOUND)) {
            lcd.setMessage(barCodeScanner.productItem.getName() + "  "
                    + barCodeScanner.productItem.getPrice() + " PLN");
        } else {
            lcd.setMessage(barCodeScanner.scannerCode);
        }
        return lcd.getMessage();
    }

    public void countSum(List<String> barCodes) {
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
            billList.add(p.getName() + " " + String.valueOf(p.getPrice()));
            sum += p.getPrice();
        }

        summary = "Sum: " + String.valueOf(sum);

        billList.add(summary);

        printerDevice.setBill(billList);
        lcd.setMessage(summary);

    }

    private ProductItem checkCodeInDb(String barCode) {

        ProductItem productItem;

        barCodeScanner = new BarCodeScanner(barCode);

        if (barCodeScanner.scannerCode.equals(ScannerCodes.PRODUCT_FOUND)) {
            productItem = barCodeScanner.productItem;
        } else {
            productItem = null;
        }
        return productItem;
    }
}
