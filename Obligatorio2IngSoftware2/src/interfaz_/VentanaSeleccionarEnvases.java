
package interfaz_;
import java.util.*;
import javax.swing.JOptionPane;
import dominio.Sistema;
import dominio.Articulo;
import dominio.Envase;
import dominio.Venta;


public class VentanaSeleccionarEnvases extends javax.swing.JFrame {


    public VentanaSeleccionarEnvases(Sistema unSistema) {
        initComponents();
        this.setLocationRelativeTo(null); 
        modelo = unSistema;
        listaArticulosAux = modelo.copiarLista(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getListaArticulos());
        lstArticulos.setListData(listaArticulosAux.toArray());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstArticulos = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEnvases = new javax.swing.JList();
        jButtonSeleccionar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonFinalizarCompra = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 560));

        lstArticulos.setBackground(new java.awt.Color(204, 255, 204));
        lstArticulos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstArticulos);

        lstEnvases.setBackground(new java.awt.Color(204, 255, 204));
        lstEnvases.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Seleccione un articulo" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstEnvases);

        jButtonSeleccionar.setBackground(new java.awt.Color(51, 204, 0));
        jButtonSeleccionar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSeleccionar.setText("Seleccionar Articulo");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });

        jButtonAgregar.setBackground(new java.awt.Color(51, 204, 0));
        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/baseline_add_shopping_cart_black_18dp.png"))); // NOI18N
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonFinalizarCompra.setBackground(new java.awt.Color(51, 204, 0));
        jButtonFinalizarCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonFinalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinalizarCompra.setText("Finalizar Compra");
        jButtonFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCompraActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Asiganción de Envases");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 952, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione los articulos, asignelé un envase y agreguelos a su compra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSeleccionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFinalizarCompra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(131, 131, 131)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonSeleccionar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonAgregar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonFinalizarCompra))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed
        
        articuloAux = (Articulo)lstArticulos.getSelectedValue();
        //Se verifica que se haya seleccionado un articulo
        if(articuloAux!=null){
            lstEnvases.setListData(articuloAux.getListaEnvases().toArray()); 
        }
        else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar un articulo de su lista", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
               
    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed

        Envase envase = (Envase)lstEnvases.getSelectedValue();
        //Se verifica que se haya seleccionado un envase
        if(envase!=null){
            modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getListaEnvasesUtilizados().add(envase);
            int pos = listaArticulosAux.indexOf(articuloAux);
            listaArticulosAux.remove(pos);
            lstArticulos.setListData(listaArticulosAux.toArray());
            ArrayList<String> vaciar = new ArrayList();
            lstEnvases.setListData(vaciar.toArray());
        }
        else{
            if(lstEnvases.getModel().getSize()==0){
                JOptionPane.showMessageDialog(this, "No quedan envases por agregar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar un envase", "ERROR", JOptionPane.ERROR_MESSAGE);
            }    
        }    
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCompraActionPerformed

        Venta venta = modelo.getListaVentas().get(modelo.getListaVentas().size()-1);
        //Se verifica que todos los articulos tengan envases
        if(modelo.validacionCompra(venta.getListaArticulos(), venta.getListaEnvasesUtilizados())){
            
            VentanaConfirmacion vent = new VentanaConfirmacion(modelo);
            this.setVisible(false);
            vent.setVisible(true);
            vent.setResizable(false);   
        }
        else{
            JOptionPane.showMessageDialog(this, "Quedan articulos sin envase", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonFinalizarCompraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonFinalizarCompra;
    private javax.swing.JButton jButtonSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstArticulos;
    private javax.swing.JList lstEnvases;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
    Articulo articuloAux;
    ArrayList<Articulo> listaArticulosAux = new ArrayList();
}
