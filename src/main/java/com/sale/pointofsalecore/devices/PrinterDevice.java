package com.sale.pointofsalecore.devices;

import static java.lang.String.valueOf;
import static java.util.Collections.unmodifiableList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author parun
 */
public class PrinterDevice {
    private static final Logger LOG = getLogger(PrinterDevice.class.getName());
    
    private List<String> bill;

    /**
     * @return the bill
     */
    public List<String> getBill() {
        return unmodifiableList(bill);
    }

    /**
     * @param bill the bill to set
     */
    public void setBill(List<String> bill) {
        this.bill = bill;
        LOG.log(Level.FINE, valueOf(bill.size()));
    }
}
