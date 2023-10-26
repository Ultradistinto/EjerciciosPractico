package Ej4;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.Timer;

public class Ventana extends javax.swing.JFrame {
    private Timer miTimer;
    private int luz;
 
    public Ventana() {
        
        initComponents();
        luz = 0;
        miTimer = new Timer(2000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                luz++;
                if(luz == 4){
                    luz = 1;
                }
                switch(luz){
                    case 1:
                        BotonRojo.setBackground(Color.red);
                        BotonVerde.setBackground(Color.gray);
                        break;
                    case 2:
                        BotonRojo.setBackground(Color.gray);
                        BotonAmarillo.setBackground(Color.yellow);
                        break;
                    case 3:
                        BotonAmarillo.setBackground(Color.gray);
                        BotonVerde.setBackground(Color.green);
                        break;
                }
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonRojo = new javax.swing.JButton();
        BotonAmarillo = new javax.swing.JButton();
        BotonVerde = new javax.swing.JButton();
        BotonInicio = new javax.swing.JButton();
        BotonFin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonRojo.setBackground(new java.awt.Color(153, 153, 153));
        BotonRojo.setForeground(new java.awt.Color(80, 80, 80));

        BotonAmarillo.setBackground(new java.awt.Color(153, 153, 153));
        BotonAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAmarilloActionPerformed(evt);
            }
        });

        BotonVerde.setBackground(new java.awt.Color(153, 153, 153));

        BotonInicio.setText("Inicio");
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        BotonFin.setText("Fin");
        BotonFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonAmarillo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonVerde)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                                .addComponent(BotonFin))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonRojo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonInicio)))
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonInicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonFin, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        miTimer.start();
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void BotonFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFinActionPerformed
        miTimer.stop();
    }//GEN-LAST:event_BotonFinActionPerformed

    private void BotonAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAmarilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAmarilloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAmarillo;
    private javax.swing.JButton BotonFin;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonRojo;
    private javax.swing.JButton BotonVerde;
    // End of variables declaration//GEN-END:variables
}
