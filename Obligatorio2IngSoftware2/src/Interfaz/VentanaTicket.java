/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import obligatorio2ingsoftware.Sistema;
import java.text.DateFormat;  
import java.text.SimpleDateFormat; 

/**
 *
 * @author tomasmartinez
 */
public class VentanaTicket extends javax.swing.JFrame {

    /**
     * Creates new form VentanaTicket
     */
    public VentanaTicket(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        this.setLocationRelativeTo(null);
        jLabelRetirarElDia.setVisible(false);
        
        lstArticulos.setListData(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getListaArticulos().toArray());
        jLabelCliente.setText(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getCliente().getNombre());
        jLabelLocal.setText(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getLocal().getDireccion());
        String total = modelo.precioTotal(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getListaArticulos());
        jLabelTotal.setText(total);
       
        
        if(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getEsPreventa()){
            jLabelRetirarElDia.setVisible(true);
            DateFormat formatoFecha = new SimpleDateFormat("dd-MMMM-yyyy");  
            String fecha = formatoFecha.format(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getFecha());  
            jLabelFecha.setText(fecha);
        }

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelLocal = new javax.swing.JLabel();
        jLabelRetirarElDia = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstArticulos = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 650));

        jLabel1.setText("Cliente:");

        jLabelCliente.setText("jLabel2");

        jLabel3.setText("Local:");

        jLabelLocal.setText("jLabel4");

        jLabelRetirarElDia.setText("Retirar el dia:");

        jLabelFecha.setText("jLabel6");

        lstArticulos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstArticulos);

        jLabel2.setText("Articulos:");

        jLabel4.setText("Total:");

        jLabelTotal.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTotal)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelRetirarElDia)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(jLabelLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jLabelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelCliente)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLocal)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabelRetirarElDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFecha)
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelRetirarElDia;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstArticulos;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
}
