
package interfaz_;
import dominio.Sistema;

public class VentanaPrincipal extends javax.swing.JFrame {


    public VentanaPrincipal(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonCliente = new javax.swing.JButton();
        jButtonVendedor = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 560));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 560));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione una Opción");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 240, 950, 70);

        jButtonCliente.setBackground(new java.awt.Color(153, 255, 51));
        jButtonCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/baseline_person_black_18dp.png"))); // NOI18N
        jButtonCliente.setText("Cliente");
        jButtonCliente.setActionCommand("");
        jButtonCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCliente);
        jButtonCliente.setBounds(240, 350, 100, 55);

        jButtonVendedor.setBackground(new java.awt.Color(153, 255, 51));
        jButtonVendedor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/baseline_business_center_black_18dp.png"))); // NOI18N
        jButtonVendedor.setText("Vendedor");
        jButtonVendedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendedorActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVendedor);
        jButtonVendedor.setBounds(560, 350, 110, 55);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/fondo2.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(952, 683));
        jLabel2.setMinimumSize(new java.awt.Dimension(952, 683));
        jLabel2.setPreferredSize(new java.awt.Dimension(952, 683));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 952, 683);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClienteActionPerformed
        
        VentanaCliente vent = new VentanaCliente(modelo);
        this.setVisible(false);
        vent.setVisible(true);
        vent.setResizable(false);
        
        
    }//GEN-LAST:event_jButtonClienteActionPerformed

    private void jButtonVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendedorActionPerformed
        
        VentanaVendedor vent= new VentanaVendedor(modelo);
        vent.setVisible(true);
        vent.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVendedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCliente;
    private javax.swing.JButton jButtonVendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;

}

