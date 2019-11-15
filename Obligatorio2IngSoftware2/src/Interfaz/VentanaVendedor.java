/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import obligatorio2ingsoftware.Sistema;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Usuario
 */
public class VentanaVendedor extends javax.swing.JFrame {

    /**
     * Creates new form VentanaVendedor
     */
    public VentanaVendedor(Sistema unSistema) {
        initComponents();
        modelo=unSistema;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonEditarArticulos = new javax.swing.JButton();
        jButtonEditarClientes = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 560));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 560));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 560));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido, seleccione una opción");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(330, 120, 380, 22);

        jButtonAtras.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home (1).png"))); // NOI18N
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
        jButtonAtras.setBounds(720, 490, 72, 60);

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1680, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1680, 80);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(null);

        jButtonEditarArticulos.setBackground(new java.awt.Color(51, 255, 51));
        jButtonEditarArticulos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditarArticulos.setText("Editar Articulos");
        jButtonEditarArticulos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButtonEditarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarArticulosActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEditarArticulos);
        jButtonEditarArticulos.setBounds(10, 110, 125, 30);

        jButtonEditarClientes.setBackground(new java.awt.Color(51, 255, 51));
        jButtonEditarClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditarClientes.setText("Editar Clientes");
        jButtonEditarClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButtonEditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarClientesActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonEditarClientes);
        jButtonEditarClientes.setBounds(10, 200, 125, 30);

        btnEstadisticas.setBackground(new java.awt.Color(51, 255, 51));
        btnEstadisticas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        jPanel3.add(btnEstadisticas);
        btnEstadisticas.setBounds(10, 290, 125, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Menu");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(40, 20, 110, 40);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 80, 210, 520);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/WhatsApp Image 2019-11-14 at 11.27.04 (1).jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 230, 500, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarArticulosActionPerformed
        // TODO add your handling code here:
        VentanaEditarArticulos vent=new VentanaEditarArticulos(modelo);
        vent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEditarArticulosActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal vent = new VentanaPrincipal(modelo);
        this.setVisible(false);
        vent.setVisible(true);
        vent.setResizable(false);
        
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        // TODO add your handling code here:
        VentanaEstadisticas vent=new VentanaEstadisticas(modelo);
        vent.setVisible(true);
        vent.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void jButtonEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarClientesActionPerformed
        // TODO add your handling code here:
        VentanaEditarCliente vent=new VentanaEditarCliente(modelo);
        vent.setVisible(true);
        vent.setResizable(false);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonEditarClientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonEditarArticulos;
    private javax.swing.JButton jButtonEditarClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
}
