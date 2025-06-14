/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;
import paneles.*;
/**
 *
 * @author willruiz
 */
public class Camareros extends javax.swing.JPanel {

    /**
     * Creates new form Prueba
     */
    public Camareros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegistrarCamarero = new javax.swing.JButton();
        btnEliminarCamarero = new javax.swing.JButton();
        btnListarCamarero = new javax.swing.JButton();

        background.setBackground(new java.awt.Color(227, 232, 232));
        background.setPreferredSize(new java.awt.Dimension(750, 430));

        titulo.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        titulo.setText("CAMAREROS");

        btnRegistrarCamarero.setBackground(new java.awt.Color(0, 102, 153));
        btnRegistrarCamarero.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnRegistrarCamarero.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCamarero.setText("Registrar Camarero");
        btnRegistrarCamarero.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegistrarCamarero.setMaximumSize(new java.awt.Dimension(160, 20));
        btnRegistrarCamarero.setMinimumSize(new java.awt.Dimension(160, 20));
        btnRegistrarCamarero.setPreferredSize(new java.awt.Dimension(160, 20));
        btnRegistrarCamarero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCamareroActionPerformed(evt);
            }
        });

        btnEliminarCamarero.setBackground(new java.awt.Color(0, 102, 153));
        btnEliminarCamarero.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnEliminarCamarero.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCamarero.setText("Eliminar Camarero");
        btnEliminarCamarero.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminarCamarero.setMaximumSize(new java.awt.Dimension(160, 20));
        btnEliminarCamarero.setMinimumSize(new java.awt.Dimension(160, 20));
        btnEliminarCamarero.setPreferredSize(new java.awt.Dimension(160, 20));
        btnEliminarCamarero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCamareroActionPerformed(evt);
            }
        });

        btnListarCamarero.setBackground(new java.awt.Color(0, 102, 153));
        btnListarCamarero.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnListarCamarero.setForeground(new java.awt.Color(255, 255, 255));
        btnListarCamarero.setText("Listar Camareros");
        btnListarCamarero.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnListarCamarero.setMaximumSize(new java.awt.Dimension(160, 20));
        btnListarCamarero.setMinimumSize(new java.awt.Dimension(160, 20));
        btnListarCamarero.setPreferredSize(new java.awt.Dimension(160, 20));
        btnListarCamarero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCamareroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnListarCamarero, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarCamarero, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrarCamarero, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(titulo)))
                        .addGap(0, 269, Short.MAX_VALUE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnRegistrarCamarero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarCamarero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListarCamarero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarCamareroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCamareroActionPerformed
        registrarCamarero frameRegistro = new registrarCamarero();
        frameRegistro.setVisible(true);
    }//GEN-LAST:event_btnRegistrarCamareroActionPerformed

    private void btnEliminarCamareroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCamareroActionPerformed
        eliminarCamarero frameEliminar = new eliminarCamarero();
        frameEliminar.setVisible(true);
    }//GEN-LAST:event_btnEliminarCamareroActionPerformed

    private void btnListarCamareroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCamareroActionPerformed
        listarCamarero frameListar = new listarCamarero();
        frameListar.setVisible(true);
    }//GEN-LAST:event_btnListarCamareroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnEliminarCamarero;
    private javax.swing.JButton btnListarCamarero;
    private javax.swing.JButton btnRegistrarCamarero;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
