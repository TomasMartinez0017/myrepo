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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxCafe1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabelKombucha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPasas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelCafe = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelHongos = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxPasas = new javax.swing.JComboBox();
        jComboBoxCafe = new javax.swing.JComboBox<>();
        jComboBoxHongos = new javax.swing.JComboBox<>();
        jComboBoxKombucha = new javax.swing.JComboBox<>();
        jButtonComprar = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLocales = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        rSDateChooser = new rojeru_san.componentes.RSDateChooser();
        jLabel5 = new javax.swing.JLabel();

        jComboBoxCafe1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 560));

        jLabelKombucha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/kombucha-bio-voelkel-ecovidasolar.jpg"))); // NOI18N
        jLabelKombucha.setText("IMAGEN KOMBUCHA");
        jLabelKombucha.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabelKombucha.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabelKombucha.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel2.setText("Pasas de Uva: 200$");

        jLabelPasas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPasas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/PasasdeUvas.jpg"))); // NOI18N
        jLabelPasas.setText("IMAGEN PASAS DE UVA");
        jLabelPasas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabelPasas.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabelPasas.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabelPasas.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel4.setText("Café Parsero: 500$");

        jLabelCafe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/cafeParcero.jpg"))); // NOI18N
        jLabelCafe.setText("IMAGEN CAFE PARSERO");
        jLabelCafe.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabelCafe.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabelCafe.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel6.setText("Kombucha: 400$");

        jLabelHongos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/hongos.jpg"))); // NOI18N
        jLabelHongos.setText("IMAGEN HONGOS");
        jLabelHongos.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabelHongos.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabelHongos.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel8.setText("Hongos Shiitake: 700$");

        jComboBoxPasas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jComboBoxCafe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jComboBoxHongos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jComboBoxKombucha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jButtonComprar.setText("Comprar");
        jButtonComprar.setActionCommand("");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cedula de identidad:");

        lstLocales.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstLocales);

        jLabel3.setText("Local:");

        jLabel5.setText("Seleccione una fecha de retiro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabelPasas, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPasas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHongos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jComboBoxHongos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jComboBoxKombucha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabelKombucha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCafe, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rSDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPasas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxPasas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 29, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelHongos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelKombucha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBoxHongos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxKombucha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCafe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        // TODO add your handling code here:
        int cantidadPasas = jComboBoxPasas.getSelectedIndex();
        int cantidadCafe = jComboBoxCafe.getSelectedIndex();
        int cantidadHongos = jComboBoxHongos.getSelectedIndex();
        int cantidadKombucha = jComboBoxKombucha.getSelectedIndex();
        
        Venta venta = new Venta();
        
        
        String ci=txtCedula.getText();
        if(modelo.esNumerico(ci)){
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
                        if(anoHoy<=anoS && mesHoy<=mesS && diaHoy<=diaS){
                            venta.setEsPreventa(true);
                            Cliente aux = new Cliente();
                            aux.setCedula(Integer.parseInt(ci));
                            int pos = modelo.getListaClientes().indexOf(aux);
                            venta.setCliente(modelo.getListaClientes().get(pos));                        
                            venta.setFecha(fecha);
                        
                            venta.setLocal(loc);
        
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

                            modelo.getListaVentas().add(venta);
                            VentanaSeleccionarEnvases vent = new VentanaSeleccionarEnvases(modelo);
                            this.setVisible(false);
                            vent.setVisible(true);
                            vent.setResizable(false);
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
        }
        else{
            JOptionPane.showMessageDialog(this, "Cedula invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_jButtonComprarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JComboBox<String> jComboBoxCafe;
    private javax.swing.JComboBox<String> jComboBoxCafe1;
    private javax.swing.JComboBox<String> jComboBoxHongos;
    private javax.swing.JComboBox<String> jComboBoxKombucha;
    private javax.swing.JComboBox jComboBoxPasas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCafe;
    private javax.swing.JLabel jLabelHongos;
    private javax.swing.JLabel jLabelKombucha;
    private javax.swing.JLabel jLabelPasas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstLocales;
    private rojeru_san.componentes.RSDateChooser rSDateChooser;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
}
