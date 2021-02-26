
package contactomaestro;

/**
 *
 * @author isifi
 */
public class BandejaSalida extends javax.swing.JFrame {

    Principal p;
    VisualizarMensaje v = new VisualizarMensaje(this);

    public BandejaSalida() {
        initComponents();
    }

    public BandejaSalida(Principal p) {
        initComponents();
        this.p = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listSMS = new javax.swing.JList<>();
        btnAbrirSMS = new javax.swing.JButton();
        btnBorrarSMS = new javax.swing.JButton();

        setTitle("Bandeja de salida de SMS");

        listSMS.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listSMS);

        btnAbrirSMS.setText("Abrir mensaje");
        btnAbrirSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirSMSActionPerformed(evt);
            }
        });

        btnBorrarSMS.setText("Borrar mensaje");
        btnBorrarSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarSMSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBorrarSMS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbrirSMS)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirSMS)
                    .addComponent(btnBorrarSMS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirSMSActionPerformed
        v.setVisible(true);
        if (!listSMS.isSelectionEmpty()) {
            int index = this.listSMS.getSelectedIndex();       //Jlist
            MensajesSms m = (MensajesSms) p.listaSMS.getElementAt(index);    //default
            v.txtFieldEnviadoA.setText(m.getDestinatario());
            v.txtFieldEnviadoA.setEditable(false);
            v.txtAreaContenidoMensaje.setText(m.getMensaje());
            v.txtAreaContenidoMensaje.setEditable(false);
        }

    }//GEN-LAST:event_btnAbrirSMSActionPerformed

    private void btnBorrarSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarSMSActionPerformed
            if (!listSMS.isSelectionEmpty()) {
            int index = this.listSMS.getSelectedIndex();
            MensajesSms m = (MensajesSms) p.listaSMS.getElementAt(index);
            p.listaSMS.removeElement(m);   
            }

    }//GEN-LAST:event_btnBorrarSMSActionPerformed

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
            java.util.logging.Logger.getLogger(BandejaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BandejaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BandejaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BandejaSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BandejaSalida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirSMS;
    private javax.swing.JButton btnBorrarSMS;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JList<String> listSMS;
    // End of variables declaration//GEN-END:variables
}
