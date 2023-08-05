
package project;

import project.BD.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class CV extends javax.swing.JFrame {
    
    
    DefaultTableModel tabla;
    

   
    public CV() {
        
        initComponents();
        cargarRegistroAlaTabla("");
        desactivado();
    }

    public void cargarRegistroAlaTabla(String valor){
        
        String[] titulo={"DNI","Nombre","Telefono","E-MAIL","Fecha_Entrega"};
        String[] fila=new String[5];
        tabla = new DefaultTableModel(null,titulo);
 try{
            //conectar a la bd
            String xurl="jdbc:mysql://localhost/bdVentas";    
            String xusu="root";
            String xpas="";
            
            Connection conex=DriverManager.getConnection(xurl,xusu,xpas);
            Statement con=conex.createStatement();
    
            String xsql="SELECT*FROM cliente";
            
            ResultSet rs = con.executeQuery(xsql);
            
    while(rs.next()){
        fila[0]=rs.getString("DNI");
        fila[1]=rs.getString("Nombre");
        fila[2]=rs.getString("Telefono");
        fila[3]=rs.getString("Email");
        fila[4]=rs.getString("Fecha");
        tabla.addRow(fila);
    }                        
     tablita.setModel(tabla);
        }catch(SQLException ex){
            System.out.println("Error en la conexion");
        }
    }
    
    public void desactivado(){
        txtCod.setEnabled(false);
        txtNom.setEnabled(false);
        txtRuc.setEnabled(false);
        txtDir.setEnabled(false);
        txtFecIng.setEnabled(false);
        btnNue.setEnabled(true);
        btnGrab.setEnabled(false);
    }
    
    public void activado(){
        txtCod.setEnabled(true);
        txtNom.setEnabled(true);
        txtRuc.setEnabled(true);
        txtDir.setEnabled(true);
        txtFecIng.setEnabled(true);
        btnNue.setEnabled(false);
        btnGrab.setEnabled(true);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        txtDir = new javax.swing.JTextField();
        txtFecIng = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnNue = new javax.swing.JButton();
        btnGrab = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton31 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablita);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DNI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TELEFONO/CELULAR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-MAIL");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, -1, -1));
        jPanel1.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 277, 38));
        jPanel1.add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 277, 38));
        jPanel1.add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 488, 39));
        jPanel1.add(txtDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 488, 33));

        txtFecIng.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(txtFecIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 488, 34));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("Tai • Loy | Libreria-Bazar ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        btnNue.setBackground(new java.awt.Color(0, 0, 0));
        btnNue.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        btnNue.setForeground(new java.awt.Color(255, 255, 51));
        btnNue.setText("NUEVO");
        btnNue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueActionPerformed(evt);
            }
        });
        jPanel1.add(btnNue, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 650, 150, -1));

        btnGrab.setBackground(new java.awt.Color(0, 0, 0));
        btnGrab.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        btnGrab.setForeground(new java.awt.Color(255, 255, 51));
        btnGrab.setText("GRABAR");
        btnGrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabActionPerformed(evt);
            }
        });
        jPanel1.add(btnGrab, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 650, 150, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA DE POSTULACIÓN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 51));
        jTextField1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("  ¡TRABAJA CON NOSOTROS! | ¡DÉJANOS TUS DATOS Y TE CONTACTAREMOS!");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1200, 40));

        jButton31.setBackground(new java.awt.Color(255, 51, 51));
        jButton31.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("REGRESAR");
        jButton31.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 710, 190, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/fototailoy.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 108, -1, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        this.setVisible(false);
        Tailoy I = new Tailoy();
        I.setVisible(true);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void btnNueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueActionPerformed
        activado();
    }//GEN-LAST:event_btnNueActionPerformed

    private void btnGrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabActionPerformed
         try{
            //conectar a la bd
            String xurl="jdbc:mysql://localhost/bdVentas";
            String xusu="root";
            String xpas="";

            Connection conex=DriverManager.getConnection(xurl,xusu,xpas);

            //insertar registro
            String xsql="INSERT INTO cliente(DNI,Nombre,Telefono,Email,Fecha)"
            +"VALUES (?,?,?,?,?)";

            PreparedStatement prepa = conex.prepareStatement(xsql);

            prepa.setString(1, txtCod.getText());
            prepa.setString(2, txtNom.getText());
            prepa.setString(3, txtRuc.getText());
            prepa.setString(4, txtDir.getText());
            prepa.setString(5, txtFecIng.getText());

            prepa.executeUpdate();

            cargarRegistroAlaTabla("");

            System.out.println("El cliente fue registrado ...");
        }catch(SQLException ex){
            System.out.println("ERROR AL GRABAR");
        }
    }//GEN-LAST:event_btnGrabActionPerformed

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
            java.util.logging.Logger.getLogger(CV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrab;
    private javax.swing.JButton btnNue;
    private javax.swing.JButton jButton31;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablita;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtFecIng;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtRuc;
    // End of variables declaration//GEN-END:variables
}
