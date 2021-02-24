/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactomaestro;

import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author isifi
 */
public class Principal extends javax.swing.JFrame {

    boolean bloqueo = false;
    Llamando ventanallamar;
    NuevoMensaje sms = new NuevoMensaje();
    DefaultListModel listaContactosObjeto = new DefaultListModel();

    public Principal() {
        initComponents();
        
        listContactos.setModel(listaContactosObjeto);
        //listFavoritos.setModel(new javax.swing.DefaultListModel());
        //listBloqueado.setModel(new javax.swing.DefaultListModel());
    }

    //javax.swing.JList<Object> listDatos = new javax.swing.JList<>();
    

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
        lblCosas = new javax.swing.JLabel();
        tabBandeja = new javax.swing.JPanel();
        rbEntrada = new javax.swing.JRadioButton();
        rbSalida = new javax.swing.JRadioButton();
        tabFavoritos = new javax.swing.JPanel();
        btnEliminarFav = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listFavoritos = new javax.swing.JList<>();
        tabInformacion = new javax.swing.JPanel();
        lblAutor = new javax.swing.JLabel();
        lblAutor2 = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        lblContacto = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        panelListaNegra = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listBloqueado = new javax.swing.JList<>();
        panelAñadirContactos = new javax.swing.JPanel();
        btnFoto = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtFieldNombre = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtFieldApellidos = new javax.swing.JTextField();
        lblTfno = new javax.swing.JLabel();
        txtFieldTfno = new javax.swing.JTextField();
        cBoxPrefijoMovil = new javax.swing.JComboBox<>();
        lblFijo = new javax.swing.JLabel();
        cBoxPrefijoFijo = new javax.swing.JComboBox<>();
        txtFieldFijo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFieldCorreo = new javax.swing.JTextField();
        btnAnadirContacto = new javax.swing.JButton();
        lblEasterEgg = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuContactoMaestro = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ContactoMaestro");

        btnLlamar.setText("Llamar");
        btnLlamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlamarActionPerformed(evt);
            }
        });

        btnSms.setText("SMS");
        btnSms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmsActionPerformed(evt);
            }
        });

        jButton1.setText("Editar");

        listContactos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listContactos);

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnFav.setText("Añadir a favoritos");
        btnFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavActionPerformed(evt);
            }
        });

        btnBloquear.setText("Bloquear");
        btnBloquear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloquearActionPerformed(evt);
            }
        });

        lblCosas.setText("Nombre:    Apellidos:      Tfno Movil:           Tfno Fijo:      Correo Electronico:   Bloqueado:");

        javax.swing.GroupLayout panelContactosLayout = new javax.swing.GroupLayout(panelContactos);
        panelContactos.setLayout(panelContactosLayout);
        panelContactosLayout.setHorizontalGroup(
            panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCosas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelContactosLayout.createSequentialGroup()
                        .addGroup(panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLlamar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSms, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFav, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addContainerGap())
            .addGroup(panelContactosLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelContactosLayout.setVerticalGroup(
            panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCosas)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(42, Short.MAX_VALUE))
        );

        tabPestanas.addTab("Contactos", panelContactos);

        rbEntrada.setText("Bandeja de entrada");

        rbSalida.setText("Bandeja de salida");

        javax.swing.GroupLayout tabBandejaLayout = new javax.swing.GroupLayout(tabBandeja);
        tabBandeja.setLayout(tabBandejaLayout);
        tabBandejaLayout.setHorizontalGroup(
            tabBandejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBandejaLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(rbEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(rbSalida)
                .addGap(79, 79, 79))
        );
        tabBandejaLayout.setVerticalGroup(
            tabBandejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBandejaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(tabBandejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEntrada)
                    .addComponent(rbSalida))
                .addContainerGap(286, Short.MAX_VALUE))
        );

        tabPestanas.addTab("Bandeja E/S", tabBandeja);

        btnEliminarFav.setText("Eliminar");
        btnEliminarFav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFavActionPerformed(evt);
            }
        });

        listFavoritos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(listFavoritos);

        javax.swing.GroupLayout tabFavoritosLayout = new javax.swing.GroupLayout(tabFavoritos);
        tabFavoritos.setLayout(tabFavoritosLayout);
        tabFavoritosLayout.setHorizontalGroup(
            tabFavoritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabFavoritosLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(btnEliminarFav)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tabFavoritosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabFavoritosLayout.setVerticalGroup(
            tabFavoritosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabFavoritosLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarFav)
                .addContainerGap())
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
                        .addGroup(tabInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVersion)))
                    .addGroup(tabInformacionLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(tabInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblContacto)
                            .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabInformacionLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblMail, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabInformacionLayout.setVerticalGroup(
            tabInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabInformacionLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMail)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        tabPestanas.addTab("Información", tabInformacion);

        listBloqueado.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(listBloqueado);

        javax.swing.GroupLayout panelListaNegraLayout = new javax.swing.GroupLayout(panelListaNegra);
        panelListaNegra.setLayout(panelListaNegraLayout);
        panelListaNegraLayout.setHorizontalGroup(
            panelListaNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        panelListaNegraLayout.setVerticalGroup(
            panelListaNegraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        tabPestanas.addTab("Lista Negra", panelListaNegra);

        btnFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contactomaestro/contact.png"))); // NOI18N
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });

        lblNombre.setText("*Nombre:");

        txtFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldNombreKeyTyped(evt);
            }
        });

        lblApellidos.setText("Apellidos:");

        txtFieldApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldApellidosKeyTyped(evt);
            }
        });

        lblTfno.setText("*Teléfono Móvil:");

        txtFieldTfno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldTfnoKeyTyped(evt);
            }
        });

        cBoxPrefijoMovil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+34", "+33", "+351", "+1" }));

        lblFijo.setText("*Teléfono Fijo:");

        cBoxPrefijoFijo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+34", "+33", "+351", "+1" }));

        txtFieldFijo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldFijoKeyTyped(evt);
            }
        });

        jLabel1.setText("Correo electrónico:");

        btnAnadirContacto.setText("Añadir");
        btnAnadirContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirContactoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAñadirContactosLayout = new javax.swing.GroupLayout(panelAñadirContactos);
        panelAñadirContactos.setLayout(panelAñadirContactosLayout);
        panelAñadirContactosLayout.setHorizontalGroup(
            panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                        .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                                .addComponent(btnFoto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirContactosLayout.createSequentialGroup()
                                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                                        .addComponent(lblFijo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cBoxPrefijoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                                        .addComponent(lblTfno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cBoxPrefijoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)))
                        .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblApellidos))
                                .addGap(18, 18, 18)
                                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(txtFieldNombre)))
                            .addComponent(txtFieldTfno)
                            .addComponent(txtFieldFijo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldCorreo)))
                .addContainerGap())
            .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnAnadirContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAñadirContactosLayout.setVerticalGroup(
            panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldTfno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cBoxPrefijoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTfno)))
                .addGap(41, 41, 41)
                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFijo)
                    .addComponent(cBoxPrefijoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAnadirContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        cBoxPrefijoMovil.setSelectedItem(+34);
        cBoxPrefijoMovil.setSelectedItem(+34);

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

        menuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemExit.setText("Salir");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuContactoMaestro.add(menuItemExit);

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
                .addContainerGap(70, Short.MAX_VALUE))
            .addComponent(tabPestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblEasterEgg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPestanas))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblEasterEggMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEasterEggMouseClicked
        generaQuoteEasterEgg();
        JOptionPane.showMessageDialog(rootPane, message, messagewindow, JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_lblEasterEggMouseClicked

    private void txtFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldNombreKeyTyped
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFieldNombreKeyTyped

    private void txtFieldApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldApellidosKeyTyped
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFieldApellidosKeyTyped

    private void txtFieldTfnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldTfnoKeyTyped
        if (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z' || evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFieldTfnoKeyTyped

    private void txtFieldFijoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldFijoKeyTyped
        if (evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z' || evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z') {
            evt.consume();
        }
    }//GEN-LAST:event_txtFieldFijoKeyTyped

    private void btnAnadirContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirContactoActionPerformed
        
        String texto = txtFieldNombre.getText() + " " + txtFieldApellidos.getText() + "  " + cBoxPrefijoMovil.getSelectedItem() + txtFieldTfno.getText() + "  " + cBoxPrefijoFijo.getSelectedItem() + txtFieldFijo.getText() + "  " + txtFieldCorreo.getText() + " ";
        if (!texto.contains("BLOQUEADO") && !texto.contains("bloqueado")) {
            if(!txtFieldNombre.getText().isEmpty() && !txtFieldTfno.getText().isEmpty() || !txtFieldFijo.getText().isEmpty()){
                
                String nombre,apellidos,prefijo1,tfno,prefijo2,fijo,mail;
                nombre = txtFieldNombre.getText();
                prefijo1 = cBoxPrefijoMovil.getSelectedItem().toString();
                tfno = txtFieldTfno.getText();
                Contacto persona = new Contacto(nombre,prefijo1,tfno,"NO");
                listaContactosObjeto.addElement(persona);
                
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Error, tu contacto no tiene nombre o nº de tfno movil, datos necesarios para crear un contacto", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error, tu contacto incluye palabras reservadas para el sistema, no ha sido posible añadirlo a tu lista de contactos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAnadirContactoActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        javax.swing.DefaultListModel Model = (javax.swing.DefaultListModel) this.listContactos.getModel();
        Model.removeElement(listContactos.getSelectedValue());
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavActionPerformed

        if (listContactos.getSelectedValue().contains("BLOQUEADO")) {
            JOptionPane.showMessageDialog(rootPane, "Error, tu contacto esta bloqueado, debes desbloquearlo para poder añadirle a favoritos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            javax.swing.DefaultListModel Model2 = (javax.swing.DefaultListModel) this.listFavoritos.getModel();
            Model2.addElement(listContactos.getSelectedValue());
        }


    }//GEN-LAST:event_btnFavActionPerformed

    private void btnEliminarFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFavActionPerformed
        javax.swing.DefaultListModel Model2 = (javax.swing.DefaultListModel) this.listFavoritos.getModel();
        Model2.removeElement(listFavoritos.getSelectedValue());
    }//GEN-LAST:event_btnEliminarFavActionPerformed

    private void btnBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloquearActionPerformed

        
               if(!listContactos.isSelectionEmpty()){
                    int index= listContactos.getSelectedIndex();
                    Contacto persona=(Contacto)listaContactosObjeto.getElementAt(index);
                    Contacto personacopia = new Contacto(persona);
                     personacopia.setBloqueado("SI");
                    listaContactosObjeto.addElement(personacopia);
                    listaContactosObjeto.removeElement(persona);
           // sms.txtFieldDestinatario.setText(persona.getNombre());
           // sms.txtFieldDestinatario.setEditable(false);
            
        }
        
        /*

        if (!listContactos.isSelectionEmpty()) {
                        int index= listContactos.getSelectedIndex();
            Contacto persona2=(Contacto)listaContactosObjeto.getElementAt(index);
            persona2.getNombre();
            if (!listContactos.getSelectedValue().contains("BLOQUEADO")) {
                
                

               /// Contacto personacopia = new Contacto(persona);
               // personacopia.setBloqueado("SI");
                //System.out.println(persona.toString());
               // System.out.println(personacopia.toString());
                //listaContactosObjeto.addElement(personacopia);
                // ModelB.addElement(listContactos.getSelectedValue());
               //listaContactosObjeto.removeElement(persona);
            } else {
                String modificado = listContactos.getSelectedValue().replace("BLOQUEADO", "");
                System.out.println(modificado);
                //Model.addElement(modificado);
               // Model.removeElement(listContactos.getSelectedValue());
                System.out.println(ModelB.size() - 1);
                for (int i = 0; i <= ModelB.size() - 1; i++) {

                    listBloqueado.setSelectedIndex(i);
                    System.out.println(listBloqueado.getSelectedValue());
                    //AQUI ESTA EL FALLO OJO
                    if (listBloqueado.getSelectedValue().equals(modificado)) {
                        ModelB.removeElement(listBloqueado.getSelectedValue());
                    }
                }

            }

        }*/


    }//GEN-LAST:event_btnBloquearActionPerformed

    private void btnLlamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlamarActionPerformed
        javax.swing.DefaultListModel Model = (javax.swing.DefaultListModel) this.listContactos.getModel();
        if (listContactos.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No has seleccionado ningún contacto", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (listContactos.getSelectedValue().contains("BLOQUEADO")) {
                JOptionPane.showMessageDialog(rootPane, "Error, tu contacto esta bloqueado, debes desbloquearlo para poder llamarle", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Deseas realizar la llamada?", "Llamar", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    System.out.println("SI");
                    new Llamando();

                }
            }

        }


    }//GEN-LAST:event_btnLlamarActionPerformed

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

    private void btnSmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmsActionPerformed

        if(!listContactos.isSelectionEmpty()){
            sms.setVisible(true);
            int index= listContactos.getSelectedIndex();
            Contacto persona=(Contacto)listaContactosObjeto.getElementAt(index);
            sms.txtFieldDestinatario.setText(persona.getNombre());
            sms.txtFieldDestinatario.setEditable(false);
            
        }
    }//GEN-LAST:event_btnSmsActionPerformed

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
    private javax.swing.JButton btnAnadirContacto;
    private javax.swing.JButton btnBloquear;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEliminarFav;
    private javax.swing.JButton btnFav;
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnLlamar;
    private javax.swing.JButton btnSms;
    private javax.swing.JComboBox<String> cBoxPrefijoFijo;
    private javax.swing.JComboBox<String> cBoxPrefijoMovil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAutor2;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblCosas;
    private javax.swing.JLabel lblEasterEgg;
    private javax.swing.JLabel lblFijo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTfno;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JList<String> listBloqueado;
    private javax.swing.JList<String> listContactos;
    private javax.swing.JList<String> listFavoritos;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuContactoMaestro;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JPanel panelAñadirContactos;
    private javax.swing.JPanel panelContactos;
    private javax.swing.JPanel panelListaNegra;
    private javax.swing.JRadioButton rbEntrada;
    private javax.swing.JRadioButton rbSalida;
    private javax.swing.JPanel tabBandeja;
    private javax.swing.JPanel tabFavoritos;
    private javax.swing.JPanel tabInformacion;
    private javax.swing.JTabbedPane tabPestanas;
    private javax.swing.JTextField txtFieldApellidos;
    private javax.swing.JTextField txtFieldCorreo;
    private javax.swing.JTextField txtFieldFijo;
    private javax.swing.JTextField txtFieldNombre;
    private javax.swing.JTextField txtFieldTfno;
    // End of variables declaration//GEN-END:variables

    String message;
    String messagewindow;

    String nombre;
    

    
    public void generaQuoteEasterEgg() {
        Random n = new Random();
        int aleatorio = n.nextInt(5);
        switch (aleatorio) {
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
