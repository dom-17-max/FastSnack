/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import Modelo.Pedido;

/**
 *
 * @author
 * noemi
 */
public class Producto extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Producto.class.getName());
    
    private final Pedido pedidoActual = new Pedido();
    
    /**
     * Creates
     * new
     * form
     * Producto
     */
    public Producto() {
        initComponents();
         this.setLocationRelativeTo(null); 

        spnHamburgesa.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spnPapasFritas.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spnNuggets.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spnHotDog.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        
    }

    
    

    /**
     * This
     * method
     * is
     * called
     * from
     * within
     * the
     * constructor
     * to
     * initialize
     * the
     * form.
     * WARNING:
     * Do
     * NOT
     * modify
     * this
     * code.
     * The
     * content
     * of
     * this
     * method
     * is
     * always
     * regenerated
     * by
     * the
     * Form
     * Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spnPapasFritas = new javax.swing.JSpinner();
        spnNuggets = new javax.swing.JSpinner();
        spnHotDog = new javax.swing.JSpinner();
        spnHamburgesa = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnPapasFritas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 19, 1));
        getContentPane().add(spnPapasFritas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 50, 30));

        spnNuggets.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spnNuggets, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 50, 30));

        spnHotDog.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spnHotDog, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 50, 30));

        spnHamburgesa.setModel(new javax.swing.SpinnerNumberModel(0, 0, 20, 1));
        getContentPane().add(spnHamburgesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 50, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/papitas fritas.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 90, 60));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Hot dogs");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, 20));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("$1.50");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, 30));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("$1.50");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, 30));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("$8.00");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hot-dog (3).jpg"))); // NOI18N
        jLabel14.setText("}");
        jLabel14.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel14ComponentHidden(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 100, 50));

        jButton2.setText("Comprar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(this::jButton2ActionPerformed);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        jButton3.setText("Comprar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(this::jButton3ActionPerformed);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jButton4.setText("Comprar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(this::jButton4ActionPerformed);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        jButton5.setText("Comprar");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(this::jButton5ActionPerformed);
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hamburgesa_1.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 100, 70));

        jButton1.setText("Pedido Terminado");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 120, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("$2.50");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuggets de pollo.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hamburgesas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nugetts");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Papitas Fritas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jButton6.setText("Cancelar");
        jButton6.addActionListener(this::jButton6ActionPerformed);
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Vivaldi", 2, 24)); // NOI18N
        jLabel3.setText("Bienvenidos a FastSnack");
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 310, 40));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Producto.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 740, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (pedidoActual.getItems().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Debes agregar al menos un producto al pedido", 
                "Carrito vacío", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        Factura factura = new Factura(pedidoActual);
        factura.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int cantidad = (Integer) spnHamburgesa.getValue();
        if (cantidad > 0) {
            pedidoActual.agregarProducto("Hamburguesa", 2.50, cantidad);
            JOptionPane.showMessageDialog(this, 
                "✅ " + cantidad + " Hamburguesa(s) agregada(s) al pedido.\nTotal acumulado: $" + pedidoActual.calcularTotal());
            spnHamburgesa.setValue(0);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una cantidad mayor a 0");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int cantidad = (Integer) spnPapasFritas.getValue();
        if (cantidad > 0) {
            pedidoActual.agregarProducto("Papas Fritas", 1.50, cantidad);
            JOptionPane.showMessageDialog(this, 
                "✅ " + cantidad + " Papas Fritas agregada(s) al pedido.\nTotal acumulado: $" + pedidoActual.calcularTotal());
            spnPapasFritas.setValue(0);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una cantidad mayor a 0");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int cantidad = (Integer) spnNuggets.getValue();
        if (cantidad > 0) {
            pedidoActual.agregarProducto("Nuggets", 8.00, cantidad);
            JOptionPane.showMessageDialog(this, 
                "✅ " + cantidad + " Nuggets agregado(s) al pedido.\nTotal acumulado: $" + pedidoActual.calcularTotal());
            spnNuggets.setValue(0);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una cantidad mayor a 0");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int cantidad = (Integer) spnHotDog.getValue();
        if (cantidad > 0) {
            pedidoActual.agregarProducto("Hot Dog", 1.50, cantidad);
            JOptionPane.showMessageDialog(this, 
                "✅ " + cantidad + " Hot Dog(s) agregado(s) al pedido.\nTotal acumulado: $" + pedidoActual.calcularTotal());
            spnHotDog.setValue(0);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una cantidad mayor a 0");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel14ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel14ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14ComponentHidden

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (!pedidoActual.getItems().isEmpty()) {
        int confirm = JOptionPane.showConfirmDialog(this,
            "¿Seguro que deseas cancelar? Se perderán los productos agregados.",
            "Cancelar pedido",
            JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            this.dispose();
        }
    } else {
        new Login().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param
     * args
     * the
     * command
     * line
     * arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Producto().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spnHamburgesa;
    private javax.swing.JSpinner spnHotDog;
    private javax.swing.JSpinner spnNuggets;
    private javax.swing.JSpinner spnPapasFritas;
    // End of variables declaration//GEN-END:variables
}
