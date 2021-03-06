
package interfaz_;
import javax.swing.JOptionPane;
import dominio.Sistema;
import dominio.Articulo;
import javax.swing.ListSelectionModel;

public class VentanaEditarArticulos extends javax.swing.JFrame {


    public VentanaEditarArticulos(Sistema unSistema) {
        initComponents();
        modelo=unSistema;
        this.setLocationRelativeTo(null);
        lstArticulos.setListData(modelo.getListaArticulos().toArray());
        lstArticulos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAgregarArticulo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstArticulos = new javax.swing.JList<>();
        jButtonBorarArticulo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAtras1 = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(952, 683));
        setSize(new java.awt.Dimension(952, 683));

        jButtonAgregarArticulo.setBackground(new java.awt.Color(51, 204, 0));
        jButtonAgregarArticulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAgregarArticulo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregarArticulo.setText("Agregar Articulo");
        jButtonAgregarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarArticuloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Lista Articulos");

        lstArticulos.setBackground(new java.awt.Color(204, 255, 204));
        lstArticulos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lstArticulos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "-Item 1", "-Item 2", "-Item 3", "-Item 4", "-Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstArticulos);

        jButtonBorarArticulo.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBorarArticulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/trash.png"))); // NOI18N
        jButtonBorarArticulo.setBorder(null);
        jButtonBorarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorarArticuloActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 100));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edición de Articulos");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 940, 80);

        jButtonAtras1.setBackground(new java.awt.Color(51, 204, 0));
        jButtonAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/home (1).png"))); // NOI18N
        jButtonAtras1.setBorder(null);
        jButtonAtras1.setMaximumSize(new java.awt.Dimension(63, 63));
        jButtonAtras1.setMinimumSize(new java.awt.Dimension(63, 63));
        jButtonAtras1.setPreferredSize(new java.awt.Dimension(63, 63));
        jButtonAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtras1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAtras1);
        jButtonAtras1.setBounds(870, 10, 60, 63);

        jButtonAtras.setBackground(new java.awt.Color(51, 204, 0));
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/back.png"))); // NOI18N
        jButtonAtras.setBorder(null);
        jButtonAtras.setMaximumSize(new java.awt.Dimension(63, 63));
        jButtonAtras.setMinimumSize(new java.awt.Dimension(63, 63));
        jButtonAtras.setPreferredSize(new java.awt.Dimension(63, 63));
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonAtras);
        jButtonAtras.setBounds(10, 10, 70, 63);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 941, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAgregarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBorarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(213, 213, 213))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAgregarArticulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBorarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBorarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorarArticuloActionPerformed
        
        Articulo art= (Articulo)lstArticulos.getSelectedValue();
        //Se verifica que se haya seleccionado un articulo
        if(art!=null){
            modelo.eliminarArticulo(art);
            lstArticulos.setListData(modelo.getListaArticulos().toArray());
        }
        else{
            JOptionPane.showMessageDialog(this,"Seleccione un articulo de la lista", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButtonBorarArticuloActionPerformed

    private void jButtonAgregarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarArticuloActionPerformed

        VentanaAgregarArticulo vent=new VentanaAgregarArticulo(modelo);
        vent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAgregarArticuloActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed

        VentanaVendedor vent = new VentanaVendedor(modelo);
        this.setVisible(false);
        vent.setVisible(true);
        vent.setResizable(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jButtonAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtras1ActionPerformed

        VentanaPrincipal vent = new VentanaPrincipal(modelo);
        this.setVisible(false);
        vent.setVisible(true);
        vent.setResizable(false);
    }//GEN-LAST:event_jButtonAtras1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarArticulo;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonAtras1;
    private javax.swing.JButton jButtonBorarArticulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstArticulos;
    // End of variables declaration//GEN-END:variables

    private Sistema modelo;
}
