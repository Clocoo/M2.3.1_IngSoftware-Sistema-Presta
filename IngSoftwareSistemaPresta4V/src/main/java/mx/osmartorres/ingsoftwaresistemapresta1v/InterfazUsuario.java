
package mx.osmartorres.ingsoftwaresistemapresta1v;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author osmar
 */
public class InterfazUsuario extends javax.swing.JFrame {

    public String correo;
    public static Alumno [] alumnos = new Alumno[2];
    InterfazAdmin adminGUI = new InterfazAdmin();
    MaterialPanel panelMaterial;
    PrestamosPanel panelPrestamos;
    int idActualPrestamo = 0;
    
    public InterfazUsuario() {
        initComponents();
        alumnos[0] = new Alumno("Osmar","Torres","osmar.torres@uabc.edu.mx","abc123",1171047);
        JPanel panelActual = panelInicio;
        panelMaterial = new MaterialPanel(panelActual);
        panelPrestamos = new PrestamosPanel(panelActual);
        botonConfirmar.setVisible(false);
    }

    // Método para establecer el correo que dió el usuario a la pantalla principal.
        public void setCorreo(String correoRecibido){
        correo = correoRecibido;
        correoBienvenida.setText(correo);
    }
        // Método para mostrar la pantalla del Administrador.
        public void hacerVisibleVistaAdmin(){
                   adminGUI.setVisible(true);
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        panelInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonCrearPrestamo = new javax.swing.JButton();
        botonVerPrestamos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        correoBienvenida = new javax.swing.JLabel();
        botonConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla de Usuario");

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));
        jPanel1.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setPreferredSize(new java.awt.Dimension(244, 358));

        panelInicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Inicio");

        botonCrearPrestamo.setText("Crear Préstamo");
        botonCrearPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearPrestamoActionPerformed(evt);
            }
        });

        botonVerPrestamos.setText("Ver Préstamos");
        botonVerPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerPrestamosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Bienvenido");

        correoBienvenida.setText("usuario@uabc.edu.mx");

        botonConfirmar.setText("Confirmar Solicitud");
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(botonCrearPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonVerPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2))
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(correoBienvenida))
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(91, 91, 91)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(correoBienvenida)
                .addGap(134, 134, 134)
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVerPrestamos)
                    .addComponent(botonCrearPrestamo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonConfirmar)
                .addContainerGap())
        );

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearPrestamoActionPerformed
        panelMaterial.setSize(344,400);
        panelMaterial.setLocation(0,0);
        content.removeAll();
        content.add(panelMaterial,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        idActualPrestamo++;
        Prestamo prestamoActual = new Prestamo(0,"Activo");
        panelMaterial.setPrestamoActual(prestamoActual);
        panelMaterial.cambiarIdActual(idActualPrestamo);
        botonConfirmar.setVisible(true);
    }//GEN-LAST:event_botonCrearPrestamoActionPerformed

    private void botonVerPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerPrestamosActionPerformed
        panelPrestamos.setPonerEnLista(alumnos[0].retornarPréstamos());
        // Se cambia el panel de nuestro jFrame al de Préstamos.
        panelPrestamos.setSize(344,400);
        panelPrestamos.setLocation(0,0);
        content.removeAll();
        content.add(panelPrestamos,BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_botonVerPrestamosActionPerformed

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        alumnos[0].agregarPréstamo(panelMaterial.getPrestamohecho());
        botonConfirmar.setVisible(false);
        // Se manda el Préstamo como petición a lo Administradores.
        adminGUI.peticionPrestamo(String.valueOf(alumnos[0].getMatricula()),alumnos[0].getIdPrestamoActual());
    }//GEN-LAST:event_botonConfirmarActionPerformed

    /**
     * @param args the command line arguments
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JButton botonCrearPrestamo;
    private javax.swing.JButton botonVerPrestamos;
    public static javax.swing.JPanel content;
    public static javax.swing.JLabel correoBienvenida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel panelInicio;
    // End of variables declaration//GEN-END:variables
}
