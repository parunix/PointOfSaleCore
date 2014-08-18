package com.sale.pointofsalecore.tools;

import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author parun
 */
public class ScannerCodes {

    /**
     *
     */
    public static final String PRODUCT_NOT_FOUND = "Product not found";

    /**
     *
     */
    public static final String INVALID_BAR_CODE = "Invalid bar-code";

    /**
     *
     */
    public static final String PRODUCT_FOUND = "Product found";

    private static final Logger LOG = getLogger(ScannerCodes.class.getName());

    private ScannerCodes() {
        LOG.log(Level.FINE, "Scaner started");
    }

}
