package com.sale.pointofsalecore;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Bartosz Cichowicz
 */
public class PointOfSaleFrame extends javax.swing.JFrame {

    private final List<String> basketItems;
    private List<String> selectedBasketItems;
    private Sale sale;

    private int currentBasketItemCounter;
    private int[] selectedIx;

    /**
     * Creates new form PointOfSaleFrame
     *
     * @param basketItems
     */
    public PointOfSaleFrame(List<String> basketItems) {
        this.basketItems = basketItems;

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(PointOfSaleFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
    }

    private String[] createBasketList() {
        return basketItems.toArray(new String[basketItems.size()]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPointOfSale = new javax.swing.JPanel();
        jPanelOutPuts = new javax.swing.JPanel();
        jScrollPanePrinter = new javax.swing.JScrollPane();
        jTextAreaPrinter = new javax.swing.JTextArea();
        jScrollPaneLcd = new javax.swing.JScrollPane();
        jTextAreaLcd = new javax.swing.JTextArea();
        jLabelStatus = new javax.swing.JLabel();
        jPanelInputs = new javax.swing.JPanel();
        jPanelControl = new javax.swing.JPanel();
        jToggleButtonStart = new javax.swing.JToggleButton();
        jButtonScan = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jScrollPanelBasket = new javax.swing.JScrollPane();
        jListBasket = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PointOfSale");
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanelPointOfSale.setLayout(new javax.swing.BoxLayout(jPanelPointOfSale, javax.swing.BoxLayout.LINE_AXIS));

        jPanelOutPuts.setLayout(new java.awt.BorderLayout());

        jTextAreaPrinter.setEditable(false);
        jTextAreaPrinter.setColumns(20);
        jTextAreaPrinter.setRows(5);
        jTextAreaPrinter.setName("printer"); // NOI18N
        jScrollPanePrinter.setViewportView(jTextAreaPrinter);

        jPanelOutPuts.add(jScrollPanePrinter, java.awt.BorderLayout.CENTER);

        jTextAreaLcd.setEditable(false);
        jTextAreaLcd.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaLcd.setColumns(20);
        jTextAreaLcd.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jTextAreaLcd.setForeground(new java.awt.Color(0, 153, 153));
        jTextAreaLcd.setRows(5);
        jScrollPaneLcd.setViewportView(jTextAreaLcd);

        jPanelOutPuts.add(jScrollPaneLcd, java.awt.BorderLayout.PAGE_START);

        jLabelStatus.setText("Status");
        jPanelOutPuts.add(jLabelStatus, java.awt.BorderLayout.PAGE_END);

        jPanelPointOfSale.add(jPanelOutPuts);

        jPanelInputs.setLayout(new java.awt.BorderLayout());

        jPanelControl.setLayout(new javax.swing.BoxLayout(jPanelControl, javax.swing.BoxLayout.LINE_AXIS));

        jToggleButtonStart.setText("Ready");
        jToggleButtonStart.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonStartActionPerformed(evt);
            }
        });
        jPanelControl.add(jToggleButtonStart);
        jToggleButtonStart.getAccessibleContext().setAccessibleDescription("");

        jButtonScan.setText("Scan");
        jButtonScan.setEnabled(false);
        jButtonScan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonScanActionPerformed(evt);
            }
        });
        jPanelControl.add(jButtonScan);

        jButtonExit.setText("Exit");
        jButtonExit.setEnabled(false);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanelControl.add(jButtonExit);

        jPanelInputs.add(jPanelControl, java.awt.BorderLayout.PAGE_START);

        jListBasket.setModel(new javax.swing.AbstractListModel() {
            String[] strings = createBasketList();
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListBasket.setToolTipText("Put item to buy into basket"); // NOI18N
        jScrollPanelBasket.setViewportView(jListBasket);
        jListBasket.setSelectionModel(new DefaultListSelectionModel() {
            public void setSelectionInterval(int index0, int index1) {
                if (isSelectedIndex(index0))
                super.removeSelectionInterval(index0, index1);
                else
                super.addSelectionInterval(index0, index1);
            }
        });

        jPanelInputs.add(jScrollPanelBasket, java.awt.BorderLayout.CENTER);

        jPanelPointOfSale.add(jPanelInputs);

        getContentPane().add(jPanelPointOfSale);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonStartActionPerformed

        jTextAreaPrinter.setText(null);
        jButtonScan.setEnabled(true);
        jButtonExit.setEnabled(true);
        jListBasket.setEnabled(false);
        selectedBasketItems = new ArrayList<>();
        selectedBasketItems = jListBasket.getSelectedValuesList();
        selectedIx = jListBasket.getSelectedIndices();
        jToggleButtonStart.setEnabled(false);
        jTextAreaLcd.setText(null);

    }//GEN-LAST:event_jToggleButtonStartActionPerformed

    private void jButtonScanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonScanActionPerformed

            sale = new Sale();
            if (currentBasketItemCounter < selectedIx.length) {
                jTextAreaLcd.setText(sale.itemProcessing(
                        selectedBasketItems.get(currentBasketItemCounter)));
                jListBasket.removeSelectionInterval(
                        selectedIx[currentBasketItemCounter], 
                        selectedIx[currentBasketItemCounter]);
                currentBasketItemCounter += 1;
            }

        
    }//GEN-LAST:event_jButtonScanActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        
        
        jToggleButtonStart.setEnabled(true);
        jButtonScan.setEnabled(false);
        jButtonExit.setEnabled(false);
        jListBasket.setEnabled(true);
        jListBasket.clearSelection();
        sale.countSum(selectedBasketItems);
        
        jTextAreaLcd.setText(sale.getLcd().getMessage());
        
        for(String s : sale.getPrinterDevice().getBill()){
            jTextAreaPrinter.append(s);
            jTextAreaPrinter.append("\n");
        }
        
        
        selectedBasketItems = new ArrayList<>();
        currentBasketItemCounter = 0;
        
        sale = new Sale();
        
        
    }//GEN-LAST:event_jButtonExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonScan;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JList jListBasket;
    private javax.swing.JPanel jPanelControl;
    private javax.swing.JPanel jPanelInputs;
    private javax.swing.JPanel jPanelOutPuts;
    private javax.swing.JPanel jPanelPointOfSale;
    private javax.swing.JScrollPane jScrollPaneLcd;
    private javax.swing.JScrollPane jScrollPanePrinter;
    private javax.swing.JScrollPane jScrollPanelBasket;
    private javax.swing.JTextArea jTextAreaLcd;
    private javax.swing.JTextArea jTextAreaPrinter;
    private javax.swing.JToggleButton jToggleButtonStart;
    // End of variables declaration//GEN-END:variables
}