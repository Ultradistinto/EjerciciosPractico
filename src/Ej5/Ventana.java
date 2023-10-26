
package Ej5;
import java.util.*  ;

public class Ventana extends javax.swing.JFrame {
    
    ArrayList<String> lista;
    
    public Ventana() {
        initComponents();
        this.setSize(400, 350);
        lista = new ArrayList<>();
        ListaResultados.setListData(lista.toArray());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BotonCalculo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        LugarResultado = new javax.swing.JTextField();
        Radio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BotonPerimetro = new javax.swing.JRadioButton();
        BotonArea = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaResultados = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonCalculo.setText("Calcular");
        BotonCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalculoActionPerformed(evt);
            }
        });

        jLabel1.setText("Resultado: ");

        LugarResultado.setEditable(false);

        jLabel2.setText("Ingrese Radio:");

        buttonGroup1.add(BotonPerimetro);
        BotonPerimetro.setSelected(true);
        BotonPerimetro.setText("Perimetro");

        buttonGroup1.add(BotonArea);
        BotonArea.setText("Area");

        jScrollPane2.setViewportView(ListaResultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(BotonPerimetro, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonArea, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Radio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LugarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(BotonCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonPerimetro)
                    .addComponent(BotonArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LugarResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Radio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addComponent(BotonCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalculoActionPerformed
        double resultado;
        double radio = Integer.parseInt(Radio.getText());
        
        if(BotonPerimetro.isSelected()){
            resultado = 2*Math.PI*radio;
            lista.add("Radio: " + radio + " Perimetro" + String.format("%.2f", resultado));
        }
        else{
            resultado = Math.PI*radio*radio;
            lista.add("Radio: " + radio + " Area" + String.format("%.2f", resultado));
        }
        LugarResultado.setText(String.format("%.2f", resultado));
        ListaResultados.setListData(lista.toArray());
    }//GEN-LAST:event_BotonCalculoActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BotonArea;
    private javax.swing.JButton BotonCalculo;
    private javax.swing.JRadioButton BotonPerimetro;
    private javax.swing.JList ListaResultados;
    private javax.swing.JTextField LugarResultado;
    private javax.swing.JTextField Radio;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
