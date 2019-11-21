
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import java.util.*;
import javax.swing.JOptionPane;
import obligatorio2ingsoftware.Sistema;
import obligatorio2ingsoftware.Articulo;
import obligatorio2ingsoftware.Venta;
import obligatorio2ingsoftware.Cliente;
import obligatorio2ingsoftware.Local;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author tomasmartinez
 */
public class VentanaCompra1 extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCompra
     */
    public VentanaCompra1(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        this.setLocationRelativeTo(null);
        lstLocales.setListData(modelo.getListaLocales().toArray());
        venta = new Venta();
        modelo.getListaVentas().add(venta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxCafe1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabelKombucha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPasas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelCafe = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelHongos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonComprar = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLocales = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rSDateChooser = new rojeru_san.componentes.RSDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnPasas = new javax.swing.JButton();
        btncafe = new javax.swing.JButton();
        btnHongos = new javax.swing.JButton();
        btnKombucha = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jComboBoxCafe1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(800, 560));

        jLabelKombucha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/kombucha-bio-voelkel-ecovidasolar.jpg"))); // NOI18N
        jLabelKombucha.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabelKombucha.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabelKombucha.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Pasas de Uva: 200$");

        jLabelPasas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPasas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PasasdeUvas.jpg"))); // NOI18N
        jLabelPasas.setText("IMAGEN PASAS DE UVA");
        jLabelPasas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabelPasas.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabelPasas.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabelPasas.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Café Parsero: 500$");

        jLabelCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cafeParcero.jpg"))); // NOI18N
        jLabelCafe.setText("IMAGEN CAFE PARSERO");
        jLabelCafe.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabelCafe.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabelCafe.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Kombucha: 400$");

        jLabelHongos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/hongos.jpg"))); // NOI18N
        jLabelHongos.setText("IMAGEN HONGOS");
        jLabelHongos.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabelHongos.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabelHongos.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Hongos Shiitake: 700$");

        jButtonComprar.setBackground(new java.awt.Color(51, 204, 0));
        jButtonComprar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonComprar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_forward_black_18dp.png"))); // NOI18N
        jButtonComprar.setText("Siguiente");
        jButtonComprar.setActionCommand("");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });

        txtCedula.setEditable(false);
        txtCedula.setText("12345678");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cedula de identidad:");

        lstLocales.setBackground(new java.awt.Color(204, 255, 204));
        lstLocales.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstLocales.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstLocales);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Seleccione un local para retirar");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Seleccione una fecha de retiro:");

        rSDateChooser.setColorBackground(new java.awt.Color(51, 204, 0));
        rSDateChooser.setColorButtonHover(new java.awt.Color(51, 204, 0));
        rSDateChooser.setColorForeground(new java.awt.Color(51, 204, 0));

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Selección de Productos");

        jButtonHome.setBackground(new java.awt.Color(51, 204, 0));
        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home (1).png"))); // NOI18N
        jButtonHome.setBorder(null);
        jButtonHome.setMaximumSize(new java.awt.Dimension(63, 63));
        jButtonHome.setMinimumSize(new java.awt.Dimension(63, 63));
        jButtonHome.setPreferredSize(new java.awt.Dimension(63, 63));
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

        jButtonAtras.setBackground(new java.awt.Color(51, 204, 0));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButtonAtras.setBorder(null);
        jButtonAtras.setMaximumSize(new java.awt.Dimension(63, 63));
        jButtonAtras.setMinimumSize(new java.awt.Dimension(63, 63));
        jButtonAtras.setPreferredSize(new java.awt.Dimension(63, 63));
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("sus productos:");

        btnPasas.setBackground(new java.awt.Color(51, 204, 0));
        btnPasas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPasas.setText("+");
        btnPasas.setBorder(null);
        btnPasas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasasActionPerformed(evt);
            }
        });

        btncafe.setBackground(new java.awt.Color(51, 204, 0));
        btncafe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncafe.setText("+");
        btncafe.setBorder(null);
        btncafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncafeActionPerformed(evt);
            }
        });

        btnHongos.setBackground(new java.awt.Color(51, 204, 0));
        btnHongos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHongos.setText("+");
        btnHongos.setBorder(null);
        btnHongos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHongosActionPerformed(evt);
            }
        });

        btnKombucha.setBackground(new java.awt.Color(51, 204, 0));
        btnKombucha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKombucha.setText("+");
        btnKombucha.setBorder(null);
        btnKombucha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKombuchaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Confirmación de Compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPasas, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabelCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rSDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelHongos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(btnPasas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHongos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(btnKombucha, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(82, 82, 82)
                                            .addComponent(btncafe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(76, 76, 76)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelKombucha, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6)))))))
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))
                .addGap(0, 85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabelPasas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPasas))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btncafe)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelKombucha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnKombucha))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelHongos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHongos)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5)
                        .addGap(8, 8, 8)
                        .addComponent(rSDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        // TODO add your handling code here:
        /*
        int cantidadPasas=Integer.parseInt(spinerPasas.getValue().toString());
        int cantidadCafe = Integer.parseInt(spinerCafe.getValue().toString());
        int cantidadHongos = Integer.parseInt(spinerHongos.getValue().toString());
        int cantidadKombucha =Integer.parseInt(spinerKombucha.getValue().toString());
        */
        
        venta = modelo.getListaVentas().get(modelo.getListaVentas().size()-1);
        
        String ci=txtCedula.getText();
            if(modelo.estaRegistrado(ci)){
                Local loc = (Local)lstLocales.getSelectedValue();
                if(loc != null){
                    Date fecha = rSDateChooser.getDatoFecha();
                    if(fecha!=null){
                        Date fechaHoy = new Date();
                        Calendar cal = Calendar.getInstance();
                        cal.setTime(fechaHoy);
                        int anoHoy = cal.get(Calendar.YEAR);
                        int mesHoy = cal.get(Calendar.MONTH);
                        int diaHoy = cal.get(Calendar.DAY_OF_MONTH);
                    
                        Date fechaSeleccionada = rSDateChooser.getDatoFecha();
                        Calendar cal2 = Calendar.getInstance();
                        cal2.setTime(fechaSeleccionada);
                        int anoS = cal2.get(Calendar.YEAR);
                        int mesS = cal2.get(Calendar.MONTH);
                        int diaS = cal2.get(Calendar.DAY_OF_MONTH);
                        int res= fechaHoy.compareTo(fechaSeleccionada);
                        
                        if(modelo.esHoy(fechaHoy, fechaSeleccionada)|| res==-1){
                            if(res==-1){
                                venta.setEsPreventa(true);
                            }
                            Cliente aux = new Cliente();
                            aux.setCedula(Integer.parseInt(ci));
                            int pos = modelo.getListaClientes().indexOf(aux);
                            venta.setCliente(modelo.getListaClientes().get(pos));                        
                            venta.setFecha(fecha);
                        
                            venta.setLocal(loc);
                            
                            /*
                            if(cantidadPasas>0){
                                Articulo artPasas = modelo.getListaArticulosOriginales().get(0);
                                artPasas.setCantidadVendidos(cantidadPasas);
                                venta.getListaArticulos().add(artPasas);
                            }
                            if(cantidadCafe>0){
                                Articulo artCafe = modelo.getListaArticulosOriginales().get(1);
                                artCafe.setCantidadVendidos(cantidadCafe);
                                venta.getListaArticulos().add(artCafe);
                            }
                            if(cantidadHongos>0){
                                Articulo artHongos = modelo.getListaArticulosOriginales().get(2);
                                artHongos.setCantidadVendidos(cantidadHongos);
                                venta.getListaArticulos().add(artHongos);
                            }
                            if(cantidadKombucha>0){
                                Articulo artKombucha = modelo.getListaArticulosOriginales().get(3);
                                artKombucha.setCantidadVendidos(cantidadKombucha);
                                venta.getListaArticulos().add(artKombucha);
                            }
                            */
                            
                            int huellaCarbono=venta.calculoHuella(venta.getListaArticulos());
                            venta.setHuellaCarbono(huellaCarbono);
                            if(!venta.getListaArticulos().isEmpty()){
                                VentanaConfirmacion vent = new VentanaConfirmacion(modelo);
                                this.setVisible(false);
                                vent.setVisible(true);
                                vent.setResizable(false);    
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "No hay articulos seleccionados", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Seleccione una fecha válida", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Seleccione una fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Seleccione un local", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Cliente No Registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
     
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
        VentanaCliente vent = new VentanaCliente(modelo);
        this.setVisible(false);
        vent.setVisible(true);
        vent.setResizable(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        // TODO add your handling code here:
         VentanaPrincipal vent = new VentanaPrincipal(modelo);
        this.setVisible(false);
        vent.setVisible(true);
        vent.setResizable(false);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void btnPasasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasasActionPerformed
        // TODO add your handling code here:
        VentanaDescripcionPasas vent = new VentanaDescripcionPasas(modelo);
        vent.setVisible(true);
        vent.setResizable(false);
    }//GEN-LAST:event_btnPasasActionPerformed

    private void btncafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncafeActionPerformed
        // TODO add your handling code here:
        VentanaDescripcionCafe vent = new VentanaDescripcionCafe(modelo);
        vent.setVisible(true);
        vent.setResizable(false);
    }//GEN-LAST:event_btncafeActionPerformed

    private void btnHongosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHongosActionPerformed
        // TODO add your handling code here:
        VentanaDescripcionHongo vent = new VentanaDescripcionHongo(modelo);
        vent.setVisible(true);
        vent.setResizable(false);
    }//GEN-LAST:event_btnHongosActionPerformed

    private void btnKombuchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKombuchaActionPerformed
        // TODO add your handling code here:
        VentanaDescripcionKombucha vent = new VentanaDescripcionKombucha(modelo);
        vent.setVisible(true);
        vent.setResizable(false);
    }//GEN-LAST:event_btnKombuchaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHongos;
    private javax.swing.JButton btnKombucha;
    private javax.swing.JButton btnPasas;
    private javax.swing.JButton btncafe;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JComboBox<String> jComboBoxCafe1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCafe;
    private javax.swing.JLabel jLabelHongos;
    private javax.swing.JLabel jLabelKombucha;
    private javax.swing.JLabel jLabelPasas;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstLocales;
    private rojeru_san.componentes.RSDateChooser rSDateChooser;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
    Venta venta;
}
