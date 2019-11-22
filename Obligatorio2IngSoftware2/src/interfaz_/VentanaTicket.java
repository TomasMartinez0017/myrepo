/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz_;
import dominio.Sistema;
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
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        modelo = unSistema;
        this.setLocationRelativeTo(null);
        jLabelRetirarElDia.setVisible(false);
        jLabelFecha.setVisible(false);
        jLabelPrecio_Final.setVisible(false);
        jLabelPrecioFinal.setVisible(false);
        
        lstArticulos.setListData(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getListaArticulos().toArray());
        lstCantidad.setListData(modelo.listaCantidadVendidos(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getListaArticulos()).toArray());
        jLabelCliente.setText(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getCliente().getNombre());
        jLabelLocal.setText(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getLocal().getDireccion());
        
        String total = modelo.precioTotal(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getListaArticulos());
        jLabelTotal.setText(total);
        jLabelHuella.setText(Integer.toString(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getHuellaCarbono()));
        
        if(modelo.aplicaDescuento(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getListaArticulos())){
            jLabelPrecio_Final.setVisible(true);
            jLabelPrecioFinal.setVisible(true);
            jLabelPrecioFinal.setText(Integer.toString(modelo.calculoDescuento(Integer.parseInt(total))));   
        }
        
        if(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getEsPreventa()){
            jLabelRetirarElDia.setVisible(true);
            jLabelFecha.setVisible(true);
            DateFormat formatoFecha = new SimpleDateFormat("dd-MMMM-yyyy");  
            String fecha = formatoFecha.format(modelo.getListaVentas().get(modelo.getListaVentas().size()-1).getFecha());  
            jLabelFecha.setText(fecha);
        }
        
        VentanaPrincipal vent = new VentanaPrincipal(modelo);
        vent.setVisible(true);
        vent.setResizable(false);
        
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
        jLabel5 = new javax.swing.JLabel();
        jLabelHuella = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelPrecio_Final = new javax.swing.JLabel();
        jLabelPrecioFinal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCantidad = new javax.swing.JList();

        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(400, 650));

        jLabel1.setText("Cliente:");

        jLabelCliente.setText("jLabel2");

        jLabel3.setText("Local:");

        jLabelLocal.setText("jLabel4");

        jLabelRetirarElDia.setText("Retirar el dia:");

        jLabelFecha.setText("jLabel6");

        lstArticulos.setBackground(new java.awt.Color(232, 232, 232));
        lstArticulos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstArticulos);

        jLabel2.setText("Articulos:");

        jLabel4.setText("Total: $");

        jLabelTotal.setText("jLabel6");

        jLabel5.setText("Cantidad de CO2 en g evitado:");

        jLabelHuella.setText("jLabel6");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/CODIGO.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("GRACIAS POR PREFERIRNOS");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("ECOSHOP");

        jLabelPrecio_Final.setText("Precio Final: $");

        jLabelPrecioFinal.setText("jLabel10");

        lstCantidad.setBackground(new java.awt.Color(232, 232, 232));
        lstCantidad.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstCantidad);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(jLabelTotal)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelHuella, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelPrecio_Final)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelPrecioFinal))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRetirarElDia)
                            .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(jLabel6))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(jLabelCliente)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(jLabelLocal)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabelTotal)
                    .addComponent(jLabel5)
                    .addComponent(jLabelHuella))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrecio_Final)
                            .addComponent(jLabelPrecioFinal))
                        .addGap(25, 25, 25)
                        .addComponent(jLabelRetirarElDia)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelFecha)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelHuella;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelPrecioFinal;
    private javax.swing.JLabel jLabelPrecio_Final;
    private javax.swing.JLabel jLabelRetirarElDia;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstArticulos;
    private javax.swing.JList lstCantidad;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
}
