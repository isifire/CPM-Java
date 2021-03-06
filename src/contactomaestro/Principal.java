package contactomaestro;

import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Isidro Benitez Zapico UO285039
 */

public class Principal extends javax.swing.JFrame {

    
    boolean bloqueo = false;
    Llamando ventanallamar;
    Iniciando carga = new Iniciando(this);
    VentanaDibujo dibujo = new VentanaDibujo(this);
    EditarContacto editar = new EditarContacto(this);
    BandejaSalida mensajesenviados = new BandejaSalida(this);
    NuevoMensaje sms = new NuevoMensaje(this);
    ImportaciónVentana importar = new ImportaciónVentana(this);

    public DefaultListModel listaContactosObjeto = new DefaultListModel();
    public DefaultListModel listaFavoritosObjeto = new DefaultListModel();
    public DefaultListModel listaContactosBloqueados = new DefaultListModel();
    public DefaultListModel listaSMS = new DefaultListModel();
    


    public Principal() {
        initComponents();
        listContactos.setModel(listaContactosObjeto);
        listBloqueado.setModel(listaContactosBloqueados);
        mensajesenviados.listSMS.setModel(listaSMS);
        listFavoritos.setModel(listaFavoritosObjeto);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoMolestarSonido = new javax.swing.ButtonGroup();
        btnGrupoMolestarPanel = new javax.swing.ButtonGroup();
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
        lblmail = new javax.swing.JLabel();
        txtFieldCorreo = new javax.swing.JTextField();
        btnAnadirContacto = new javax.swing.JButton();
        btnDibujar = new javax.swing.JButton();
        tabBandeja = new javax.swing.JPanel();
        rbMolestarPanel = new javax.swing.JRadioButton();
        rbSonidoPanel = new javax.swing.JRadioButton();
        btnBandejaEnviados = new javax.swing.JButton();
        panelListaNegra = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listBloqueado = new javax.swing.JList<>();
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
        lblEasterEgg = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuContactoMaestro = new javax.swing.JMenu();
        menuImportarContactos = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuAjustes = new javax.swing.JMenu();
        menuBandejaEntrada = new javax.swing.JMenu();
        rbNoMolestar = new javax.swing.JRadioButtonMenuItem();
        rbSonido = new javax.swing.JRadioButtonMenuItem();
        menuAyuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ContactoMaestro");
        setIconImages(null);

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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        lblCosas.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        lblCosas.setText("Lista de Contactos");

        javax.swing.GroupLayout panelContactosLayout = new javax.swing.GroupLayout(panelContactos);
        panelContactos.setLayout(panelContactosLayout);
        panelContactosLayout.setHorizontalGroup(
            panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(panelContactosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLlamar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBloquear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFav, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelContactosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCosas)
                .addGap(144, 144, 144))
        );
        panelContactosLayout.setVerticalGroup(
            panelContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContactosLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblCosas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tabPestanas.addTab("Contactos", panelContactos);

        btnFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contactomaestro/Contacto.png"))); // NOI18N
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

        lblApellidos.setText("*Apellidos:");

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

        lblmail.setText("*Correo electrónico:");

        btnAnadirContacto.setText("Añadir");
        btnAnadirContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirContactoActionPerformed(evt);
            }
        });

        btnDibujar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contactomaestro/pintar.png"))); // NOI18N
        btnDibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDibujarActionPerformed(evt);
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
                        .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                                .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                                        .addComponent(lblFijo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cBoxPrefijoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                                        .addComponent(lblTfno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cBoxPrefijoMovil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(32, 32, 32)))
                        .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblApellidos))
                                .addGap(18, 18, 18)
                                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(txtFieldNombre)))
                            .addComponent(txtFieldTfno)
                            .addComponent(txtFieldFijo, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                        .addComponent(lblmail)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldCorreo)))
                .addContainerGap())
            .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnAnadirContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        panelAñadirContactosLayout.setVerticalGroup(
            panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panelAñadirContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidos)
                            .addComponent(txtFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelAñadirContactosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAñadirContactosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
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
                    .addComponent(lblmail)
                    .addComponent(txtFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAnadirContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        cBoxPrefijoMovil.setSelectedItem(+34);
        cBoxPrefijoMovil.setSelectedItem(+34);

        tabPestanas.addTab("Añadir Contacto", panelAñadirContactos);

        btnGrupoMolestarPanel.add(rbMolestarPanel);
        rbMolestarPanel.setText("No molestar");
        rbMolestarPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMolestarPanelActionPerformed(evt);
            }
        });

        btnGrupoMolestarPanel.add(rbSonidoPanel);
        rbSonidoPanel.setText("Sonido Habilitado");
        rbSonidoPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSonidoPanelActionPerformed(evt);
            }
        });

        btnBandejaEnviados.setText("Bandeja de Enviados");
        btnBandejaEnviados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBandejaEnviadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabBandejaLayout = new javax.swing.GroupLayout(tabBandeja);
        tabBandeja.setLayout(tabBandejaLayout);
        tabBandejaLayout.setHorizontalGroup(
            tabBandejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBandejaLayout.createSequentialGroup()
                .addGroup(tabBandejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBandejaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(rbMolestarPanel)
                        .addGap(55, 55, 55)
                        .addComponent(rbSonidoPanel))
                    .addGroup(tabBandejaLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(btnBandejaEnviados)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        tabBandejaLayout.setVerticalGroup(
            tabBandejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBandejaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(tabBandejaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMolestarPanel)
                    .addComponent(rbSonidoPanel))
                .addGap(35, 35, 35)
                .addComponent(btnBandejaEnviados)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        rbMolestarPanel.setSelected(true);

        tabPestanas.addTab("Bandeja E/S y Ajustes", tabBandeja);

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

        lblEasterEgg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEasterEggMouseClicked(evt);
            }
        });

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contactomaestro/Logo.png"))); // NOI18N

        menuContactoMaestro.setText("ContactoMaestro");

        menuImportarContactos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuImportarContactos.setText("Importar contactos");
        menuImportarContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuImportarContactosActionPerformed(evt);
            }
        });
        menuContactoMaestro.add(menuImportarContactos);

        menuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItemExit.setText("Salir");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuContactoMaestro.add(menuItemExit);

        menuBar.add(menuContactoMaestro);

        menuAjustes.setText("Ajustes");

        menuBandejaEntrada.setText("Bandeja de entrada");

        btnGrupoMolestarSonido.add(rbNoMolestar);
        rbNoMolestar.setSelected(true);
        rbNoMolestar.setText("No molestar");
        rbNoMolestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoMolestarActionPerformed(evt);
            }
        });
        menuBandejaEntrada.add(rbNoMolestar);

        btnGrupoMolestarSonido.add(rbSonido);
        rbSonido.setText("Sonido habilitado");
        rbSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSonidoActionPerformed(evt);
            }
        });
        menuBandejaEntrada.add(rbSonido);

        menuAjustes.add(menuBandejaEntrada);

        menuBar.add(menuAjustes);

        menuAyuda.setText("Ayuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Actualizar versión");
        menuAyuda.add(jMenuItem1);

        menuBar.add(menuAyuda);

        setJMenuBar(menuBar);

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
            if (!txtFieldNombre.getText().isEmpty() && !txtFieldTfno.getText().isEmpty() && !txtFieldFijo.getText().isEmpty() && !txtFieldCorreo.getText().isEmpty() && !txtFieldApellidos.getText().isEmpty()) {

                String nombre, apellidos, prefijo1, tfno, prefijo2, fijo, mail;
                nombre = txtFieldNombre.getText();
                apellidos = txtFieldApellidos.getText();
                prefijo1 = cBoxPrefijoMovil.getSelectedItem().toString();
                prefijo2 = cBoxPrefijoFijo.getSelectedItem().toString();
                tfno = txtFieldTfno.getText();
                fijo = txtFieldFijo.getText();
                mail = txtFieldCorreo.getText();

                Contacto persona = new Contacto(nombre, apellidos, mail, prefijo1, tfno, prefijo2, fijo, "NO", "NO");
                listaContactosObjeto.addElement(persona);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Error, se requieren todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        int index = listContactos.getSelectedIndex();
        Contacto persona = (Contacto) listaContactosObjeto.getElementAt(index);
        if (persona.getBloqueado() == "SI") {
            JOptionPane.showMessageDialog(rootPane, "Error, tu contacto esta bloqueado, debes desbloquearlo para poder añadirle a favoritos", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (persona.getFavorito() == "NO") {
                persona.setFavorito("SI");
                listaFavoritosObjeto.addElement(persona);

            }

        }


    }//GEN-LAST:event_btnFavActionPerformed

    private void btnEliminarFavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFavActionPerformed
        javax.swing.DefaultListModel Model2 = (javax.swing.DefaultListModel) this.listFavoritos.getModel();
        Model2.removeElement(listFavoritos.getSelectedValue());
    }//GEN-LAST:event_btnEliminarFavActionPerformed

    private void btnBloquearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloquearActionPerformed
        if (!listContactos.isSelectionEmpty()) {
            int index = listContactos.getSelectedIndex();
            Contacto persona = (Contacto) listaContactosObjeto.getElementAt(index);
            Contacto personacopia = new Contacto(persona);
            if (persona.getBloqueado() == "SI") {
                personacopia.setBloqueado("NO");
                listaContactosObjeto.addElement(personacopia);
                listaContactosBloqueados.removeElement(persona);
                listaContactosObjeto.removeElement(persona);
            } else {
                personacopia.setBloqueado("SI");
                listaContactosObjeto.addElement(personacopia);
                listaContactosBloqueados.addElement(personacopia);
                listaContactosObjeto.removeElement(persona);
            }
        }
    }//GEN-LAST:event_btnBloquearActionPerformed

    private void btnLlamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlamarActionPerformed
        int index = listContactos.getSelectedIndex();
        Contacto persona = (Contacto) listaContactosObjeto.getElementAt(index);
        if (listContactos.isSelectionEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "No has seleccionado ningún contacto", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            if (persona.getBloqueado() == "SI") {
                JOptionPane.showMessageDialog(rootPane, "Error, tu contacto " + persona.nombre + " esta bloqueado, debes desbloquearlo para poder llamarle", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        if (!listContactos.isSelectionEmpty()) {
            sms.setVisible(true);
            int index = listContactos.getSelectedIndex();
            Contacto persona = (Contacto) listaContactosObjeto.getElementAt(index);
            sms.txtFieldDestinatario.setText(persona.getNombre());
            sms.txtFieldDestinatario.setEditable(false);
        }
    }//GEN-LAST:event_btnSmsActionPerformed

    private void rbMolestarPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMolestarPanelActionPerformed
        rbNoMolestar.setSelected(true);
        rbSonido.setSelected(false);
    }//GEN-LAST:event_rbMolestarPanelActionPerformed

    private void rbSonidoPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSonidoPanelActionPerformed
        rbNoMolestar.setSelected(false);
        rbSonido.setSelected(true);
    }//GEN-LAST:event_rbSonidoPanelActionPerformed

    private void rbNoMolestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoMolestarActionPerformed
        rbMolestarPanel.setSelected(true);
        rbSonidoPanel.setSelected(false);
    }//GEN-LAST:event_rbNoMolestarActionPerformed

    private void rbSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSonidoActionPerformed
        rbMolestarPanel.setSelected(false);
        rbSonidoPanel.setSelected(true);
    }//GEN-LAST:event_rbSonidoActionPerformed

    private void btnBandejaEnviadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBandejaEnviadosActionPerformed
        mensajesenviados.setVisible(true);
    }//GEN-LAST:event_btnBandejaEnviadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!listContactos.isSelectionEmpty()) {
            int index = listContactos.getSelectedIndex();
            Contacto persona = (Contacto) listaContactosObjeto.getElementAt(index);
            editar.txtFieldNombre.setText(persona.getNombre());
            editar.txtFieldApellidos.setText(persona.getApellidos());
            editar.txtFieldTfno.setText(persona.getMovil());
            editar.txtFieldFijo.setText(persona.getFijo());
            editar.txtFieldCorreo.setText(persona.getFijo());
            editar.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuImportarContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuImportarContactosActionPerformed
        importar.setVisible(true);
    }//GEN-LAST:event_menuImportarContactosActionPerformed

    private void btnDibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDibujarActionPerformed
        dibujo.setVisible(true);
    }//GEN-LAST:event_btnDibujarActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(false);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadirContacto;
    private javax.swing.JButton btnBandejaEnviados;
    private javax.swing.JButton btnBloquear;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDibujar;
    private javax.swing.JButton btnEliminarFav;
    private javax.swing.JButton btnFav;
    private javax.swing.JButton btnFoto;
    private javax.swing.ButtonGroup btnGrupoMolestarPanel;
    private javax.swing.ButtonGroup btnGrupoMolestarSonido;
    private javax.swing.JButton btnLlamar;
    private javax.swing.JButton btnSms;
    private javax.swing.JComboBox<String> cBoxPrefijoFijo;
    private javax.swing.JComboBox<String> cBoxPrefijoMovil;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel lblmail;
    private javax.swing.JList<String> listBloqueado;
    javax.swing.JList<String> listContactos;
    private javax.swing.JList<String> listFavoritos;
    private javax.swing.JMenu menuAjustes;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenu menuBandejaEntrada;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuContactoMaestro;
    private javax.swing.JMenuItem menuImportarContactos;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JPanel panelAñadirContactos;
    private javax.swing.JPanel panelContactos;
    private javax.swing.JPanel panelListaNegra;
    private javax.swing.JRadioButton rbMolestarPanel;
    private javax.swing.JRadioButtonMenuItem rbNoMolestar;
    private javax.swing.JRadioButtonMenuItem rbSonido;
    private javax.swing.JRadioButton rbSonidoPanel;
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
