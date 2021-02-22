/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactomaestro;

import javax.swing.JOptionPane;
import java.util.Random;
/**
 *
 * @author isifi
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        tabPestanas = new javax.swing.JTabbedPane();
        panelContactos = new javax.swing.JPanel();
        btnLlamar = new javax.swing.JButton();
        btnSms = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listContactos = new javax.swing.JList<>();
        btnBorrar = new javax.swing.JButton();
        btnFav = new javax.swing.JButton();
        btnBloquear = new javax.swing.JButton();
        tabConfiguracion = new javax.swing.JPanel();
        tabFavoritos = new javax.swing.JPanel();
        tabInformacion = new javax.swing.JPanel();
        lblAutor = new javax.swing.JLabel();
        lblAutor2 = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        lblContacto = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        panelListaNegra = new javax.swing.JPanel();
        panelAñadirContactos = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtFieldNombre = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtFieldApellidos = new javax.swing.JTextField();
        lblTfno = new javax.swing.JLabel();
        txtFieldTfno = new javax.swing.JTextField();
        cBoxPrefijo = new javax.swing.JComboBox<>();
        lblEasterEgg = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuContactoMaestro = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ContactoMaestro");

        btnLlamar.setText("Llamar");

        btnSms.setText("SMS");

        jButton1.setText("Editar");

        listContactos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listContactos);

        btnBorrar.setText("Borrar");

        btnFav.setText("Añadir a favoritos");

        btnBloquear.setText("Bloquear");

        javax.swing.GroupLayout panelContactosLayout = new javax.swing.GroupLayout(panelContactos);
        panelContactos.setLayout(panelContactosLayout);
        panelContactosLayout.setHorizontalGroup(
            panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContactosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLlamar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBloquear, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFav, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(btnSms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelContactosLayout.setVerticalGroup(
            panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLlamar)
                    .addComponent(jButton1)
                    .addComponent(btnSms))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(btnFav)
                    .addComponent(btnBloquear))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        tabPestanas.addTab("Contactos", panelContactos);

        javax.swing.GroupLayout tabConfiguracionLayout = new javax.swing.GroupLayout(tabConfiguracion);
        tabConfiguracion.setLayout(tabConfiguracionLayout);
        tabConfiguracionLayout.setHorizontalGroup(
            tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        tabConfiguracionLayout.setVerticalGroup(
            tabConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        tabPestanas.addTab("Configuración", tabConfiguracion);

        javax.swing.GroupLayout tabFavoritosLayout = new javax.swing.GroupLayout(tabFavoritos);
        tabFavoritos.setLayout(tabFavoritosLayout);
        tabFavoritosLayout.setHorizontalGroup(
            tabFavoritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        tabFavoritosLayout.setVerticalGroup(
            tabFavoritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        tabPestanas.addTab("Favoritos", tabFavoritos);

        lblAutor.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblAutor.setText("Trabajo realizado por Isidro Benitez");

        lblAutor2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblAutor2.setText("Para la asignatura CPM de Ing Informática");

        lblVersion.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblVersion.setText("Versión final 1.0 no distribuíble");

        lblContacto.setText("Para sugerencias de mejoras, errores u otros sobre el programa contactar a:");

        lblMail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblMail.setText("UO285039@uniovi.es");

        javax.swing.GroupLayout tabInformacionLayout = new javax.swing.GroupLayout(tabInformacion);
        tabInformacion.setLayout(tabInformacionLayout);
        tabInformacionLayout.setHorizontalGroup(
            tabInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabInformacionLayout.createSequentialGroup()
                .addGroup(tabInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabInformacionLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblVersion))
                    .addGroup(tabInformacionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(tabInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContacto)
                            .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tabInformacionLayout.createSequentialGroup()
                .addGroup(tabInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabInformacionLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lblAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabInformacionLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tabInformacionLayout.setVerticalGroup(
            tabInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabInformacionLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMail)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        tabPestanas.addTab("Información", tabInformacion);

        javax.swing.GroupLayout panelListaNegraLayout = new javax.swing.GroupLayout(panelListaNegra);
        panelListaNegra.setLayout(panelListaNegraLayout);
        panelListaNegraLayout.setHorizontalGroup(
            panelListaNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        panelListaNegraLayout.setVerticalGroup(
            panelListaNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        tabPestanas.addTab("Lista Negra", panelListaNegra);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contactomaestro/contact.png"))); // NOI18N

        lblNombre.setText("Nombre:");

        lblApellidos.setText("Apellidos:");

        lblTfno.setText("Número de Contacto:");

        cBoxPrefijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+34", "+33", "+351", "+1" }));

        javax.swing.GroupLayout panelAñadirContactosLayout = new javax.swing.GroupLayout(panelAñadirContactos);
        panelAñadirContactos.setLayout(panelAñadirContactosLayout);
        panelAñadirContactosLayout.setHorizontalGroup(
            panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                        .addComponent(lblTfno)
                        .addGap(25, 25, 25)
                        .addComponent(cBoxPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                        .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblApellidos))
                        .addGap(18, 18, 18)
                        .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(txtFieldNombre)))
                    .addComponent(txtFieldTfno))
                .addContainerGap())
        );
        panelAñadirContactosLayout.setVerticalGroup(
            panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidos)
                            .addComponent(txtFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTfno)
                    .addComponent(txtFieldTfno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        cBoxPrefijo.setSelectedItem(+34);

        tabPestanas.addTab("Añadir Contacto", panelAñadirContactos);

        lblEasterEgg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEasterEggMouseClicked(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contactomaestro/LOGO.png"))); // NOI18N

        menuContactoMaestro.setText("ContactoMaestro");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Importar contactos");
        menuContactoMaestro.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Salir");
        menuContactoMaestro.add(jMenuItem2);

        jMenuBar1.add(menuContactoMaestro);

        menuEditar.setText("Editar");
        jMenuBar1.add(menuEditar);

        menuAyuda.setText("Ayuda");
        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(lblEasterEgg, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addComponent(tabPestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblEasterEgg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(tabPestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblEasterEggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEasterEggMouseClicked
        generaQuoteEasterEgg();
        JOptionPane.showMessageDialog(rootPane,message,messagewindow, JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_lblEasterEggMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBloquear;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnFav;
    private javax.swing.JButton btnLlamar;
    private javax.swing.JButton btnSms;
    private javax.swing.JComboBox<String> cBoxPrefijo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAutor2;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblEasterEgg;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTfno;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JList<String> listContactos;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuContactoMaestro;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JPanel panelAñadirContactos;
    private javax.swing.JPanel panelContactos;
    private javax.swing.JPanel panelListaNegra;
    private javax.swing.JPanel tabConfiguracion;
    private javax.swing.JPanel tabFavoritos;
    private javax.swing.JPanel tabInformacion;
    private javax.swing.JTabbedPane tabPestanas;
    private javax.swing.JTextField txtFieldApellidos;
    private javax.swing.JTextField txtFieldNombre;
    private javax.swing.JTextField txtFieldTfno;
    // End of variables declaration//GEN-END:variables
    
    String message;
    String messagewindow;
    
    public void generaQuoteEasterEgg(){
        Random n = new Random();
        int aleatorio = n.nextInt(5);
        switch(aleatorio){
            case 1:
                message = "Héroe, vuestra salud es baja. ¿Tenéis alguna poción o comida?";
                messagewindow = "Esto esta basado en Fable, un RPG del 2001";
                break;
            case 2:
                message = "Ve al gremio para más encargos";
                messagewindow = "Espero que alguien se ria viendo esto";
                break;
            case 3:
                message = "Intenta aumentar aún más tu multiplicador de combate";
                messagewindow = "ERROR, Es broma es broma";
                break;
            case 4:
                message = "Heroe, vuestra energía de voluntad es baja, andaos con ojo...";
                messagewindow = "Debería tomarme esto más enserio";
                break;
            default:
                message = "¿Persiguepollos perseguís pollos?";
                messagewindow = "Soy un EasterEgg";
        }
    }
    
}