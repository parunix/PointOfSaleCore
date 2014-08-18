package com.sale.pointofsalecore.devices;

import com.sale.pointofsalecore.data.ProductDataBase;
import com.sale.pointofsalecore.data.ProductItem;
import com.sale.pointofsalecore.tools.ScannerCodes;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author parun
 */
public class BarCodeScanner {
    private static final Logger LOG = getLogger(BarCodeScanner.class.getName());

    /**
     *
     */
    public ProductItem productItem;

    /**
     *
     */
    public String scannerCode;

    /**
     *
     * @param barCode
     */
    public BarCodeScanner(String barCode) {

        productItem = new ProductItem();
        
        //System.out.println(barCode);

        if (!barCode.isEmpty()) {

            for (ProductItem p : ProductDataBase.PRODUCT_LIST) {
                if (p.getBarcode().equals(barCode)) {
                    productItem = p;
                    scannerCode = ScannerCodes.PRODUCT_FOUND;
                    break;
                } else {
                    scannerCode = ScannerCodes.PRODUCT_NOT_FOUND;
                }
            }
        } else {
            productItem = null;
            scannerCode = ScannerCodes.INVALID_BAR_CODE;
        }
    }
}
