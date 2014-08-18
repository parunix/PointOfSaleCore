package com.sale.pointofsalecore.devices;

import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;

/**
 *
 * @author parun
 */
public class LcdDisplay {
    private static final Logger LOG = getLogger(LcdDisplay.class.getName());
    
    private String message;

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        LOG.log(Level.INFO, message);
        this.message = message;
    }
    
    
}
