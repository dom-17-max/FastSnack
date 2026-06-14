/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Modelo.Pedido;
import javax.swing.JOptionPane;

public class Factura extends javax.swing.JFrame {



    private Pedido pedido;

    public Factura() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Factura(Pedido pedido) {
        this.pedido = pedido;
        initComponents();
        this.setLocationRelativeTo(null);
        cargarDatosFactura();
    }

private void cargarDatosFactura() {
    if (pedido == null || pedido.getItems().isEmpty()) {
        JOptionPane.showMessageDialog(this, "No hay productos en el pedido");
        return;
    }

    javax.swing.JTextField[] productos = {jTextProducto1, jTextProducto2, jTextProducto3, jTextProducto4, jTextProducto5};
    javax.swing.JTextField[] valorU = {jTextValorU1, jTextValorU2, jTextValorU3, jTextValorU4, jTextValorU5};
    javax.swing.JTextField[] cantidad = {jTextCantidad1, jTextCantidad2, jTextCantidad3, jTextCantidad4, jTextCantidad5};
    javax.swing.JTextField[] valorT = {jTextValorT1, jTextValorT2, jTextValorT3, jTextValorT4, jTextValorT5};

    double total = 0;
    int fila = 0;

    for (Modelo.ItemPedido item : pedido.getItems()) {
        if (fila >= 5) break;
        double subtotal = item.getPrecio() * item.getCantidad();
        total += subtotal;
        productos[fila].setText(item.getNombre());
        valorU[fila].setText(String.format("%.2f", item.getPrecio()));
        cantidad[fila].setText(String.valueOf(item.getCantidad()));
        valorT[fila].setText(String.format("%.2f", subtotal));
        productos[fila].setEditable(false);
        valorU[fila].setEditable(false);
        cantidad[fila].setEditable(false);
        valorT[fila].setEditable(false);
        fila++;
    }

    // Guardar subtotal para cálculos
    final double subtotalFinal = total;
    double iva = subtotalFinal * 0.15;

    // Campos no editables
    jTextTotalCompra.setText(String.format("%.2f", subtotalFinal));
    jTextTotalCompra.setEditable(false);
    jTextTotalCompra.setBackground(new java.awt.Color(230, 230, 230));

    jTextField1.setText(String.format("%.2f", iva)); // IVA
    jTextField1.setEditable(false);
    jTextField1.setBackground(new java.awt.Color(230, 230, 230));

    jTextField3.setText(String.format("%.2f", subtotalFinal + iva)); // Total
    jTextField3.setEditable(false);
    jTextField3.setBackground(new java.awt.Color(230, 230, 230));

    // jTextField2 = Descuento (editable) - se actualiza solo al escribir
    jTextField2.setEditable(true);
    jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
        @Override
        public void keyReleased(java.awt.event.KeyEvent evt) {
            try {
                double porcentaje = Double.parseDouble(jTextField2.getText());
                double descuento = subtotalFinal * (porcentaje / 100);
                double iva2 = subtotalFinal * 0.15;
                double totalFinal = subtotalFinal + iva2 - descuento;
                jTextField3.setText(String.format("%.2f", totalFinal));
            } catch (NumberFormatException e) {
                double iva2 = subtotalFinal * 0.15;
                jTextField3.setText(String.format("%.2f", subtotalFinal + iva2));
            }
        }
    });
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextCLIENTE = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextProducto1 = new javax.swing.JTextField();
        jTextValorU1 = new javax.swing.JTextField();
        jTextCantidad1 = new javax.swing.JTextField();
        jTextValorT1 = new javax.swing.JTextField();
        jTextProducto2 = new javax.swing.JTextField();
        jTextValorU2 = new javax.swing.JTextField();
        jTextCantidad2 = new javax.swing.JTextField();
        jTextValorT2 = new javax.swing.JTextField();
        jTextProducto3 = new javax.swing.JTextField();
        jTextValorU3 = new javax.swing.JTextField();
        jTextCantidad3 = new javax.swing.JTextField();
        jTextValorT3 = new javax.swing.JTextField();
        jTextProducto4 = new javax.swing.JTextField();
        jTextValorU4 = new javax.swing.JTextField();
        jTextCantidad4 = new javax.swing.JTextField();
        jTextValorT4 = new javax.swing.JTextField();
        jTextProducto5 = new javax.swing.JTextField();
        jTextValorU5 = new javax.swing.JTextField();
        jTextCantidad5 = new javax.swing.JTextField();
        jTextValorT5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextTotalCompra = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("FAST SNACK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 340, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("ORDEN DE COMPRA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 51, 0));
        jLabel3.setText("CLIENTE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 158, 65, -1));

        jTextCLIENTE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextCLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 158, 278, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 51, 0));
        jLabel8.setText("CEDULA/RUC");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 158, 101, -1));

        jTextField21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 213, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("PRODUCTO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 214, 91, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("VALOR UNITARIO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 214, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("CANTIDAD");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 214, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("VALOR TOTAL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 214, 107, -1));

        jTextProducto1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 252, 131, -1));

        jTextValorU1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextValorU1.addActionListener(this::jTextValorU1ActionPerformed);
        getContentPane().add(jTextValorU1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 252, 107, -1));

        jTextCantidad1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextCantidad1.addActionListener(this::jTextCantidad1ActionPerformed);
        getContentPane().add(jTextCantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 252, 71, -1));

        jTextValorT1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextValorT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 252, 88, -1));

        jTextProducto2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 302, 131, -1));

        jTextValorU2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextValorU2.addActionListener(this::jTextValorU2ActionPerformed);
        getContentPane().add(jTextValorU2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 302, 107, -1));

        jTextCantidad2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextCantidad2.addActionListener(this::jTextCantidad2ActionPerformed);
        getContentPane().add(jTextCantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 302, 71, -1));

        jTextValorT2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextValorT2.addActionListener(this::jTextValorT2ActionPerformed);
        getContentPane().add(jTextValorT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 302, 88, -1));

        jTextProducto3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextProducto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 350, 131, -1));

        jTextValorU3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextValorU3.addActionListener(this::jTextValorU3ActionPerformed);
        getContentPane().add(jTextValorU3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 350, 107, -1));

        jTextCantidad3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextCantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 350, 71, -1));

        jTextValorT3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextValorT3.addActionListener(this::jTextValorT3ActionPerformed);
        getContentPane().add(jTextValorT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 350, 88, -1));

        jTextProducto4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextProducto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 399, 131, -1));

        jTextValorU4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextValorU4.addActionListener(this::jTextValorU4ActionPerformed);
        getContentPane().add(jTextValorU4, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 399, 107, -1));

        jTextCantidad4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextCantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 399, 71, -1));

        jTextValorT4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextValorT4.addActionListener(this::jTextValorT4ActionPerformed);
        getContentPane().add(jTextValorT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 399, 88, -1));

        jTextProducto5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        getContentPane().add(jTextProducto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 447, 131, -1));

        jTextValorU5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextValorU5.addActionListener(this::jTextValorU5ActionPerformed);
        getContentPane().add(jTextValorU5, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 447, 107, -1));

        jTextCantidad5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextCantidad5.addActionListener(this::jTextCantidad5ActionPerformed);
        getContentPane().add(jTextCantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 447, 71, -1));

        jTextValorT5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextValorT5.addActionListener(this::jTextValorT5ActionPerformed);
        getContentPane().add(jTextValorT5, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 447, 88, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Total Sin IVA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 514, -1, -1));

        jTextTotalCompra.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextTotalCompra.addActionListener(this::jTextTotalCompraActionPerformed);
        getContentPane().add(jTextTotalCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 121, -1));

        jButtonCalcular.setText("Recibo ");
        jButtonCalcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCalcular.addActionListener(this::jButtonCalcularActionPerformed);
        getContentPane().add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 710, 110, 31));

        jButton2.setText("Cancelar pedido ");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 710, -1, 30));

        jButton1.setText("otro pedido ");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 255)));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, 120, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 120, -1));

        jTextField2.addActionListener(this::jTextField2ActionPerformed);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 590, 120, -1));

        jTextField3.addActionListener(this::jTextField3ActionPerformed);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 640, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("Total ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setText("IVA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("Descuento ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/morado1.jpg.jpeg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -50, 830, 850));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setText("TOTAL COMPRA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 514, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("Descuento ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextValorU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorU1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorU1ActionPerformed

    private void jTextCantidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidad1ActionPerformed

    private void jTextValorU2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorU2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorU2ActionPerformed

    private void jTextCantidad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidad2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidad2ActionPerformed

    private void jTextValorT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorT2ActionPerformed

    private void jTextValorU3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorU3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorU3ActionPerformed

    private void jTextValorT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorT3ActionPerformed

    private void jTextValorU4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorU4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorU4ActionPerformed

    private void jTextValorT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorT4ActionPerformed

    private void jTextValorU5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorU5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorU5ActionPerformed

    private void jTextValorT5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValorT5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValorT5ActionPerformed

    private void jTextCantidad5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantidad5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantidad5ActionPerformed

    private void jTextTotalCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTotalCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTotalCompraActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        // Pasar datos de factura al recibo
    String cliente = jTextCLIENTE.getText();
    String cedula = jTextField21.getText();
    String totalSinIva = jTextTotalCompra.getText();
    String iva = jTextField1.getText();
    String descuento = jTextField2.getText();
    String total = jTextField3.getText();

    FastSnackRecibo recibo = new FastSnackRecibo(pedido, cliente, cedula, totalSinIva, iva, descuento, total);
    recibo.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
   int confirm;
        confirm = JOptionPane.showConfirmDialog(this,
                "¿Deseas agregar más productos a esta misma factura?",
                "Otro pedido",
                JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.YES_OPTION) {
        // Pasar el pedido actual a Productos para seguir agregando
      ProductoConFactura ventanaProducto = new ProductoConFactura(pedido, this);
        ventanaProducto.setVisible(true);
        this.setVisible(false); // Factura se oculta, no se cierra
    } else {
        // Nueva factura limpia
        new Producto().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:   
        int confirm = JOptionPane.showConfirmDialog(this,
        "¿Seguro que deseas cancelar el pedido?",
        "Cancelar", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        new Login().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

     

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new Factura().setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextCLIENTE;
    private javax.swing.JTextField jTextCantidad1;
    private javax.swing.JTextField jTextCantidad2;
    private javax.swing.JTextField jTextCantidad3;
    private javax.swing.JTextField jTextCantidad4;
    private javax.swing.JTextField jTextCantidad5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextProducto1;
    private javax.swing.JTextField jTextProducto2;
    private javax.swing.JTextField jTextProducto3;
    private javax.swing.JTextField jTextProducto4;
    private javax.swing.JTextField jTextProducto5;
    private javax.swing.JTextField jTextTotalCompra;
    private javax.swing.JTextField jTextValorT1;
    private javax.swing.JTextField jTextValorT2;
    private javax.swing.JTextField jTextValorT3;
    private javax.swing.JTextField jTextValorT4;
    private javax.swing.JTextField jTextValorT5;
    private javax.swing.JTextField jTextValorU1;
    private javax.swing.JTextField jTextValorU2;
    private javax.swing.JTextField jTextValorU3;
    private javax.swing.JTextField jTextValorU4;
    private javax.swing.JTextField jTextValorU5;
    // End of variables declaration//GEN-END:variables

 void actualizarPedido(Pedido nuevoPedido) {
    this.pedido = nuevoPedido;
    cargarDatosFactura();
}
}
