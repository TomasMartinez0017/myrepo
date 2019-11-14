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
        jButtonEditarArticulos = new javax.swing.JButton();
        jButtonEditarClientes = new javax.swing.JButton();
        jButtonEditarLocales = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 560));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 560));

        jButtonEditarArticulos.setText("Editar Articulos");
        jButtonEditarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarArticulosActionPerformed(evt);
            }
        });

        jButtonEditarClientes.setText("Editar Clientes");
        jButtonEditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarClientesActionPerformed(evt);
            }
        });

        jButtonEditarLocales.setText("Editar Locales");
        jButtonEditarLocales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarLocalesActionPerformed(evt);
            }
        });

        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione una opción");

        jButtonAtras.setText("Atras");
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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonEditarArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonEditarLocales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(jButtonEditarArticulos)
                .addGap(23, 23, 23)
                .addComponent(jButtonEditarClientes)
                .addGap(18, 18, 18)
                .addComponent(btnEstadisticas)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditarLocales)
                .addGap(116, 116, 116)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

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

    private void jButtonEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarClientesActionPerformed
        // TODO add your handling code here:
        VentanaEditarCliente vent=new VentanaEditarCliente(modelo);
        vent.setVisible(true);
        vent.setResizable(false);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonEditarClientesActionPerformed

    private void jButtonEditarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarArticulosActionPerformed
        // TODO add your handling code here:
        VentanaEditarArticulos vent=new VentanaEditarArticulos(modelo);
        vent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEditarArticulosActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        // TODO add your handling code here:
        VentanaEstadisticas vent=new VentanaEstadisticas(modelo);
        vent.setVisible(true);
        vent.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal vent = new VentanaPrincipal(modelo);
        this.setVisible(false);
        vent.setVisible(true);
        vent.setResizable(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonEditarLocalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarLocalesActionPerformed
        // TODO add your handling code here:
        VentanaEditarLocal vent = new VentanaEditarLocal(modelo);
        this.setVisible(false);
        vent.setVisible(true);
        vent.setResizable(false);
    }//GEN-LAST:event_jButtonEditarLocalesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonEditarArticulos;
    private javax.swing.JButton jButtonEditarClientes;
    private javax.swing.JButton jButtonEditarLocales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
}