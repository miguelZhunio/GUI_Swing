/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_swing.componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author IV
 */
public class Ventana2 extends javax.swing.JFrame{
    public Ventana2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jlIngreseNombre = new javax.swing.JLabel();
        jtfIngresoNombre = new javax.swing.JTextField();
        jlIngreseContraseña = new javax.swing.JLabel();
        jlMostrarNombre = new javax.swing.JLabel();
        jlMostrarContraseña = new javax.swing.JLabel();
        jbBotonMostrarNombre = new javax.swing.JButton();
        jbBotonMostrarContraseña = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        jpfingresoContraseña = new javax.swing.JPasswordField();

        jTextField1.setText("jTextField1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlIngreseNombre.setText("Ingrese su nombre:");

        jtfIngresoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIngresoNombreActionPerformed(evt);
            }
        });

        jlIngreseContraseña.setText("Ingrese su contraseña:");

        jlMostrarNombre.setBorder(new javax.swing.border.MatteBorder(null));

        jlMostrarContraseña.setBorder(new javax.swing.border.MatteBorder(null));

        jbBotonMostrarNombre.setText("Mostrar Nombre");
        jbBotonMostrarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonMostrarNombreActionPerformed(evt);
            }
        });

        jbBotonMostrarContraseña.setText("MostrarContraseña");
        jbBotonMostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotonMostrarContraseñaActionPerformed(evt);
            }
        });

        jlTitulo.setText("JTextField y JPasswordField");

        jpfingresoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfingresoContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlIngreseContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlIngreseNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfIngresoNombre)
                                    .addComponent(jpfingresoContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlMostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jbBotonMostrarNombre)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jlMostrarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jbBotonMostrarContraseña))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlIngreseNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfIngresoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIngreseContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpfingresoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbBotonMostrarNombre)
                            .addComponent(jbBotonMostrarContraseña)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMostrarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jtfIngresoNombreActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void jpfingresoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void jbBotonMostrarNombreActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
        ActionListener oyenteDeAccion = (ActionEvent e) -> {
            jlMostrarNombre.setText("Hola " + jtfIngresoNombre.getText());
        } //Implementar todos los metodos abstractos actionPerfomeed
        ;
        jbBotonMostrarNombre.addActionListener(oyenteDeAccion);
    }                                                    

    private void jbBotonMostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override//Implementar todos los metodos abstractos actionPerfomeed
            public void actionPerformed(ActionEvent e) {
                jlMostrarContraseña.setText("Contraseña: " + jpfingresoContraseña.getText());
            }
        };
        jbBotonMostrarContraseña.addActionListener(oyenteDeAccion);
    }                                                        

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(() -> {
//            new Ventana2().setVisible(true);
//        });
//    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbBotonMostrarContraseña;
    private javax.swing.JButton jbBotonMostrarNombre;
    private javax.swing.JLabel jlIngreseContraseña;
    private javax.swing.JLabel jlIngreseNombre;
    private javax.swing.JLabel jlMostrarContraseña;
    private javax.swing.JLabel jlMostrarNombre;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPasswordField jpfingresoContraseña;
    private javax.swing.JTextField jtfIngresoNombre;
    // End of variables declaration
}
