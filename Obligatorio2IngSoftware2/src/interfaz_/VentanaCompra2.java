
package interfaz_;
import java.util.Date;
import dominio.Sistema;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import dominio.Cliente;
import dominio.Venta;
import dominio.Articulo;
import dominio.Local;

public class VentanaCompra2 extends javax.swing.JFrame {


    public VentanaCompra2(Sistema unSistema) {
        initComponents();
        modelo = unSistema;
        this.setLocationRelativeTo(null);
        lstArticulos.setListData(modelo.getListaArticulos().toArray());
        lstLocales.setListData(modelo.getListaLocales().toArray());
        lstArticulos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstLocales.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstArticulos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonComprar = new javax.swing.JButton();
        jLabelCI = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        jLabelCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCarrito = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstLocales = new javax.swing.JList();
        rSDateChooser1 = new rojeru_san.componentes.RSDateChooser();
        jLabelLocal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();
        jButtonAtras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 560));

        lstArticulos.setBackground(new java.awt.Color(204, 255, 204));
        lstArticulos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstArticulos.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstArticulos);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("Estamos actualizando nuestro catálogo de productos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("Seleccione de la lista los articulos que desee");

        jButtonComprar.setBackground(new java.awt.Color(51, 204, 0));
        jButtonComprar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonComprar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/baseline_forward_black_18dp.png"))); // NOI18N
        jButtonComprar.setText("Siguiente");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });

        jLabelCI.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCI.setText("Cedula de Identidad:");

        jLabelCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCantidad.setText("Cantidad:");

        jButtonAgregar.setBackground(new java.awt.Color(51, 204, 0));
        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        lstCarrito.setBackground(new java.awt.Color(204, 255, 204));
        jScrollPane2.setViewportView(lstCarrito);

        lstLocales.setBackground(new java.awt.Color(204, 255, 204));
        lstLocales.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstLocales.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstLocales);

        rSDateChooser1.setColorBackground(new java.awt.Color(51, 204, 0));
        rSDateChooser1.setColorButtonHover(new java.awt.Color(51, 204, 0));
        rSDateChooser1.setColorDiaActual(new java.awt.Color(204, 0, 0));
        rSDateChooser1.setColorForeground(new java.awt.Color(51, 204, 0));

        jLabelLocal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelLocal.setText("Seleccione un local:");

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Selección de Productos");

        jButtonHome.setBackground(new java.awt.Color(51, 204, 0));
        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_/home (1).png"))); // NOI18N
        jButtonHome.setBorder(null);
        jButtonHome.setMaximumSize(new java.awt.Dimension(63, 63));
        jButtonHome.setMinimumSize(new java.awt.Dimension(63, 63));
        jButtonHome.setPreferredSize(new java.awt.Dimension(63, 63));
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Selecione un producto y agreguelo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCI, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCI, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(77, 77, 77)
                        .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCI)
                                .addGap(10, 10, 10)
                                .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabelCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3)))
                .addGap(18, 18, 18)
                .addComponent(jButtonComprar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed

        System.out.println(modelo.getListaVentas().size());
        if(modelo.getListaVentas().isEmpty()){
            JOptionPane.showMessageDialog(this, "Agregue articulos a su compra", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{
            VentanaSeleccionarEnvases vent = new VentanaSeleccionarEnvases(modelo);
            this.setVisible(false);
            vent.setVisible(true);
            vent.setResizable(false);    
        }
    }//GEN-LAST:event_jButtonComprarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        
        String cantidad = txtCantidad.getText();
        //Si ventaAux es null quiere decir que es la primera vez que entra a la ventana
        if(ventaAux == null){
            String ci = txtCI.getText();
            //Se valida la cedula
            if(modelo.esCedula(ci)){
                //Se verifica que este registrado el cliente
                if(modelo.estaRegistrado(ci)){
                    Articulo art = (Articulo)lstArticulos.getSelectedValue();
                    //Se verifica que se haya seleccionado un articulo
                    if(art != null){
                        Local local = (Local)lstLocales.getSelectedValue();
                        //Se verifica que se haya seleccionado un local
                        if(local != null){
                            //Se verifica que la cantidad sea valida
                            if(modelo.esNumerico(cantidad) && Integer.parseInt(cantidad)>0){
                                Date fechaSeleccionada = rSDateChooser1.getDatoFecha();
                                //Se verifica que se haya seleccionado una fecha
                                if(fechaSeleccionada!=null){
                                    Date fechaHoy = new Date();
                                    int res =fechaHoy.compareTo(fechaSeleccionada);
                                    //Se verifica que sea una preventa o no
                                    if(modelo.esHoy(fechaHoy, fechaSeleccionada) || res== -1){ 
                                        ventaAux = new Venta();
                                        if(res==-1){
                                            ventaAux.setEsPreventa(true);
                                        }
                                        art.setCantidadVendidos(Integer.parseInt(cantidad));
                                        Cliente aux = new Cliente();
                                        aux.setCedula(Integer.parseInt(ci));
                                        int pos = modelo.getListaClientes().indexOf(aux);
                                        ventaAux.setCliente(modelo.getListaClientes().get(pos));
                                        ventaAux.getListaArticulos().add(art);
                                        ventaAux.setLocal(local);
                                        ventaAux.setFecha(fechaSeleccionada);
                                        modelo.getListaVentas().add(ventaAux);
                                        lstCarrito.setListData(ventaAux.getListaArticulos().toArray());
                                        jLabelCI.setVisible(false);
                                        txtCI.setVisible(false);
                                        jLabelLocal.setVisible(false);
                                        String lstLocalVacia = "Local ya ingresado";
                                        String vaciar[] = new String[1];
                                        vaciar[0] = lstLocalVacia;
                                        lstLocales.setListData(vaciar);  
                                        rSDateChooser1.setVisible(false);
                                        ventaAux.setHuellaCarbono(ventaAux.calculoHuella(ventaAux.getListaArticulos()));
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(this, "Ingrese una fecha válida", "ERROR", JOptionPane.ERROR_MESSAGE);   
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(this, "Ingrese una fecha", "ERROR", JOptionPane.ERROR_MESSAGE);
                                }    
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }    
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "Sleccione un local", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Seleccione un articulo", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }   
                }
                else{
                    JOptionPane.showMessageDialog(this, "El cliente debe estar registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Ingrese una cedula válida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            Articulo art = (Articulo)lstArticulos.getSelectedValue();
            art.setCantidadVendidos(Integer.parseInt(cantidad));
            //Si ya contiene el articulo simplemente aumento la cantidad de vendidos
            if(ventaAux.getListaArticulos().contains(art)){
                int pos = ventaAux.getListaArticulos().indexOf(art);
                int nuevaCantidad = ventaAux.getListaArticulos().get(pos).getCantidadVendidos() + art.getCantidadVendidos();
                ventaAux.getListaArticulos().get(pos).setCantidadVendidos(nuevaCantidad);
                ventaAux.setHuellaCarbono(ventaAux.calculoHuella(ventaAux.getListaArticulos()));
            }
            else{
                ventaAux.getListaArticulos().add(art);
                lstCarrito.setListData(ventaAux.getListaArticulos().toArray());
                ventaAux.setHuellaCarbono(ventaAux.calculoHuella(ventaAux.getListaArticulos()));
                  
            }
        }
       
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed

        VentanaPrincipal vent = new VentanaPrincipal(modelo);
        this.setVisible(false);
        vent.setVisible(true);
        vent.setResizable(false);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed

        VentanaVendedor vent = new VentanaVendedor(modelo);
        this.setVisible(false);
        vent.setVisible(true);
        vent.setResizable(false);
    }//GEN-LAST:event_jButtonAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCI;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList lstArticulos;
    private javax.swing.JList lstCarrito;
    private javax.swing.JList lstLocales;
    private rojeru_san.componentes.RSDateChooser rSDateChooser1;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
    Sistema modelo;
    Venta ventaAux;
}
