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
import obligatorio2ingsoftware.Articulo;
import javax.swing.ListSelectionModel;
import obligatorio2ingsoftware.Envase;


/**
 *
 * @author Usuario
 */
public class VentanaAgregarArticulo extends javax.swing.JFrame {

    /** Creates new form VentanaAgregarArticulo */
    public VentanaAgregarArticulo(Sistema unSistema) {
        initComponents();
        modelo=unSistema;
        lstEnvases.setListData(modelo.getListaEnvases().toArray());
        lstEnvases.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMaterial = new javax.swing.JTextField();
        jLabelSeleccionEnvases = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEnvases = new javax.swing.JList<>();
        jButtonAgregarArticulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Codigo");

        jLabel3.setText("Precio");

        jLabel4.setText("Origen");

        jLabel5.setText("Material");

        jLabelSeleccionEnvases.setText("Seleccione Envases");

        lstEnvases.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstEnvases);

        jButtonAgregarArticulo.setText("Agregar Articulo");
        jButtonAgregarArticulo.setActionCommand("Agregar Articulo");
        jButtonAgregarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarArticuloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio)
                    .addComponent(jLabel4)
                    .addComponent(txtOrigen)
                    .addComponent(jLabel5)
                    .addComponent(txtMaterial))
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSeleccionEnvases))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAgregarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelSeleccionEnvases))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAgregarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButtonAgregarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarArticuloActionPerformed
        // TODO add your handling code here:
        Articulo articulo=new Articulo();
        String codigo=txtCodigo.getText();
        String precio=txtPrecio.getText();
        String material=txtMaterial.getText();
        String origen= txtOrigen.getText();
        String nombre=txtNombre.getText();
        List<Envase> listE= lstEnvases.getSelectedValuesList();
        if(!material.isEmpty() && !codigo.isEmpty() && !precio.isEmpty() && !origen.isEmpty() && !nombre.isEmpty() && !listE.isEmpty()){
            if(modelo.esNumerico(codigo) && modelo.esNumerico(precio)){
                for(int i=0;i<listE.size();i++){
                articulo.getListaEnvases().add(listE.get(i));
                }
                articulo.setCodigo(Integer.parseInt(codigo));
                if(!modelo.agregarArticulo(articulo)){
                    JOptionPane.showMessageDialog(this, "Articulo ya existente", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else{
                articulo.setPrecio(Integer.parseInt(precio));
                articulo.setMaterial(material);
                articulo.setOrigen(origen);
                articulo.setNombre(nombre);
                articulo.setCantidadVendidos(0);
   
               
                JOptionPane.showMessageDialog(this, "Articulo registrado");
                this.setVisible(false);
                VentanaEditarArticulos vent1=new VentanaEditarArticulos(modelo);
                vent1.setVisible(true);
                }
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Hay datos que no son numericos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Faltan campos por rellenar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
  
        
       
        
  
        

    }//GEN-LAST:event_jButtonAgregarArticuloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarArticulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelSeleccionEnvases;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstEnvases;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMaterial;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
