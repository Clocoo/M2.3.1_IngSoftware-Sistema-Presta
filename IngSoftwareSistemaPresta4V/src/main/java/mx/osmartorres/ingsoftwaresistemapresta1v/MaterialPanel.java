
package mx.osmartorres.ingsoftwaresistemapresta1v;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import static mx.osmartorres.ingsoftwaresistemapresta1v.InterfazUsuario.content;

public class MaterialPanel extends javax.swing.JPanel {

    Prestamo pAux;
    JPanel panelAux;
    int idActual=0;
    
    public MaterialPanel(JPanel panelActual) {
        initComponents();
        panelAux = new JPanel();
        panelAux = panelActual;
    }
    
    // InicioPanel llamará a este método para agregar el material.
    public Prestamo getPrestamohecho(){
        return pAux;
    }
    
    // Método que sirve para indicar la ID actual del préstamo.
    public void cambiarIdActual(int idNueva){
        idActual = idNueva;
    }
    
    // Método que pasa pasa el préstamo actual a una variable auxiliar.
    public void setPrestamoActual(Prestamo pActual){
        pAux = pActual;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        contentMaterial = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        botonAgregarMaterial = new javax.swing.JButton();
        botonEnviarPrestamo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomMaterial = new javax.swing.JTextField();
        descMaterial = new javax.swing.JTextField();

        contentMaterial.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Material");

        botonAgregarMaterial.setText("Agregar Material");
        botonAgregarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarMaterialActionPerformed(evt);
            }
        });

        botonEnviarPrestamo.setText("Enviar Prétamo");
        botonEnviarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarPrestamoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre del Material:");

        jLabel2.setText("Descripción del Material:");

        javax.swing.GroupLayout contentMaterialLayout = new javax.swing.GroupLayout(contentMaterial);
        contentMaterial.setLayout(contentMaterialLayout);
        contentMaterialLayout.setHorizontalGroup(
            contentMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMaterialLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(contentMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contentMaterialLayout.createSequentialGroup()
                        .addComponent(botonAgregarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonEnviarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(contentMaterialLayout.createSequentialGroup()
                        .addGroup(contentMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(contentMaterialLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(contentMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(nomMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(descMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        contentMaterialLayout.setVerticalGroup(
            contentMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentMaterialLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(contentMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEnviarPrestamo)
                    .addComponent(botonAgregarMaterial))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contentMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarMaterialActionPerformed
        String nombreM = nomMaterial.getText();
        String descripcionM = descMaterial.getText();
        Material mAux = new Material(nombreM,descripcionM);
        pAux.agregarMaterial(mAux);
        System.out.println("Material agregado."+"\n");
        pAux.verMateriales();
        nomMaterial.setText("");
        descMaterial.setText("");
    }//GEN-LAST:event_botonAgregarMaterialActionPerformed

    private void botonEnviarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarPrestamoActionPerformed
        pAux.setIdPréstamo(idActual);
        panelAux.setSize(344,400);
        panelAux.setLocation(0,0);
        content.removeAll();
        content.add(panelAux,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonEnviarPrestamoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarMaterial;
    private javax.swing.JButton botonEnviarPrestamo;
    public static javax.swing.JPanel contentMaterial;
    private javax.swing.JTextField descMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nomMaterial;
    // End of variables declaration//GEN-END:variables
}
