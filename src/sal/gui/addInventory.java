
package sal.gui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Salvatore Minasola
 */
public class addInventory extends javax.swing.JDialog {

    private DefaultTableModel model;
    private JLabel label;
    /**
     * Creates new form addInventory
     */
    public addInventory(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setTitle("Aggiungi prodotto in inventario");
        initComponents();
    }
    
    public addInventory(java.awt.Frame parent, boolean modal,DefaultTableModel model,JLabel label) {
        super(parent, modal);
        setTitle("Aggiungi prodotto in inventario");
        this.model = model;
        this.label = label;
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codice = new javax.swing.JTextField();
        denominazione = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_add1 = new javax.swing.JButton();
        prezzo = new javax.swing.JFormattedTextField();
        quantita = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(378, 228));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("CODICE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("NOME");
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 31));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("PREZZO");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("QUANTITA");

        codice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        codice.setText("Inserisci codice");
        codice.setPreferredSize(new java.awt.Dimension(64, 28));
        codice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codiceActionPerformed(evt);
            }
        });
        codice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codiceKeyPressed(evt);
            }
        });

        denominazione.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        denominazione.setPreferredSize(new java.awt.Dimension(64, 28));
        denominazione.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                denominazioneMousePressed(evt);
            }
        });
        denominazione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denominazioneActionPerformed(evt);
            }
        });
        denominazione.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                denominazioneKeyPressed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(51, 204, 0));
        btn_add.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_add.setText("AGGIUNGI");
        btn_add.setMaximumSize(new java.awt.Dimension(85, 23));
        btn_add.setPreferredSize(new java.awt.Dimension(120, 35));
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_addMousePressed(evt);
            }
        });
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_add1.setBackground(new java.awt.Color(255, 51, 51));
        btn_add1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_add1.setText("ANNULLA");
        btn_add1.setMaximumSize(new java.awt.Dimension(85, 23));
        btn_add1.setPreferredSize(new java.awt.Dimension(120, 35));
        btn_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add1ActionPerformed(evt);
            }
        });

        prezzo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        prezzo.setText("0.00");
        prezzo.setMargin(null);
        prezzo.setMinimumSize(new java.awt.Dimension(64, 31));
        prezzo.setPreferredSize(new java.awt.Dimension(64, 31));
        prezzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                prezzoMousePressed(evt);
            }
        });
        prezzo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prezzoActionPerformed(evt);
            }
        });
        prezzo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prezzoKeyPressed(evt);
            }
        });

        quantita.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        quantita.setText("0");
        quantita.setMargin(null);
        quantita.setMinimumSize(new java.awt.Dimension(64, 31));
        quantita.setPreferredSize(new java.awt.Dimension(64, 31));
        quantita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                quantitaMousePressed(evt);
            }
        });
        quantita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantitaActionPerformed(evt);
            }
        });
        quantita.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantitaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prezzo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantita, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(denominazione, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(28, 28, 28)
                                .addComponent(codice, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(denominazione, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prezzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codiceActionPerformed
        if(denominazione.getText().equals("Inserisci descrizione")){
            denominazione.setText("");
        }
        denominazione.requestFocus();
        if(prezzo.getText().equals("0.00")){
            prezzo.setText("");
        }
        prezzo.requestFocus();
    }//GEN-LAST:event_codiceActionPerformed

    private void denominazioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denominazioneActionPerformed
        if(codice.getText().equals("Inserisci codice")){
            codice.setText("");
        }
        codice.requestFocus();
    }//GEN-LAST:event_denominazioneActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void btn_addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMousePressed
        errorMsg err = new errorMsg(null,true);
        err.setLocationRelativeTo(this);
        if(codice.getText().equals("")){ 
            err.setMessage("Il campo codice non puo essere vuoto.");
            err.show();
        } else if(codice.getText().matches(".*[^a-zA-Z0-9].*")){
            err.setMessage("Il campo codice non puo contenere carratteri speciali.");
            err.show();
        }else if(denominazione.getText().equals("")){
            err.setMessage("Il campo denominazione non puo essere vuoto.");
            err.show();
        }else if(denominazione.getText().matches(".*\\\\s[^a-zA-Z0-9]\\\\s.*")){
            err.setMessage("Il campo denominazione non puo contenere carratteri speciali.");
            err.show();
        } else if(prezzo.getText().equals("")){
            err.setMessage("Il campo prezzo non puo essere vuoto.");
            err.show();
        } else if(!prezzo.getText().matches("[0-9,.]+")){
            err.setMessage("Il campo prezzo deve contenere solo numeri");
            err.setVisible(true);
        } else if(!quantita.getText().matches("[0-9]+")){
            err.setMessage("Il campo quantita' deve contenere solo numeri");
            err.setVisible(true);
        }else if(quantita.getText().equals("")){
            err.setMessage("Il campo quantita' non puo essere vuoto.");
            err.show();
        }else {
            model.addRow(new Object[]{denominazione.getText(), codice.getText(), Float.valueOf(prezzo.getText().replace(",", ".")), Integer.valueOf(quantita.getText())});
            label.setText(String.valueOf(Home.countItemsInventory(model)));
            try {
                sal.gui.core.fileUtils.salvaInventario(model, "./inventario.txt");
            } catch (IOException ex) {
                Logger.getLogger(addInventory.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
        
        
        
        
    }//GEN-LAST:event_btn_addMousePressed

    private void prezzoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prezzoActionPerformed
      if(quantita.getText().equals("0")){
            quantita.setText("");
        }
        quantita.requestFocus();
    }//GEN-LAST:event_prezzoActionPerformed

    private void quantitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantitaActionPerformed
    errorMsg err = new errorMsg(null,true);
        err.setLocationRelativeTo(this);
        if(codice.getText().equals("")){ 
            err.setMessage("Il campo codice non puo essere vuoto.");
            err.show();
        } else if(codice.getText().matches(".*[^a-zA-Z0-9].*")){
            err.setMessage("Il campo codice non puo contenere carratteri speciali.");
            err.show();
        }else if(denominazione.getText().equals("")){
            err.setMessage("Il campo denominazione non puo essere vuoto.");
            err.show();
        }else if(denominazione.getText().matches(".*[^a-zA-Z0-9].*")){
            err.setMessage("Il campo denominazione non puo contenere carratteri speciali.");
            err.show();
        } else if(prezzo.getText().equals("")){
            err.setMessage("Il campo prezzo non puo essere vuoto.");
            err.show();
        } else if(quantita.getText().equals("")){
            err.setMessage("Il campo quantita' non puo essere vuoto.");
            err.show();
        }else {
            model.addRow(new Object[]{codice.getText(), denominazione.getText(), Float.valueOf(prezzo.getText().replace(",", ".")), Integer.valueOf(quantita.getText())});
            label.setText(String.valueOf(Home.countItemsInventory(model)));
            model.fireTableDataChanged();
            try {
                sal.gui.core.fileUtils.salvaInventario(model, "./inventario.txt");
            } catch (IOException ex) {
                Logger.getLogger(addInventory.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();   
        }
    }//GEN-LAST:event_quantitaActionPerformed

    private void prezzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prezzoMousePressed
        if(prezzo.getText().equals("0.00")){
            prezzo.setText("");
        }
    }//GEN-LAST:event_prezzoMousePressed

    private void quantitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quantitaMousePressed
        if(quantita.getText().equals("0")){
            quantita.setText("");
        }
    }//GEN-LAST:event_quantitaMousePressed

    private void denominazioneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_denominazioneMousePressed
        if(denominazione.getText().equals("Inserisci descrizione")){
            denominazione.setText("");
        }
    }//GEN-LAST:event_denominazioneMousePressed

    private void codiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codiceKeyPressed
        
    }//GEN-LAST:event_codiceKeyPressed

    private void denominazioneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_denominazioneKeyPressed

    }//GEN-LAST:event_denominazioneKeyPressed

    private void prezzoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prezzoKeyPressed
        
    }//GEN-LAST:event_prezzoKeyPressed

    private void quantitaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantitaKeyPressed
        
    }//GEN-LAST:event_quantitaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addInventory dialog = new addInventory(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_add1;
    private javax.swing.JTextField codice;
    private javax.swing.JTextField denominazione;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField prezzo;
    private javax.swing.JFormattedTextField quantita;
    // End of variables declaration//GEN-END:variables
}