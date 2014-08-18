package com.sale.pointofsalecore.devices;

import com.sale.pointofsalecore.data.ProductDataBase;
import com.sale.pointofsalecore.data.ProductItem;
import com.sale.pointofsalecore.tools.ScannerCodes;
import java.util.logging.Level;
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
    private ProductItem productItem;

    /**
     *
     */
    private String scannerCode;

    /**
     *
     * @param barCode
     */
    public BarCodeScanner(String barCode) {

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
        LOG.log(Level.INFO, scannerCode);
    }

    /**
     * @return the productItem
     */
    public ProductItem getProductItem() {
        return productItem;
    }

    /**
     * @param productItem the productItem to set
     */
    public void setProductItem(ProductItem productItem) {
        this.productItem = productItem;
    }

    /**
     * @return the scannerCode
     */
    public String getScannerCode() {
        return scannerCode;
    }

    /**
     * @param scannerCode the scannerCode to set
     */
    public void setScannerCode(String scannerCode) {
        this.scannerCode = scannerCode;
    }
}
