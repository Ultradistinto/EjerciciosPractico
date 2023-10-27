package Ej6;


public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        Ej1 = new javax.swing.JMenuItem();
        Ej2 = new javax.swing.JMenuItem();
        Ej3 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu3.setText("Ejercicios");

        Ej1.setText("Ejercicio 1");
        Ej1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ej1ActionPerformed(evt);
            }
        });
        jMenu3.add(Ej1);

        Ej2.setText("Ejercicio 2");
        Ej2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ej2ActionPerformed(evt);
            }
        });
        jMenu3.add(Ej2);

        Ej3.setText("Ejercicio 3");
        Ej3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ej3ActionPerformed(evt);
            }
        });
        jMenu3.add(Ej3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ej1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ej1ActionPerformed
        Ventana1 v1 = new Ventana1();
        v1.setVisible(true);
    }//GEN-LAST:event_Ej1ActionPerformed

    private void Ej2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ej2ActionPerformed
        Ventana2 v2 = new Ventana2();
        v2.setVisible(true);
    }//GEN-LAST:event_Ej2ActionPerformed

    private void Ej3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ej3ActionPerformed
        Ventana3 v3 = new Ventana3();
        v3.setVisible(true);
    }//GEN-LAST:event_Ej3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ej1;
    private javax.swing.JMenuItem Ej2;
    private javax.swing.JMenuItem Ej3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
