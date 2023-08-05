
package project;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.*;
import javax.swing.Icon;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;

public class RegistroEmpleados extends javax.swing.JFrame {
    Empleado objEmpleado; // CODIGO NOMBRE APELLIDO VENTAS FOTO
    ArregloEmpleado objArreglo;
    DefaultTableModel miModelo;
    String[] cabecera={"N°","DNI","Nombre","Apellido","Salario"};
    String[][] data={};
    //Variables globales
    int num = 0;
    public RegistroEmpleados() {
        initComponents();
        this.setLocationRelativeTo(this);
        miModelo=new DefaultTableModel(data, cabecera);
        tblRegistros.setModel(miModelo);
        objArreglo = new ArregloEmpleado();
        cargaData();
        actualizar_tabla();
        resumen();
        jtxtCodigo.requestFocus();
    }
    
    public void cargaData(){
        //lee la data del objeto serializado
        try {
            FileInputStream fis = new FileInputStream("EmpleadosEmpresa.bin");
            ObjectInputStream in = new ObjectInputStream(fis);
            if (in != null){
                objArreglo = (ArregloEmpleado)in.readObject();
                in.close();
            }
        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Error el cargar el archivo binario.."+ex);
        }//fin del catsh
    }//fin de cargadata
    
    public void grabar (){
        
        try{
            FileOutputStream fos = new FileOutputStream("EmpleadosEmpresa.bin");
            ObjectOutputStream out = new ObjectOutputStream(fos);
            
            if (out != null){
                out.writeObject(objArreglo);
                out.close();
            }//fin del if
        }catch(Exception ex){
            mensaje( "Error en grabacion del archivo serializado.."+ex);
        }//fin del catch
    }//fin del if

    //LIMPIAR LA TABLA CADA VEZ QUE ESTA SE ACTUALIZA
    public void vaciar_tabla(){ 
        int filas=tblRegistros.getRowCount();
        for (int i=0;i<filas; i++)
        miModelo.removeRow(0);
    }
    //METODO PARA MOSTRAR LOS MENSAJES DEL APLICATIVO
    public void mensaje(String texto){
        JOptionPane.showMessageDialog(this,texto);
    }//FIN DEL MESAJE
    
    
    void resumen () {//Declaración de las variables para la extracción de datos
        int n=objArreglo.numeroEmpleados();//Numero de Empleados
        for(int i=0;i<n;i++) { //Se extrae la informacion de cada objeto del Arreglo
            String cod = objArreglo.getEmpleado(i).getCodigo();
            String nombre = objArreglo.getEmpleado(i).getNombre();
            String ape = objArreglo.getEmpleado(i).getApellido();
            double sala = objArreglo.getEmpleado(i).getVentas();
        }
         }
        

    
    
    public void actualizar_tabla(){
        
        vaciar_tabla();//Vaciandola informacion de la tabla

        int n=objArreglo.numeroEmpleados();
        for(int i=0;i<n;i++) {

            String cod = objArreglo.getEmpleado(i).getCodigo();
            String nom = objArreglo.getEmpleado(i).getNombre();
            String ape = objArreglo.getEmpleado(i).getApellido();
            double vp=objArreglo.getEmpleado(i).getVentas();       
            
            
            //Insertando la informacion en la tabla
            insertar (i+1, cod, nom,ape,vp);
            
        }
    }
    
    //METODOS PARA LAS CONSULTAS, ELIMINACIÓN Y MODIFICACION DE DATOS
    public void modifica(){
        String cod=jtxtCodigo.getText().toUpperCase();
        //Se vuelve a buscar el código para no repetir el mismo
        int p=objArreglo.busca(cod);

        //Se leen los datos de entrada de los TextField
        String nom=jtxtNombre.getText().toUpperCase();
        String ape=jtxtApellido.getText().toUpperCase();
        double sala=Double.parseDouble(jtxtVentas.getText());
        Icon por=jlblImagen.getIcon();
        //Generando la clase para manejar un Empleado
        objEmpleado=new Empleado(cod,nom,ape,sala,por);
        
        //Verificando si el codigo existe dentro del arreglo
        if(p==-1) //Codigo nuevo
            objArreglo.agrega(objEmpleado);
        else //Codigo existente
            objArreglo.reemplaza(p,objEmpleado);
        
        limpiar_entradas(); //Llamar al método de limpiar entrada
        grabar(); //Llamar al método de grabar la info en el archivo binario
        actualizar_tabla(); //Llama al método actualziar tabla
        //Llama al método resumen para mostrar los datos de la table
        resumen();
        //Colocando el cursos en el text Codigo
        jtxtCodigo.requestFocus();
    }//Fin
    
    public void eliminar(){
        consulta();
        
        int p=objArreglo.busca(jtxtCodigo.getText().toUpperCase());
        if(p!=-1)
        {
            int r=JOptionPane.showConfirmDialog(this, "¿Está seguro de despedir a este empleado?"
                    ,"Responder",0);
            if (r==0)
            {  objArreglo.elimina(p);
               limpiar_entradas();
               grabar();
               actualizar_tabla(); 
               resumen();
               jtxtCodigo.requestFocus();
            }
        }
    }//Fin
    
    public void consulta(){
        String cod=jtxtCodigo.getText().toUpperCase();
        
        int p=objArreglo.busca(cod);
            if(p==-1)
            {
                mensaje("Código no existe");
                limpiar_entradas();
            }
            else{
                objEmpleado=objArreglo.getEmpleado(p);
                
                String nombre=objEmpleado.getNombre();
                String apellido=objEmpleado.getApellido();
                double vp=objEmpleado.getVentas();

                jtxtNombre.setText(nombre);
                jtxtVentas.setText(String.valueOf(vp));
                jtxtApellido.setText(apellido);
                jlblImagen.setIcon(objEmpleado.getFoto());
            }
    }//Fin   
    
    
    //METODOS PARA LIMPIAR LAS ENTRADAS
    void limpiar_entradas(){
        jtxtCodigo.setText("");
        jtxtNombre.setText("");
        jtxtVentas.setText("");
        jtxtApellido.setText("");
        //deseleccionando los ComboBox
        jtxtCodigo.requestFocus(true);
        //Colocando sin iconos en el jlblImagen
        jlblImagen.setIcon(null);  
    }
    
    //METODO PARA INSERTAR LA INFORMACIÓN EN LA TABLA
    void insertar(int num, String codigo, String nombre, String apellido, double ventas){

        //dando Formato al sueldo
        DecimalFormat df2 = new DecimalFormat("####.00");
        String ven;
        ven = df2.format(ventas);
        Object[] fila = {num,codigo, nombre, apellido, ven};
        miModelo.addRow(fila);
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jtxtCodigo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtxtNombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtxtApellido = new javax.swing.JTextField();
        jbtnGrabar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jbtnBuscarPortada = new javax.swing.JButton();
        jtxtVentas = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        jlblImagen = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton35 = new javax.swing.JButton();

        btnModificar.setFont(new java.awt.Font("Cambria", 1, 13)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 163, 104));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("DNI");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 40, 30));

        jtxtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtCodigoKeyPressed(evt);
            }
        });
        jPanel1.add(jtxtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 230, 30));

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nombre");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jtxtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtNombreKeyPressed(evt);
            }
        });
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 230, 30));

        jLabel15.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Apellido");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        jtxtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtApellidoKeyPressed(evt);
            }
        });
        jPanel1.add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 230, 30));

        jbtnGrabar.setBackground(new java.awt.Color(0, 0, 0));
        jbtnGrabar.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtnGrabar.setForeground(new java.awt.Color(255, 255, 51));
        jbtnGrabar.setText("Grabar");
        jbtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGrabarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 140, 150, 27));

        btnConsultar.setBackground(new java.awt.Color(0, 0, 0));
        btnConsultar.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 51));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 150, 27));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 51));
        btnEliminar.setText("Despedir");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 240, 150, 27));

        jbtnBuscarPortada.setBackground(new java.awt.Color(0, 0, 0));
        jbtnBuscarPortada.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jbtnBuscarPortada.setForeground(new java.awt.Color(255, 255, 51));
        jbtnBuscarPortada.setText("Foto");
        jbtnBuscarPortada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarPortadaActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBuscarPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 190, 150, 30));

        jtxtVentas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtVentasKeyPressed(evt);
            }
        });
        jPanel1.add(jtxtVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 230, 30));

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Salario");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 30));

        tblRegistros.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Codigo", "Nombre de Empleado", "Estado Civil", "Hijos", "Ventas Precio", "Sueldo Base", "Sueldo Neto"
            }
        ));
        jScrollPane1.setViewportView(tblRegistros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 1100, 270));
        jPanel1.add(jlblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 190, 180));

        jPanel9.setBackground(new java.awt.Color(255, 255, 102));

        jLabel5.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 0));
        jLabel5.setText("Tai • Loy | Libreria-Bazar ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 60));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 51));
        jTextField1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("  TayLoy | REGISTRO DE EMPLEADOS");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1120, 20));

        jButton35.setBackground(new java.awt.Color(255, 51, 51));
        jButton35.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setText("Regresar");
        jButton35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodigoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoKeyPressed

    private void jtxtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jtxtNombreKeyPressed

    private void jtxtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtApellidoKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jtxtApellidoKeyPressed

    private void jbtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarActionPerformed
        // TODO add your handling code here:
        String cod = jtxtCodigo.getText().toUpperCase();
        String nom = jtxtNombre.getText().toUpperCase();
        String ape = jtxtApellido.getText().toUpperCase();
        double vp = Double.parseDouble(jtxtVentas.getText());
        Icon por=jlblImagen.getIcon();

        //Generando la clase para manejar un Empleado
        objEmpleado = new Empleado(cod,nom,ape,vp,por);

        //Verificando si el codigo existe dentro del arreglo
        if(objArreglo.busca(objEmpleado.getCodigo())!=-1)
        mensaje("Codigo Repetido"); //Se muestra mensaje
        else
        {
            objArreglo.agrega(objEmpleado); //Se agrega el objeto al arreglo
            //Insertando la información en la Tabla
            insertar(0,cod,nom,ape,vp);
            //Limpiando las entradas
            limpiar_entradas();
            //Grabando la información en el archivo binario
            grabar();
            //Actualizando la tabla
            actualizar_tabla();
            //Llamando al método resumen para ver los datos de salida
            resumen();
        }

    }//GEN-LAST:event_jbtnGrabarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        consulta();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        modifica();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jbtnBuscarPortadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarPortadaActionPerformed
        JFileChooser dlg = new JFileChooser();
        int option = dlg.showOpenDialog(this);//abre la ventana de dialogo
        //Si hace click en boton abrir del dialogo
        if(option == JFileChooser.APPROVE_OPTION){
            //Obtiene nombre de archivo seleccionado
            String file= dlg.getSelectedFile().getPath();
            jlblImagen.setIcon(new ImageIcon(file));
            //Modificando la imagen
            ImageIcon icon = new ImageIcon(file);
            //Se extrae la imagen del icono
            Image img = icon.getImage();
            //Se modifica su tamaño
            Image newimg = img.getScaledInstance(150, 180, java.awt.Image.SCALE_SMOOTH);
            //Se genera el Image icon con la nueva imagen
            ImageIcon newIcon = new ImageIcon(newimg);
            
           
            jlblImagen.setIcon(newIcon); //Se coloca el nuevo icono modificado
            jlblImagen.setSize(150, 180); //Se cambia el tamaño de la etiqueta
        }
    }//GEN-LAST:event_jbtnBuscarPortadaActionPerformed

    private void jtxtVentasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtVentasKeyPressed

    }//GEN-LAST:event_jtxtVentasKeyPressed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        this.setVisible(false);
        AdminMenu I = new AdminMenu();
        I.setVisible(true);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new RegistroEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton35;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtnBuscarPortada;
    private javax.swing.JButton jbtnGrabar;
    private javax.swing.JLabel jlblImagen;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JTextField jtxtVentas;
    private javax.swing.JTable tblRegistros;
    // End of variables declaration//GEN-END:variables
}
