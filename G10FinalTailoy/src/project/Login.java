package project;
import javax.swing.JOptionPane;
import project.Index;
import project.Index;
import project.RegistroEmpleados;
import project.RegistroEmpleados;
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TFContrasena = new javax.swing.JPasswordField();
        TFUsuario = new javax.swing.JTextField();
        BTNIngresar = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TFContrasena.setBackground(new java.awt.Color(204, 255, 0));
        TFContrasena.setForeground(new java.awt.Color(255, 255, 255));
        TFContrasena.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        TFContrasena.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(TFContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 180, 50));

        TFUsuario.setBackground(new java.awt.Color(204, 255, 0));
        TFUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TFUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        TFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 180, 60));

        BTNIngresar.setBackground(new java.awt.Color(0, 255, 153));
        BTNIngresar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BTNIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/LoginAdmin.png"))); // NOI18N
        BTNIngresar.setText("Iniciar Sesión");
        BTNIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNIngresarMouseClicked(evt);
            }
        });
        BTNIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 160, 30));

        jButton31.setBackground(new java.awt.Color(255, 51, 51));
        jButton31.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("Salir");
        jButton31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 51, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/AdminLogin.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFUsuarioActionPerformed

    private void BTNIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIngresarActionPerformed
  String a = TFUsuario.getText();
  String b = TFContrasena.getText();
  
  if(a.isEmpty() || b.isEmpty()){
      JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
    }else{
      if (a.equals("admin") && b.equals("1530")){
          JOptionPane.showMessageDialog(null, "¡Bienvenido otra vez!");
        AdminMenu o = new AdminMenu();
        o.setVisible(true);
        this.setVisible(false);
      }else{ 
        JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
        
      }
    }
  
  
    }//GEN-LAST:event_BTNIngresarActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        Index i = new Index();
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void BTNIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNIngresarMouseClicked
//        TaiLoyStatus o = new TaiLoyStatus();
//        o.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_BTNIngresarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNIngresar;
    private javax.swing.JPasswordField TFContrasena;
    private javax.swing.JTextField TFUsuario;
    private javax.swing.JButton jButton31;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables


}
