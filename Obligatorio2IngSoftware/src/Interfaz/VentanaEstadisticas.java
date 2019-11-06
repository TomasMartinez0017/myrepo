/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import javax.swing.JOptionPane;
import obligatorio2ingsoftware.Sistema;
import obligatorio2ingsoftware.Articulo;
import javax.swing.ListSelectionModel;
import javax.swing.JList;

/**
 *
 * @author Usuario
 */
public class VentanaEstadisticas extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEstadisticas
     */
    public VentanaEstadisticas(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        this.setLocationRelativeTo(null);
        lstEnvasesReutilizados.setListData(modelo.EnvasesReutilizados().toArray());
        lstProductosMasVendidos.setListData(modelo.productosMasVendidos(modelo.getListaArticulos()).toArray());
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
        lstProductosMasVendidos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEnvasesReutilizados = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jLabelVentasMes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlabelVendidos = new javax.swing.JLabel();
        btnVendidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setSize(new java.awt.Dimension(500, 500));

        lstProductosMasVendidos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstProductosMasVendidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstProductosMasVendidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstProductosMasVendidos);

        jLabel1.setText("Envases Reutilizados");

        jLabel2.setText("Productos más Vendidos");

        lstEnvasesReutilizados.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstEnvasesReutilizados);

        jLabel3.setText("Mas opciones:");

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jComboBoxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMesActionPerformed(evt);
            }
        });

        jLabelVentasMes.setText("Total de ventas en el mes");

        jLabel4.setText("Mes");

        jlabelVendidos.setText("-");

        btnVendidos.setText("Vendidos");
        btnVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelVentasMes))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVendidos)
                                    .addComponent(jlabelVendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVendidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlabelVendidos)))
                        .addGap(86, 86, 86)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVentasMes)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMesActionPerformed
        // TODO add your handling code here:
        int mes =jComboBoxMes.getSelectedIndex();
        jLabelVentasMes.setText(Integer.toString(modelo.VentasDadoUnMes(mes+1)));
    }//GEN-LAST:event_jComboBoxMesActionPerformed

    private void lstProductosMasVendidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstProductosMasVendidosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lstProductosMasVendidosMouseClicked

    private void btnVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendidosActionPerformed
        // TODO add your handling code here:
        Articulo art = (Articulo) lstProductosMasVendidos.getSelectedValue();
        if(art != null){
            jlabelVendidos.setText(Integer.toString(art.getCantidadVendidos()));
        }
        else{
            jlabelVendidos.setText("-");
        }
       
    }//GEN-LAST:event_btnVendidosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVendidos;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelVentasMes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlabelVendidos;
    private javax.swing.JList lstEnvasesReutilizados;
    private javax.swing.JList lstProductosMasVendidos;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
