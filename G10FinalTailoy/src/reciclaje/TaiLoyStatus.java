package reciclaje;
import reciclaje.Empleado12;
import javax.swing.table.DefaultTableModel;
import project.Index;
public class TaiLoyStatus extends javax.swing.JFrame {
DefaultTableModel dtm=new DefaultTableModel();
    
    public TaiLoyStatus() {
        initComponents();
        String[] Titulo = new String[]{"Nombre ","Apellido ", "Sede", "Sueldo" };
                dtm.setColumnIdentifiers(Titulo);
                        Tabla1.setModel(dtm);
    }
void agregar(){
    dtm.addRow(new Object[]{
    TEXT1.getText(), TEXT2.getText(), OBJDistrito.getSelectedItem().toString(), TEXT4.getText()});
    }

void limpiar(){
        int fila=Tabla1.getSelectedRow();
        dtm.removeRow(fila);
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton35 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        TEXT1 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        TEXT2 = new javax.swing.JTextField();
        OBJDistrito = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        TEXT3 = new javax.swing.JTextField();
        TEXT4 = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        BTN3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TProducto = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(255, 255, 102));

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("Tai • Loy | Libreria-Bazar ");

        jButton35.setBackground(new java.awt.Color(255, 51, 51));
        jButton35.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("Salir");
        jButton35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jButton35)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(1, 163, 104));

        jLabel69.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 221, 36));
        jLabel69.setText("Nombre");

        jLabel70.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 221, 36));
        jLabel70.setText("Apellido");

        OBJDistrito.setBackground(new java.awt.Color(255, 221, 36));
        OBJDistrito.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        OBJDistrito.setForeground(new java.awt.Color(255, 221, 36));
        OBJDistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San Borja", "San Luis", "Lince", "Miraflores" }));
        OBJDistrito.setBorder(null);

        jLabel71.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 221, 36));
        jLabel71.setText("Sede");

        TEXT3.setEditable(false);
        TEXT3.setBackground(new java.awt.Color(1, 163, 104));
        TEXT3.setForeground(new java.awt.Color(255, 255, 255));
        TEXT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXT3ActionPerformed(evt);
            }
        });

        TEXT4.setEditable(false);
        TEXT4.setBackground(new java.awt.Color(1, 163, 104));
        TEXT4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TEXT4.setForeground(new java.awt.Color(255, 255, 255));
        TEXT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXT4ActionPerformed(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 221, 36));
        jLabel72.setText("SueldoCalculado");

        BTN3.setText("Calcular");
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(1, 163, 104));
        jButton2.setText("Contratar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Tabla1.setBackground(new java.awt.Color(1, 163, 104));
        Tabla1.setForeground(new java.awt.Color(255, 255, 255));
        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tabla1);

        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Despedir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 221, 36));
        jLabel73.setText("N°");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69)
                    .addComponent(TEXT1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addComponent(TEXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel73))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(OBJDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TEXT3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TEXT4)
                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BTN3)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(293, 293, 293))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TEXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OBJDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registrar Empleado", jPanel2);

        TProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Elec01", "Laptop", "Electrodomestico",  new Double(1200.0)},
                {"Elec02", "Televisor", "Electrodomestico",  new Double(600.0)},
                {"Elec03", "Laptop ASUS", "Electrodomestico",  new Double(2000.0)},
                {"Elec04", "Microonda", "Electrodomestico",  new Double(300.0)},
                {"Elec05", "Refrigerador LG", "Electrodomestico",  new Double(800.0)},
                {"Elec06", "Refrigerador", "Electrodomestico",  new Double(750.0)},
                {"Elec07", "Cocina", "Electrodomestico",  new Double(450.0)},
                {"Elec08", "Ventilador", "Electrodomestico",  new Double(120.0)},
                {"Elec09", "Tostador", "Electrodomestico",  new Double(185.0)},
                {"Esco01", "Borrador rompe hoja", "Utiles",  new Double(1.5)},
                {"Esco02", "Goma", "Utiles",  new Double(5.0)},
                {"Esco03", "Tajador", "Utiles",  new Double(2.3)},
                {"Esco04", "Liquid paper", "Utiles",  new Double(2.0)},
                {"Esco05", "Pack de reglas", "Utiles",  new Double(10.0)},
                {"Esco06", "Pack de colores", "Utiles",  new Double(12.0)},
                {"Esco07", "Tripack lapiz", "Utiles",  new Double(3.0)},
                {"Esco08", "Tijera", "Utiles",  new Double(2.5)},
                {"Esco09", "Pack de Borradores", "Utiles",  new Double(4.0)},
                {"Esco10", "Pack de Lapiceros", "Utiles",  new Double(5.0)},
                {"Jugt01", "Max Steel", "Juguetes",  new Double(18.0)},
                {"Jugt02", "Veguetta SS4", "Juguetes",  new Double(17.0)},
                {"Jugt03", "Goku SSD", "Juguetes",  new Double(21.0)},
                {"Jugt04", "Baby Yoda", "Juguetes",  new Double(25.0)},
                {"Jugt05", "Baby Tiger", "Juguetes",  new Double(15.0)},
                {"Jugt06", "Thanos Marvel", "Juguetes",  new Double(20.0)},
                {"Jugt07", "Yogurt Light", "Juguetes",  new Double(12.0)},
                {"Jugt08", "Toy Sonic", "Juguetes",  new Double(16.0)},
                {"Jugt09", "Alien Tripack", "Juguetes",  new Double(10.0)},
                {"Jugt10", "El Magias", "Juguetes",  new Double(26.0)}
            },
            new String [] {
                "Id producto", "Nombre Producto", "Categoria", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TProducto.setToolTipText("");
        jScrollPane1.setViewportView(TProducto);

        jPanel10.setBackground(new java.awt.Color(102, 204, 255));

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Productos Tai • Loy ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Productos", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TEXT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXT3ActionPerformed

    }//GEN-LAST:event_TEXT3ActionPerformed

    private void TEXT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXT4ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        //JALA NOMBRES DEL FORMULARIO

        String a=TEXT1.getText();
        String b=TEXT2.getText();
        String c=OBJDistrito.getSelectedItem().toString();
        sueldos();
        String d=TEXT3.getText();

        Empleado12 Slave = new Empleado12(a,b,c,Double.parseDouble(d)); //NOMBRES + CONSTRUCTOR

//        TXTA1.append(Slave.mostrarCodigo()+" "+Slave.mostrarNombre()+" "+Slave.mostrarCategoria()+" "+Slave.mostrarSueldo());
        String f=String.valueOf(Slave.mostrarSueldo());
        TEXT4.setText(f);
        //agregar();
        //sumar();
        //igv();
        //totalpagar();

    }//GEN-LAST:event_BTN3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        agregar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
    this.setVisible(false);
        Index I = new Index();
        I.setVisible(true);
    }//GEN-LAST:event_jButton35ActionPerformed

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
            java.util.logging.Logger.getLogger(TaiLoyStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaiLoyStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaiLoyStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaiLoyStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaiLoyStatus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN3;
    private javax.swing.JComboBox<String> OBJDistrito;
    private javax.swing.JTextField TEXT1;
    private javax.swing.JTextField TEXT2;
    private javax.swing.JTextField TEXT3;
    private javax.swing.JTextField TEXT4;
    private javax.swing.JTable TProducto;
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
private int sueldos() {
      if (OBJDistrito.getSelectedItem().toString()=="Miraflores")
         TEXT3.setText("4");
      else if (OBJDistrito.getSelectedItem().toString()=="San Luis")  
            TEXT3.setText("2");
      else if (OBJDistrito.getSelectedItem().toString()=="Lince") 
          TEXT3.setText("3");
      else if (OBJDistrito.getSelectedItem().toString()=="San Borja") 
          TEXT3.setText("1");
      return 0;
      
//          (OBJDistrito.getSelectedItem().toString()=="San Borja")
//              (OBJDistrito.getSelectedItem().toString()=="Lince")
          
      }
}
