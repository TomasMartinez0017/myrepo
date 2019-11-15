/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import javax.swing.JOptionPane;
import obligatorio2ingsoftware.Sistema;
import obligatorio2ingsoftware.Cliente;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
/**
 *
 * @author Usuario
 */
public class VentanaAgregarCliente extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAgregarCliente
     */
    public VentanaAgregarCliente(Sistema unSistema) {
        initComponents();
        modelo=unSistema;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonAtras = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 560));
        setMinimumSize(new java.awt.Dimension(800, 560));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(337, 177, 60, 17);

        txtNombre.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(txtNombre);
        txtNombre.setBounds(337, 197, 126, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cedula de identidad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(337, 235, 119, 17);

        txtCI.setBackground(new java.awt.Color(204, 255, 204));
        txtCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCIActionPerformed(evt);
            }
        });
        getContentPane().add(txtCI);
        txtCI.setBounds(337, 255, 126, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Direccion");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(337, 293, 56, 17);

        txtDireccion.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(txtDireccion);
        txtDireccion.setBounds(337, 313, 126, 20);

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 100));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Edición de Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 880, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1680, 80);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jButtonAtras.setBackground(new java.awt.Color(204, 204, 204));
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
        jPanel1.add(jButtonAtras);
        jButtonAtras.setBounds(30, 360, 63, 60);

        jButtonHome.setBackground(new java.awt.Color(204, 204, 204));
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
        jPanel1.add(jButtonHome);
        jButtonHome.setBounds(700, 370, 60, 50);

        btnAgregar.setBackground(new java.awt.Color(51, 204, 0));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(340, 290, 123, 39);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 800, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCIActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        Cliente cliente=new Cliente();
        String nombre=txtNombre.getText();
        String ci=txtCI.getText();
        String direccion=txtDireccion.getText();
        
        if(!nombre.isEmpty() && !ci.isEmpty() && !direccion.isEmpty()){
            if(modelo.esNumerico(ci) && modelo.esCedula(ci)){
                cliente.setCedula(Integer.parseInt(ci));
                if(!modelo.agregarCliente(cliente)){
                     JOptionPane.showMessageDialog(this, "Cliente ya registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    cliente.setDireccion(direccion);
                    cliente.setNombre(nombre);
                    JOptionPane.showMessageDialog(this, "Cliente registrado");
                    this.setVisible(false);
                    VentanaEditarCliente vent=new VentanaEditarCliente(modelo);
                    vent.setVisible(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Cedula invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Faltan campos por rellenar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
        VentanaEditarCliente vent = new VentanaEditarCliente(modelo);
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

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
}
