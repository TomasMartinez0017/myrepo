
package interfaz_;
import dominio.Sistema;

public class VentanaVendedor extends javax.swing.JFrame {


    public VentanaVendedor(Sistema unSistema) {
        initComponents();
        modelo=unSistema;
        this.setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jButtonAtras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButtonEditarClientes = new javax.swing.JButton();
        jButtonEditarArticulos = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(952, 683));
        setSize(new java.awt.Dimension(952, 683));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jButtonAtras.setBackground(new java.awt.Color(51, 204, 0));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/home (1).png"))); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(853, Short.MAX_VALUE)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 100);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Menu");

        jButtonEditarClientes.setBackground(new java.awt.Color(51, 255, 51));
        jButtonEditarClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/baseline_person_add_disabled_black_18dp.png"))); // NOI18N
        jButtonEditarClientes.setText("Editar Clientes");
        jButtonEditarClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButtonEditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarClientesActionPerformed(evt);
            }
        });

        jButtonEditarArticulos.setBackground(new java.awt.Color(51, 255, 51));
        jButtonEditarArticulos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEditarArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/baseline_edit_black_18dp.png"))); // NOI18N
        jButtonEditarArticulos.setText("Editar Articulos");
        jButtonEditarArticulos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButtonEditarArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarArticulosActionPerformed(evt);
            }
        });

        btnEstadisticas.setBackground(new java.awt.Color(51, 255, 51));
        btnEstadisticas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/baseline_bar_chart_black_18dp.png"))); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditarArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButtonEditarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jButtonEditarArticulos)
                .addGap(120, 120, 120)
                .addComponent(btnEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 190, 580);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido, seleccione una opción");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/WhatsApp Image 2019-11-14 at 11.27.04 (1).jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(190, 100, 780, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
 
        VentanaPrincipal vent = new VentanaPrincipal(modelo);
        this.setVisible(false);
        vent.setVisible(true);
        vent.setResizable(false);
        
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed

        VentanaEstadisticas vent=new VentanaEstadisticas(modelo);
        vent.setVisible(true);
        vent.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void jButtonEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarClientesActionPerformed

        VentanaEditarCliente vent=new VentanaEditarCliente(modelo);
        vent.setVisible(true);
        vent.setResizable(false);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEditarClientesActionPerformed

    private void jButtonEditarArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarArticulosActionPerformed

        VentanaEditarArticulos vent=new VentanaEditarArticulos(modelo);
        vent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonEditarArticulosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonEditarArticulos;
    private javax.swing.JButton jButtonEditarClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
}
