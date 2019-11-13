/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import java.util.*;
import java.util.Date;
import java.util.List;
import obligatorio2ingsoftware.Sistema;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import obligatorio2ingsoftware.Cliente;
import obligatorio2ingsoftware.Venta;
import obligatorio2ingsoftware.Articulo;
import obligatorio2ingsoftware.Local;

/**
 *
 * @author tomasmartinez
 */
public class VentanaCompra2 extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCompra2
     */
    public VentanaCompra2(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        this.setLocationRelativeTo(null);
        lstArticulos.setListData(modelo.getListaArticulos().toArray());
        lstLocales.setListData(modelo.getListaLocales().toArray());
        lstArticulos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstLocales.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstArticulos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonComprar = new javax.swing.JButton();
        jLabelCI = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        jLabelCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCarrito = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstLocales = new javax.swing.JList();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jLabelLocal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));

        lstArticulos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstArticulos);

        jLabel1.setText("Estamos actualizando nuestro catálogo de productos");

        jLabel2.setText("Seleccione de la lista los articulos que desee");

        jButtonComprar.setText("Comprar");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });

        jLabelCI.setText("Cedula de Identidad:");

        jLabelCantidad.setText("Cantidad:");

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstCarrito);

        lstLocales.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstLocales);

        jLabelLocal.setText("Seleccione un local:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCI, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(77, 77, 77)
                        .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabelCantidad)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonAgregar))
                            .addGap(79, 79, 79)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(jLabelLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonComprar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCI)
                                .addGap(10, 10, 10)
                                .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCantidad)
                                .addGap(8, 8, 8)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jButtonAgregar)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelLocal)
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2))))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        // TODO add your handling code here:
        System.out.println(modelo.getListaVentas().size());
        if(modelo.getListaVentas().isEmpty()){
            JOptionPane.showMessageDialog(this, "Agregue articulos a su compra", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            VentanaSeleccionarEnvases vent = new VentanaSeleccionarEnvases(modelo);
            this.setVisible(false);
            vent.setVisible(true);
            vent.setResizable(false);    
        }
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        // TODO add your handling code here:
        String cantidad = txtCantidad.getText();
        if(ventaAux == null){
            String ci = txtCI.getText();
            if(modelo.esCedula(ci)){
                if(modelo.estaRegistrado(ci)){
                    Articulo art = (Articulo)lstArticulos.getSelectedValue();
                    if(art != null){
                        Local local = (Local)lstLocales.getSelectedValue();
                        if(local != null){
                            if(modelo.esNumerico(cantidad)){
                                Date fecha = rSDateChooser1.getDatoFecha();
                                if(fecha!=null){
                                    Date fechaHoy = new Date();
                                    Calendar cal = Calendar.getInstance();
                                    cal.setTime(fechaHoy);
                                    int anoHoy = cal.get(Calendar.YEAR);
                                    int mesHoy = cal.get(Calendar.MONTH);
                                    int diaHoy = cal.get(Calendar.DAY_OF_MONTH);
                    
                                    Date fechaSeleccionada = rSDateChooser1.getDatoFecha();
                                    Calendar cal2 = Calendar.getInstance();
                                    cal2.setTime(fechaSeleccionada);
                                    int anoS = cal2.get(Calendar.YEAR);
                                    int mesS = cal2.get(Calendar.MONTH);
                                    int diaS = cal2.get(Calendar.DAY_OF_MONTH);
                                
                                    if(anoHoy<anoS || mesHoy<mesS || diaHoy<diaS){
                                        ventaAux = new Venta();
                                        art.setCantidadVendidos(Integer.parseInt(cantidad));
                                        Cliente aux = new Cliente();
                                        aux.setCedula(Integer.parseInt(ci));
                                        int pos = modelo.getListaClientes().indexOf(aux);
                                        ventaAux.setCliente(modelo.getListaClientes().get(pos));
                                        ventaAux.getListaArticulos().add(art);
                                        ventaAux.setLocal(local);
                                        ventaAux.setFecha(fecha);
                                        modelo.getListaVentas().add(ventaAux);
                                        lstCarrito.setListData(ventaAux.getListaArticulos().toArray());
                                        jLabelCI.setVisible(false);
                                        txtCI.setVisible(false);
                                        jLabelLocal.setVisible(false);
                                        String lstLocalVacia = "Local ya ingresado";
                                        String vaciar[] = new String[1];
                                        vaciar[0] = lstLocalVacia;
                                        lstLocales.setListData(vaciar);  
                                        rSDateChooser1.setVisible(false);
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(this, "Ingrese una fecha válida", "ERROR", JOptionPane.ERROR_MESSAGE);   
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(this, "Ingrese una fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }    
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }    
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Sleccione un local", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Seleccione un articulo", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }   
                }
                else{
                    JOptionPane.showMessageDialog(this, "El cliente debe estar registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Ingrese una cedula válida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            Articulo art = (Articulo)lstArticulos.getSelectedValue();
            art.setCantidadVendidos(Integer.parseInt(cantidad));
            if(ventaAux.getListaArticulos().contains(art)){
                int pos = ventaAux.getListaArticulos().indexOf(art);
                int nuevaCantidad = ventaAux.getListaArticulos().get(pos).getCantidadVendidos() + art.getCantidadVendidos();
                ventaAux.getListaArticulos().get(pos).setCantidadVendidos(nuevaCantidad); 
            }
            else{
                ventaAux.getListaArticulos().add(art);
                lstCarrito.setListData(ventaAux.getListaArticulos().toArray());
                  
            }
            modelo.getListaVentas().add(ventaAux);
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCI;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList lstArticulos;
    private javax.swing.JList lstCarrito;
    private javax.swing.JList lstLocales;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
    Venta ventaAux;
}
