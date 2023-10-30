
package Ej8;


public class VentanaMenu extends javax.swing.JFrame {
    
    private Sistema modelo;
    
    public VentanaMenu(Sistema unSistema) {
        initComponents();
        this.modelo = unSistema;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuVentanaIngresos = new javax.swing.JMenuItem();
        MenuVentanaPelis = new javax.swing.JMenuItem();
        Irse = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Opciones");

        MenuVentanaIngresos.setText("Agregar Peli");
        MenuVentanaIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVentanaIngresosActionPerformed(evt);
            }
        });
        jMenu1.add(MenuVentanaIngresos);

        MenuVentanaPelis.setText("Ver Pelis");
        MenuVentanaPelis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVentanaPelisActionPerformed(evt);
            }
        });
        jMenu1.add(MenuVentanaPelis);

        Irse.setText("Salir");
        Irse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IrseActionPerformed(evt);
            }
        });
        jMenu1.add(Irse);

        jMenuBar1.add(jMenu1);

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

    private void MenuVentanaIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVentanaIngresosActionPerformed
        VentanaIngresos vent1 = new VentanaIngresos(modelo);
        vent1.setVisible(true);
    }//GEN-LAST:event_MenuVentanaIngresosActionPerformed

    private void MenuVentanaPelisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVentanaPelisActionPerformed
        VentanaPelis vent2 = new VentanaPelis(modelo);
        vent2.setVisible(true);
    }//GEN-LAST:event_MenuVentanaPelisActionPerformed

    private void IrseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IrseActionPerformed
        dispose();
    }//GEN-LAST:event_IrseActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Irse;
    private javax.swing.JMenuItem MenuVentanaIngresos;
    private javax.swing.JMenuItem MenuVentanaPelis;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
