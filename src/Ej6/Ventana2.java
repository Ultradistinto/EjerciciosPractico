package Ej6;

import Ej2.*;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Ventana2 extends javax.swing.JFrame {

    
    public Ventana2() {
        initComponents();
        this.setSize(400, 400);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BotonAutor = new javax.swing.JButton();
        BotonRojo = new javax.swing.JRadioButton();
        BotonAzul = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonAutor.setText("Autor");
        BotonAutor.setToolTipText("");
        BotonAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAutorActionPerformed(evt);
            }
        });

        buttonGroup1.add(BotonRojo);
        BotonRojo.setText("Rojo");
        BotonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRojoActionPerformed(evt);
            }
        });

        buttonGroup1.add(BotonAzul);
        BotonAzul.setText("Azul");
        BotonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAzulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonAzul)
                            .addComponent(BotonRojo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(BotonAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(BotonRojo)
                .addGap(42, 42, 42)
                .addComponent(BotonAzul)
                .addGap(64, 64, 64)
                .addComponent(BotonAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRojoActionPerformed
        BotonAutor.setForeground(Color.red);
    }//GEN-LAST:event_BotonRojoActionPerformed

    private void BotonAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAutorActionPerformed
        JOptionPane.showMessageDialog(this, "Joaquin Larronda", "Autor", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BotonAutorActionPerformed

    private void BotonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAzulActionPerformed
        BotonAutor.setForeground(Color.blue);
    }//GEN-LAST:event_BotonAzulActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAutor;
    private javax.swing.JRadioButton BotonAzul;
    private javax.swing.JRadioButton BotonRojo;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
