package com.sale.pointofsalecore.devices;

import java.util.List;

/**
 *
 * @author Bartosz Cichowicz
 */
public class PrinterDevice {
    
    private List<String> bill;

    /**
     * @return the bill
     */
    public List<String> getBill() {
        return bill;
    }

    /**
     * @param bill the bill to set
     */
    public void setBill(List<String> bill) {
        this.bill = bill;
    }
}
