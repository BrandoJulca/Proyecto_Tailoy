package project;

import Inicio.*;
import Inicio.Producto;
import Inicio.Proceso;
import Inicio.LimpiarTexto;
import Inicio.Tablaimagen;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import project.AdminMenu;
import project.Index;


public class RegistroProductos extends javax.swing.JFrame {
    LimpiarTexto lt = new LimpiarTexto();  
    private String ruta_txt = "productoslistado.txt"; 
    Producto p;
    Proceso rp;
    int clic_tabla;
    
    public static void RegistroProductos(String[] args){
        new RegistroProductos().setVisible(true);
}
    public RegistroProductos() {
        initComponents();
        rp = new Proceso(); 
        try{
            cargar_basetxt();
            listarRegistro();
        }catch(Exception ex){
            mensaje("[ERROR] No existe ningun Archivo en donde registre los Datos");
        }}

    public void cargar_basetxt(){
        try{
            FileInputStream fis = new FileInputStream(ruta_txt);
            ObjectInputStream in = new ObjectInputStream(fis);
            if(in != null){
                rp = (Proceso)in.readObject();
                in.close();
            }
        }catch(Exception ex){
            mensaje("[ERROR] No cargo correctamente el Archivo - Tailoy: "+ex.getMessage());
            System.out.println(ex.getMessage());
        }}

    public void grabarbase(){
       FileOutputStream fos;
       ObjectOutputStream out;
        try{
            fos = new FileOutputStream(ruta_txt);
            out = new ObjectOutputStream(fos);
            if(out != null){
                out.writeObject(rp);
                out.close();
            }  
        }catch(Exception ex){
            mensaje("[ERROR] No se grabo correctamente el Archivo - Tailoy: "+ex.getMessage());
            System.out.println(ex.getMessage());
        }}
    
       
    public void ingresarRegistro(File ruta){
        try{
            if(leerCodigo() == -666)mensaje("Ingresar Codigo - Tailoy");
            else if(leerNombre() == null)mensaje("Ingresar Nombre - Tailoy");
            else if(leerPrecio() == -666) mensaje("Ingresar Precio - Tailoy");
            else if(leerDescripcion() == null)mensaje("Ingresar Descripcion del Producto - Tailoy");
            else{
                p = new Producto(leerCodigo(), leerNombre(), leerPrecio(), leerDescripcion(), leerFoto(ruta));
                if(rp.buscaCodigo(p.getCodigo())!= -1)mensaje("[ADVERTENCIA] Este Codigo que ingresaste ya existe en el Sistema");
                else rp.agregarRegistro(p);
                grabarbase();
                listarRegistro();
                lt.limpiar_texto(panel); 
            }
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }}
    
    public void modificarRegistro(File ruta){
        try{
            if(leerCodigo() == -666)mensaje("Ingresar Codigo - Tailoy");
            else if(leerNombre() == null)mensaje("Ingresar Nombre - Tailoy");
            else if(leerPrecio() == -666) mensaje("Ingresar Precio - Tailoy");
            else if(leerDescripcion() == null)mensaje("Ingresar Descripcion del Producto - Tailoy");
            else{
                int codigo = rp.buscaCodigo(leerCodigo());
                if(txtRuta.getText().equalsIgnoreCase(""))
                p = new Producto(leerCodigo(), leerNombre(), leerPrecio(), leerDescripcion(), leerFoto2(codigo));
                else p = new Producto(leerCodigo(), leerNombre(), leerPrecio(), leerDescripcion(), leerFoto(ruta));
                
                if(codigo == -1)rp.agregarRegistro(p);
                else rp.modificarRegistro(codigo, p);
                
                grabarbase();
                listarRegistro();
                lt.limpiar_texto(panel);
            }
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }
    }
    
    public void eliminarRegistro(){
        try{
            if(leerCodigo() == -666) mensaje("Ingresa un Codigo"); //Que sea Entero
            
            else{
                int codigo = rp.buscaCodigo(leerCodigo());
                if(codigo == -1) mensaje("No existe ningun Codigo en Tailoy");
                
                else{
                    int s = JOptionPane.showConfirmDialog(null, "Acaso quieres eliminar este Producto de Tailoy?","Si/No",0);
                    if(s == 0){
                        rp.eliminarRegistro(codigo);
                        
                        grabarbase();
                        listarRegistro();
                        lt.limpiar_texto(panel);
                    }}}
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }
    }
    
    public void listarRegistro(){
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        dt.addColumn("Codigo - Producto");
        dt.addColumn("Nombre - Producto");
        dt.addColumn("Precio - Producto");
        dt.addColumn("Descripcion - Producto");
        dt.addColumn("Foto - Producto");
        
        tabla.setDefaultRenderer(Object.class, new Tablaimagen());
        
        Object fila[] = new Object[dt.getColumnCount()];
        for(int i = 0; i < rp.cantidadRegistro(); i++){
            p = rp.obtenerRegistro(i);
            fila[0] = p.getCodigo();
            fila[1] = p.getNombre();
            fila[2] = p.getPrecio();
            fila[3] = p.getDescripcion();
            try{
                byte[] bi = p.getFoto();
                BufferedImage image = null;
                InputStream in = new ByteArrayInputStream(bi);
                image = ImageIO.read(in);
                ImageIcon img = new ImageIcon(image.getScaledInstance(65, 65, 0));
                fila[4] = new JLabel(img);
            }catch(Exception ex){
                fila[4] = "[ERROR] No hay ninguna Imagen!";
            }
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
    }
    
    public int leerCodigo(){
        try{
            int codigo = Integer.parseInt(txtCodigo.getText().trim());
            return codigo;
        }catch(Exception ex){
            return -666;
        }
    }
    
    public String leerNombre(){
        try{
            String nombre = txtNombre.getText().trim().replace(" ", "_");
            return nombre;
        }catch(Exception ex){
            return null;
        }
    }
    
    public double leerPrecio(){
        try{
            double precio = Double.parseDouble(txtPrecio.getText().trim());
            return precio;
        }catch(Exception ex){
            return -666;
        }
    }
    
    public Object leerDescripcion(){
        try{
            Object descripcion = txtDescripcion.getText().trim();
            return descripcion;
        }catch(Exception ex){
            return null;
        }
    }
      
    
    public byte[] leerFoto(File ruta){
        try{
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            return icono;
        }catch(Exception ex){
            return null;
        }
    }
    

    public byte[] leerFoto2(int codigo){
            p = rp.obtenerRegistro(codigo);
            try{
               return p.getFoto();
            }catch(Exception ex){
               return null;
            }}

    public void mensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        lblFoto = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        jButton35 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(1, 163, 104));
        panel.setForeground(new java.awt.Color(255, 255, 51));

        tabla.setBackground(new java.awt.Color(204, 255, 204));
        tabla.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tailoy 1", "Tailoy 2", "Tailoy 3", "Tailoy 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 51));
        jButton1.setText("Guardar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 51));
        jButton2.setText("Modificar Producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 51));
        jButton3.setText("Eliminar Producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtPrecio.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton4.setText("Adjuntar Imagen");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lblFoto.setBackground(new java.awt.Color(204, 255, 204));
        lblFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFoto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 51));
        jButton5.setText("Limpiar Datos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 102));

        jLabel6.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setText("Tai • Loy | Libreria-Bazar ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 51));
        jTextField1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("  TayLoy | REGISTRO DE PRODUCTOS");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Precio - Producto");

        jLabel19.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Codigo - Producto");

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Imagen - Producto");

        jLabel21.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Nombre - Producto");

        jLabel22.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Descripción - Producto");

        txtRuta.setEditable(false);
        txtRuta.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(537, 537, 537))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(49, 49, 49)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(21, 21, 21)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(27, 27, 27)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(98, 98, 98)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(241, 241, 241)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton35)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        LimpiarTexto lp = new LimpiarTexto();
        lp.limpiar_texto(panel);
    }//GEN-LAST:event_jButton5ActionPerformed

    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        jf.setFileFilter(fil);
        jf.setCurrentDirectory(new File("Fotos"));
        int el = jf.showOpenDialog(this);
        if(el == JFileChooser.APPROVE_OPTION){
            txtRuta.setText(jf.getSelectedFile().getAbsolutePath());
            lblFoto.setIcon(new ImageIcon(txtRuta.getText()));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.eliminarRegistro();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        File ruta = new File(txtRuta.getText());
        this.modificarRegistro(ruta);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File ruta = new File(txtRuta.getText());
        this.ingresarRegistro(ruta);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        clic_tabla = tabla.rowAtPoint(evt.getPoint());

        int codigo = (int)tabla.getValueAt(clic_tabla, 0);
        String nombre = ""+tabla.getValueAt(clic_tabla, 1);
        double precio = (double)tabla.getValueAt(clic_tabla, 2);
        Object descripcion = ""+tabla.getValueAt(clic_tabla, 3);

        txtCodigo.setText(String.valueOf(codigo));
        txtNombre.setText(nombre);
        txtPrecio.setText(String.valueOf(precio));
        txtDescripcion.setText(String.valueOf(descripcion));

        try{
            JLabel lbl = (JLabel)tabla.getValueAt(clic_tabla, 4);
            lblFoto.setIcon(lbl.getIcon());
        }catch(Exception ex){
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        this.setVisible(false);
        AdminMenu I = new AdminMenu();
        I.setVisible(true);
    }//GEN-LAST:event_jButton35ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
