
package contactomaestro;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author isifi
 */
public class EditarContacto extends javax.swing.JFrame {

    Principal vprincipal;
    
    public EditarContacto() {
        initComponents();
    }
    
    public EditarContacto(Principal p){
        initComponents();
        this.vprincipal = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFieldCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblFijo = new javax.swing.JLabel();
        cBoxPrefijoFijo = new javax.swing.JComboBox<>();
        txtFieldFijo = new javax.swing.JTextField();
        txtFieldTfno = new javax.swing.JTextField();
        cBoxPrefijoMovil = new javax.swing.JComboBox<>();
        lblTfno = new javax.swing.JLabel();
        btnFoto = new javax.swing.JButton();
        lblApellidos = new javax.swing.JLabel();
        txtFieldApellidos = new javax.swing.JTextField();
        txtFieldNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setTitle("Editar contacto");

        jLabel1.setText("*Correo electrónico:");

        lblFijo.setText("*Teléfono Fijo:");

        cBoxPrefijoFijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+34", "+33", "+351", "+1" }));

        txtFieldFijo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldFijoKeyTyped(evt);
            }
        });

        txtFieldTfno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldTfnoKeyTyped(evt);
            }
        });

        cBoxPrefijoMovil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+34", "+33", "+351", "+1" }));

        lblTfno.setText("*Teléfono Móvil:");

        btnFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contactomaestro/Contacto.png"))); // NOI18N
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });

        lblApellidos.setText("*Apellidos:");

        txtFieldApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldApellidosKeyTyped(evt);
            }
        });

        txtFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldNombreKeyTyped(evt);
            }
        });

        lblNombre.setText("*Nombre:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblFijo)
                                .addGap(18, 18, 18)
                                .addComponent(cBoxPrefijoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTfno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cBoxPrefijoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldCorreo)
                            .addComponent(txtFieldFijo)
                            .addComponent(txtFieldTfno))))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidos)
                            .addComponent(txtFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTfno)
                    .addComponent(cBoxPrefijoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldTfno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFijo)
                    .addComponent(cBoxPrefijoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        cBoxPrefijoMovil.setSelectedItem(+34);
        cBoxPrefijoMovil.setSelectedItem(+34);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldFijoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldFijoKeyTyped
        if (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z' || evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFieldFijoKeyTyped

    private void txtFieldTfnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldTfnoKeyTyped
        if (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z' || evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFieldTfnoKeyTyped

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        JFileChooser fichero = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imágenes .jpg", "jpg");
        fichero.setFileFilter(filter);
        fichero.setMultiSelectionEnabled(false);
        int respuesta = fichero.showOpenDialog(null);

        fichero.setDialogTitle("Selecciona una imagen");

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "La foto " + fichero.getSelectedFile().getAbsolutePath() + " se ha seleccionado", "Correcto", JOptionPane.PLAIN_MESSAGE);
        }
        if (respuesta == JFileChooser.ERROR_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "La selección ha fallado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (respuesta == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "La selección se ha cancelado", "Selección Cancelada", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnFotoActionPerformed

    private void txtFieldApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldApellidosKeyTyped
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFieldApellidosKeyTyped

    private void txtFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldNombreKeyTyped
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFieldNombreKeyTyped

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
                int index= vprincipal.listContactos.getSelectedIndex();
                Contacto persona=(Contacto)vprincipal.listaContactosObjeto.getElementAt(index);
                String nombre,apellidos,prefijo1,tfno,prefijo2,fijo,mail;
                nombre = txtFieldNombre.getText();
                apellidos = txtFieldApellidos.getText();
                prefijo1 = cBoxPrefijoMovil.getSelectedItem().toString();
                prefijo2 = cBoxPrefijoFijo.getSelectedItem().toString();
                tfno = txtFieldTfno.getText();
                fijo = txtFieldFijo.getText();
                mail = txtFieldCorreo.getText();
               Contacto persona2 = new Contacto(nombre,apellidos,mail,prefijo1,tfno,prefijo2,fijo,"NO","NO");
               vprincipal.listaContactosObjeto.addElement(persona2);
               vprincipal.listaContactosObjeto.removeElement(persona);
               this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


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
            java.util.logging.Logger.getLogger(EditarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    javax.swing.JButton btnFoto;
    javax.swing.JComboBox<String> cBoxPrefijoFijo;
    javax.swing.JComboBox<String> cBoxPrefijoMovil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblFijo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTfno;
    javax.swing.JTextField txtFieldApellidos;
    javax.swing.JTextField txtFieldCorreo;
    javax.swing.JTextField txtFieldFijo;
    javax.swing.JTextField txtFieldNombre;
    javax.swing.JTextField txtFieldTfno;
    // End of variables declaration//GEN-END:variables
}
