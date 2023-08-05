package project;

import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Tailoy extends javax.swing.JFrame {
DefaultTableModel dtm=new DefaultTableModel();
DefaultTableModel dtm2=new DefaultTableModel();
Pedidos <Integer> numpedido = new Pedidos <>();
int columnas = 0;

    public Tailoy(){ 
        initComponents();
        String[] Titulo = new String[]{"ID ","Producto ", "Precio ", "Categoria" };
                dtm.setColumnIdentifiers(Titulo);
                        Tabla1.setModel(dtm);
                          String[] Titulo2 = new String[]{"Numero de Pedido ","Numero de Productos", "Precio " };
                dtm2.setColumnIdentifiers(Titulo2);
                        jTable1.setModel(dtm2);
//                        TFPrecioT.setText(Double.toString(suma()));
                        
       }
    void agregar(){
    dtm.addRow(new Object[]{
    TEXT1.getText(), TEXT2.getText(), TEXT3.getText(), TEXT4.getText()});
    
    columnas++;
    }
    
    void limpiar(){
        try{
        int fila=Tabla1.getSelectedRow();
        dtm.removeRow(fila);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "¡ ERROR !  DEBES SELECCIONAR UNA TABLA PARA PODER BORRAR ", "! ADVERTENCIA !", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void limpiar2(){
        try{
        DefaultTableModel tb = (DefaultTableModel) Tabla1.getModel();
        int fila=Tabla1.getRowCount();
        for (int i=fila; i > 0;  i--){
             dtm.removeRow(dtm.getRowCount()-1);
        }
       
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "NO HAY VALORES QUE BORRAR", "! ADVERTENCIA DE ERROR !", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     void sumar(){
         double fila=0;
         double total=0;
         for (int i=0; i < Tabla1.getRowCount(); i++){
         fila= Double.parseDouble(Tabla1.getValueAt(i,2).toString());
         total+=fila;
     }
    TFPrecioT.setText(total+" ");
   }
     void igv(){
         double Pfin=0;
    double a = Double.parseDouble(TFPrecioT.getText());
         double igv=0.18;
         Pfin=a*igv;
       TFPrecioF1.setText(Pfin+" ");
     }
     void totalpagar(){
         double TAP=0;
         double b = Double.parseDouble(TFPrecioT.getText());
         double c = Double.parseDouble(TFPrecioF1.getText());
         TAP=b+c;
        TFPrecioF2.setText(TAP+" "); 
         
     }
    
   
//     public double suma(){
//         int contar=Tabla1.getRowCount();
//                 double suma=0;
//                 for (int i=0; i < contar; i++){
//                     suma=suma+Double.parseDouble(Tabla1.getValueAt(i, 1).toString());
//                     
//                 }
//                 return suma;
//     }
    
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        BTNE1 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        BTNE2 = new javax.swing.JButton();
        BTNE5 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        BTNE4 = new javax.swing.JButton();
        BTNE3 = new javax.swing.JButton();
        TEXT1 = new javax.swing.JTextField();
        TEXT2 = new javax.swing.JTextField();
        TEXT3 = new javax.swing.JTextField();
        TEXT4 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        BTNE6 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        BTNE7 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        BTNE8 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        BTNE9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTBoleta = new javax.swing.JTextArea();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        BTNRestar3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jButton23 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        TXTAPELLIDO = new javax.swing.JTextField();
        TXTNombre = new javax.swing.JTextField();
        TXTDireccion = new javax.swing.JTextField();
        BTNRegistrar = new javax.swing.JButton();
        OBJDistrito = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        TFPrecioT = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        TFPrecioF1 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        BTNRestar2 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        TFPrecioF2 = new javax.swing.JTextField();
        BTNRestar4 = new javax.swing.JButton();
        BTNRestar5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("Tai • Loy | Libreria-Bazar ");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton31)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 51));
        jTextField1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("  TayLoy | Más que útiles");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(1, 163, 104));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Lap. s/1200");

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/9.png"))); // NOI18N

        BTNE1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BTNE1.setText("Comprar");
        BTNE1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTNE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNE1MouseClicked(evt);
            }
        });
        BTNE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNE1ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Tv LG s/600");

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/10.png"))); // NOI18N

        BTNE2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BTNE2.setText("Comprar");
        BTNE2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTNE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNE2ActionPerformed(evt);
            }
        });

        BTNE5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BTNE5.setText("Comprar");
        BTNE5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTNE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNE5ActionPerformed(evt);
            }
        });

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/13.png"))); // NOI18N

        jLabel57.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Refri. LG s/800");

        jLabel58.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Microonda s/300");

        jLabel59.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("ASUS s/2000");

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/11.png"))); // NOI18N

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/12.png"))); // NOI18N

        BTNE4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BTNE4.setText("Comprar");
        BTNE4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTNE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNE4ActionPerformed(evt);
            }
        });

        BTNE3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BTNE3.setText("Comprar");
        BTNE3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTNE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNE3ActionPerformed(evt);
            }
        });

        TEXT1.setEditable(false);
        TEXT1.setBackground(new java.awt.Color(255, 255, 255));

        TEXT2.setEditable(false);
        TEXT2.setBackground(new java.awt.Color(255, 255, 255));

        TEXT3.setEditable(false);
        TEXT3.setBackground(new java.awt.Color(255, 255, 255));

        TEXT4.setEditable(false);
        TEXT4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Refri. s/750");

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/14.png"))); // NOI18N

        BTNE6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BTNE6.setText("Comprar");
        BTNE6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTNE6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNE6MouseClicked(evt);
            }
        });
        BTNE6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNE6ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Cocina s/450");

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1_1.png"))); // NOI18N

        BTNE7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BTNE7.setText("Comprar");
        BTNE7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTNE7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNE7MouseClicked(evt);
            }
        });
        BTNE7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNE7ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Ventilador. s/120");

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/19.png"))); // NOI18N

        BTNE8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BTNE8.setText("Comprar");
        BTNE8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTNE8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNE8MouseClicked(evt);
            }
        });
        BTNE8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNE8ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Tostador s/185");

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/20.png"))); // NOI18N

        BTNE9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        BTNE9.setText("Comprar");
        BTNE9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BTNE9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNE9MouseClicked(evt);
            }
        });
        BTNE9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNE9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNE2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNE3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNE4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNE6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNE7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNE8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNE9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addComponent(TEXT1)
                    .addComponent(TEXT3)
                    .addComponent(TEXT2)
                    .addComponent(TEXT4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTNE5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(167, 167, 167))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(BTNE8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(BTNE5))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(BTNE4))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel59)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(BTNE3))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(BTNE2))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(BTNE1)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(TEXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TEXT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TEXT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TEXT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(BTNE6))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel48)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(BTNE7))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel52)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(BTNE9)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Electrodomesticos", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Borrador s/1.50");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/30.png"))); // NOI18N

        jButton11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton11.setText("Comprar");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Pack Color s/12");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/25.png"))); // NOI18N

        jButton12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton12.setText("Comprar");
        jButton12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Goma s/5");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/29.png"))); // NOI18N

        jButton13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton13.setText("Comprar");
        jButton13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Lapiz s/3");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/24.png"))); // NOI18N

        jButton14.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton14.setText("Comprar");
        jButton14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Tijera s/2.50");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/23.png"))); // NOI18N

        jButton15.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton15.setText("Comprar");
        jButton15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton16.setText("Comprar");
        jButton16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton17.setText("Comprar");
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/21.png"))); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/22.png"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Borrador s/4");

        jLabel35.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("P. Lapicero s/5");

        jButton18.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton18.setText("Comprar");
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/26.png"))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Pack Regla s/10");

        jLabel38.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("LiquidP. s/2");

        jLabel39.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Tajador s/2.30");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/28.png"))); // NOI18N

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/27.png"))); // NOI18N

        jButton19.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton19.setText("Comprar");
        jButton19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton20.setText("Comprar");
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(487, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton18))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton19))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton20))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton13))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton17))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton16))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton15))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton14))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton12)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Útiles escolares", jPanel7);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/2_1.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton1.setText("Comprar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Max Steel s/18");

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton2.setText("Comprar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/3_1.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Veguetta s/17");

        jButton3.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton3.setText("Comprar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/4_1.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Goku s/21");

        jButton4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton4.setText("Comprar");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/5_1.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Yoda s/25");

        jButton5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton5.setText("Comprar");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/6.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tiger s/15");

        jButton6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton6.setText("Comprar");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton7.setText("Comprar");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton8.setText("Comprar");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton9.setText("Comprar");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jButton10.setText("Comprar");
        jButton10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/8.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/7.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/15.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/16.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/17.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("El Magias s/26");

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("AlienTripack s/10");

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Sonic s/16");

        jLabel20.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("YogurtLight s/12");

        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Thanos s/20");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(487, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton4))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton3))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton2))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton7))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton8))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton9))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton10))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton6)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Juguetes", jPanel6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.addTab("Productos", jPanel1);

        jPanel9.setBackground(new java.awt.Color(1, 163, 104));

        TXTBoleta.setEditable(false);
        TXTBoleta.setColumns(20);
        TXTBoleta.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        TXTBoleta.setRows(5);
        jScrollPane1.setViewportView(TXTBoleta);

        jButton21.setBackground(new java.awt.Color(255, 255, 51));
        jButton21.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(1, 163, 104));
        jButton21.setText("Seguir Comprando");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton21MouseClicked(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(255, 255, 51));
        jButton22.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(1, 163, 104));
        jButton22.setText("Cerrar");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton22MouseClicked(evt);
            }
        });
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Cambria Math", 3, 24)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 221, 36));
        jLabel54.setText("¡Gracias por su compra!");

        BTNRestar3.setBackground(new java.awt.Color(255, 51, 51));
        BTNRestar3.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        BTNRestar3.setForeground(new java.awt.Color(255, 255, 255));
        BTNRestar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/clearboletas.png"))); // NOI18N
        BTNRestar3.setText("Limpiar Boleta");
        BTNRestar3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTNRestar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRestar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNRestar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTNRestar3))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jButton22)
                    .addComponent(jLabel54))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Boleta", jPanel4);

        jPanel10.setBackground(new java.awt.Color(1, 163, 104));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/1.png"))); // NOI18N

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/2.png"))); // NOI18N

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/3.png"))); // NOI18N

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/4.png"))); // NOI18N

        jLabel68.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 221, 36));
        jLabel68.setText("Sede Miraflores");

        jLabel69.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 221, 36));
        jLabel69.setText("Sede San Luis");

        jLabel70.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 221, 36));
        jLabel70.setText("Sede Lince");

        jLabel71.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 221, 36));
        jLabel71.setText("Sede San Borja");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel68))
                    .addComponent(jLabel55))
                .addGap(108, 108, 108)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel69)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(jLabel66)
                        .addGap(123, 123, 123))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel70)))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addGap(22, 22, 22)))
                .addGap(81, 81, 81))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68)
                    .addComponent(jLabel70))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel69)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel65))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel67)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Nuestras Sedes", jPanel3);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel72.setText("¿Deseas ser parte de la familia TaiLoy?");

        jButton23.setText("Enviar mis datos");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jLabel73.setText("Clickea en el botón de abajo, introduce tus datos, y un asesor se encargará de comunicarse contigo!");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(542, 542, 542)
                        .addComponent(jButton23))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(496, 496, 496)
                        .addComponent(jLabel72))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel73)))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel72)
                .addGap(36, 36, 36)
                .addComponent(jLabel73)
                .addGap(38, 38, 38)
                .addComponent(jButton23)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Trabaja con nosotros", jPanel11);

        jPanel12.setBackground(new java.awt.Color(1, 163, 104));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1199, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pedidos", jPanel12);

        jPanel8.setBackground(new java.awt.Color(1, 163, 104));

        TXTAPELLIDO.setBackground(new java.awt.Color(1, 163, 104));
        TXTAPELLIDO.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        TXTAPELLIDO.setForeground(new java.awt.Color(255, 221, 36));
        TXTAPELLIDO.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 221, 36))); // NOI18N
        TXTAPELLIDO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTAPELLIDOKeyPressed(evt);
            }
        });

        TXTNombre.setBackground(new java.awt.Color(1, 163, 104));
        TXTNombre.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        TXTNombre.setForeground(new java.awt.Color(255, 221, 36));
        TXTNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 221, 36))); // NOI18N
        TXTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TXTNombreKeyPressed(evt);
            }
        });

        TXTDireccion.setBackground(new java.awt.Color(1, 163, 104));
        TXTDireccion.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        TXTDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 221, 36))); // NOI18N

        BTNRegistrar.setBackground(new java.awt.Color(255, 221, 36));
        BTNRegistrar.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        BTNRegistrar.setText("Registrar Pedido");
        BTNRegistrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTNRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegistrarActionPerformed(evt);
            }
        });

        OBJDistrito.setBackground(new java.awt.Color(255, 221, 36));
        OBJDistrito.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        OBJDistrito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San Borja", "San Luis", "Lince", "Miraflores" }));
        OBJDistrito.setBorder(javax.swing.BorderFactory.createTitledBorder("Distrito"));

        jLabel62.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel62.setText("Precio Total: ");

        TFPrecioT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPrecioTActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel63.setText("IGV: 18%  ");

        TFPrecioF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPrecioF1ActionPerformed(evt);
            }
        });

        Tabla1.setBackground(new java.awt.Color(1, 163, 104));
        Tabla1.setForeground(new java.awt.Color(255, 221, 36));
        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(Tabla1);
        if (Tabla1.getColumnModel().getColumnCount() > 0) {
            Tabla1.getColumnModel().getColumn(3).setResizable(false);
        }

        BTNRestar2.setBackground(new java.awt.Color(255, 51, 51));
        BTNRestar2.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        BTNRestar2.setForeground(new java.awt.Color(255, 255, 255));
        BTNRestar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/eliminard.png"))); // NOI18N
        BTNRestar2.setText("Limpiar Nombres");
        BTNRestar2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTNRestar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRestar2ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel64.setText("Total a pagar:");

        TFPrecioF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPrecioF2ActionPerformed(evt);
            }
        });

        BTNRestar4.setBackground(new java.awt.Color(255, 51, 51));
        BTNRestar4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        BTNRestar4.setForeground(new java.awt.Color(255, 255, 255));
        BTNRestar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/productoclear.png"))); // NOI18N
        BTNRestar4.setText("Limpiar Productos");
        BTNRestar4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTNRestar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRestar4ActionPerformed(evt);
            }
        });

        BTNRestar5.setBackground(new java.awt.Color(255, 51, 51));
        BTNRestar5.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        BTNRestar5.setForeground(new java.awt.Color(255, 255, 255));
        BTNRestar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/cleartotalboton.png"))); // NOI18N
        BTNRestar5.setText("Limpieza Total");
        BTNRestar5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTNRestar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRestar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TXTNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                            .addComponent(TXTAPELLIDO)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OBJDistrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXTDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addGap(18, 18, 18)
                        .addComponent(TFPrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel63)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFPrecioF1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel64)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TFPrecioF2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTNRestar2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNRestar5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNRestar4, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(BTNRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(BTNRestar5)
                        .addGap(13, 13, 13)
                        .addComponent(BTNRestar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNRestar4)
                        .addGap(17, 17, 17)
                        .addComponent(BTNRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addComponent(TXTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65))
                                    .addComponent(TXTAPELLIDO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OBJDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXTDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TFPrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TFPrecioF1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TFPrecioF2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField1)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
    this.setVisible(false);
        Index I = new Index();
        I.setVisible(true);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void BTNE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNE1ActionPerformed
PYC Electrodomestico = new Productos("Elec01", "Laptop","Electrodomestico", 1200);
TEXT1.setText(Electrodomestico.mostrarCodigo());
TEXT2.setText(Electrodomestico.mostrarNombre());
TEXT3.setText(Electrodomestico.mostrarPrecio());
TEXT4.setText(Electrodomestico.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
                
        
        
        
        
        
        
        
        
        
        

//TXTProducto.append("\n"+Electrodomestico.mostrarCodigo()+"		"+Electrodomestico.mostrarNombre()+"		"+Electrodomestico.mostrarCategoria()+"	"+Electrodomestico.mostrarPrecio()+"\n");

    }//GEN-LAST:event_BTNE1ActionPerformed

    private void BTNE1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNE1MouseClicked
      
    }//GEN-LAST:event_BTNE1MouseClicked
int i = 1;
    private void BTNRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistrarActionPerformed

Calendar c1 = Calendar.getInstance();

String dia = Integer.toString(c1.get(Calendar.DATE));
String mes = Integer.toString(c1.get(Calendar.MONTH) + 1);
String annio = Integer.toString(c1.get(Calendar.YEAR));
double threedigits = 100 + Math.random() * 900;
double threedigits2 = 100 + Math.random() * 900;
String codboleta = Integer.toString((int) threedigits);
String codcliente = Integer.toString((int) threedigits2);
String columns = Integer.toString(columnas);
        

       TXTBoleta.append("\n==================================================\n"+
               "                           • TaiLoy | Más que útiles •"+"\n"+
               
               "Sr(es):     "+TXTNombre.getText()+"   "+TXTAPELLIDO.getText()+"\n"+
               "Código de boleta:   " + "B"+ codboleta + "\n"+
               "Código de Cliente:   "+ "C" + codcliente + "\n"+
               "Cantidad de Productos:   " + columns + "\n" +
               "Dirección:   Sede "+OBJDistrito.getSelectedItem().toString()+" - "+TXTDireccion.getText()+"\n"+
               "Fecha de emisión:  " + dia + "/"+ mes + "/" + annio + "\n"+
               "Total:   " + TFPrecioT.getText() + "\n" + 
               "IGV:   " + TFPrecioF1.getText() + "\n" +
               "Total a pagar:   "+TFPrecioF2.getText()+
               "\n==================================================\n");
       
        numpedido.setValor(i);
       int a = numpedido.getValor();
       String cadenapedido;
       
       
       
    cadenapedido = Integer.toString(a);
       dtm2.addRow(new Object[]{
    cadenapedido, columns, TFPrecioF2.getText()});
       i++;
    }//GEN-LAST:event_BTNRegistrarActionPerformed

    private void BTNE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNE2ActionPerformed
PYC Electrodomestico = new Productos("Elec02", "Televisor LG","Electrodomestico", 600);
TEXT1.setText(Electrodomestico.mostrarCodigo());
TEXT2.setText(Electrodomestico.mostrarNombre());
TEXT3.setText(Electrodomestico.mostrarPrecio());
TEXT4.setText(Electrodomestico.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_BTNE2ActionPerformed

    private void BTNE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNE3ActionPerformed
PYC Electrodomestico = new Productos("Elec03", "Laptop ASUS","Electrodomestico", 2000);
TEXT1.setText(Electrodomestico.mostrarCodigo());
TEXT2.setText(Electrodomestico.mostrarNombre());
TEXT3.setText(Electrodomestico.mostrarPrecio());
TEXT4.setText(Electrodomestico.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_BTNE3ActionPerformed

    private void BTNE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNE4ActionPerformed
       PYC Electrodomestico = new Productos("Elec04", "Microondas","Electrodomestico", 300);
TEXT1.setText(Electrodomestico.mostrarCodigo());
TEXT2.setText(Electrodomestico.mostrarNombre());
TEXT3.setText(Electrodomestico.mostrarPrecio());
TEXT4.setText(Electrodomestico.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_BTNE4ActionPerformed

    private void BTNE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNE5ActionPerformed
     PYC Electrodomestico = new Productos("Elec05", "Refrig. LG","Electrodomestico", 800);
TEXT1.setText(Electrodomestico.mostrarCodigo());
TEXT2.setText(Electrodomestico.mostrarNombre());
TEXT3.setText(Electrodomestico.mostrarPrecio());
TEXT4.setText(Electrodomestico.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_BTNE5ActionPerformed

    private void TFPrecioTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPrecioTActionPerformed
      TFPrecioT.getText();
                
            
       
    }//GEN-LAST:event_TFPrecioTActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    PYC Util = new Productos("Esco01", "Borrador","Útiles", 1.5);
TEXT1.setText(Util.mostrarCodigo());
TEXT2.setText(Util.mostrarNombre());
TEXT3.setText(Util.mostrarPrecio());
TEXT4.setText(Util.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
           PYC Util = new Productos("Esco02", "Goma","Útiles", 5);
TEXT1.setText(Util.mostrarCodigo());
TEXT2.setText(Util.mostrarNombre());
TEXT3.setText(Util.mostrarPrecio());
TEXT4.setText(Util.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
       PYC Util = new Productos("Esco03", "Tajador","Útiles", 2.3);
TEXT1.setText(Util.mostrarCodigo());
TEXT2.setText(Util.mostrarNombre());
TEXT3.setText(Util.mostrarPrecio());
TEXT4.setText(Util.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       PYC Util = new Productos("Esco04", "LiquidP.","Útiles", 2);
TEXT1.setText(Util.mostrarCodigo());
TEXT2.setText(Util.mostrarNombre());
TEXT3.setText(Util.mostrarPrecio());
TEXT4.setText(Util.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
       PYC Util = new Productos("Esco05", "Pack-Regla","Útiles", 10);
TEXT1.setText(Util.mostrarCodigo());
TEXT2.setText(Util.mostrarNombre());
TEXT3.setText(Util.mostrarPrecio());
TEXT4.setText(Util.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       PYC Util = new Productos("Esco06", "Pack-Colores","Útiles", 12);
TEXT1.setText(Util.mostrarCodigo());
TEXT2.setText(Util.mostrarNombre());
TEXT3.setText(Util.mostrarPrecio());
TEXT4.setText(Util.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
             PYC Util = new Productos("Esco07", "Tripack-Lapiz","Útiles", 3);
TEXT1.setText(Util.mostrarCodigo());
TEXT2.setText(Util.mostrarNombre());
TEXT3.setText(Util.mostrarPrecio());
TEXT4.setText(Util.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
            PYC Util = new Productos("Esco08", "Tijera","Útiles", 2.5);
TEXT1.setText(Util.mostrarCodigo());
TEXT2.setText(Util.mostrarNombre());
TEXT3.setText(Util.mostrarPrecio());
TEXT4.setText(Util.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
             PYC Util = new Productos("Esco09", "Pack-Borrador","Útiles", 4);
TEXT1.setText(Util.mostrarCodigo());
TEXT2.setText(Util.mostrarNombre());
TEXT3.setText(Util.mostrarPrecio());
TEXT4.setText(Util.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       PYC Util = new Productos("Esco10", "Pack-Lapicero","Útiles", 5);
TEXT1.setText(Util.mostrarCodigo());
TEXT2.setText(Util.mostrarNombre());
TEXT3.setText(Util.mostrarPrecio());
TEXT4.setText(Util.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            PYC Juguete = new Productos("Jugt01", "Max-Steel","Juguete", 18);
TEXT1.setText(Juguete.mostrarCodigo());
TEXT2.setText(Juguete.mostrarNombre());
TEXT3.setText(Juguete.mostrarPrecio());
TEXT4.setText(Juguete.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       PYC Juguete = new Productos("Jugt02", "Veguetta-SS4","Juguete", 17);
TEXT1.setText(Juguete.mostrarCodigo());
TEXT2.setText(Juguete.mostrarNombre());
TEXT3.setText(Juguete.mostrarPrecio());
TEXT4.setText(Juguete.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       PYC Juguete = new Productos("Jugt03", "Goku-SSGOD","Juguete", 21);
TEXT1.setText(Juguete.mostrarCodigo());
TEXT2.setText(Juguete.mostrarNombre());
TEXT3.setText(Juguete.mostrarPrecio());
TEXT4.setText(Juguete.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           PYC Juguete = new Productos("Jugt04", "Baby-Yoda","Juguete", 25);
TEXT1.setText(Juguete.mostrarCodigo());
TEXT2.setText(Juguete.mostrarNombre());
TEXT3.setText(Juguete.mostrarPrecio());
TEXT4.setText(Juguete.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
              PYC Juguete = new Productos("Jugt05", "Baby-Tiguer","Juguete", 15);
TEXT1.setText(Juguete.mostrarCodigo());
TEXT2.setText(Juguete.mostrarNombre());
TEXT3.setText(Juguete.mostrarPrecio());
TEXT4.setText(Juguete.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
               PYC Juguete = new Productos("Jugt06", "Marvel-Thanos","Juguete", 20);
TEXT1.setText(Juguete.mostrarCodigo());
TEXT2.setText(Juguete.mostrarNombre());
TEXT3.setText(Juguete.mostrarPrecio());
TEXT4.setText(Juguete.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
             PYC Juguete = new Productos("Jugt07", "Yogurt-Light","Juguete", 12);
TEXT1.setText(Juguete.mostrarCodigo());
TEXT2.setText(Juguete.mostrarNombre());
TEXT3.setText(Juguete.mostrarPrecio());
TEXT4.setText(Juguete.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
              PYC Juguete = new Productos("Jugt08", "Sonic-Sega","Juguete", 16);
TEXT1.setText(Juguete.mostrarCodigo());
TEXT2.setText(Juguete.mostrarNombre());
TEXT3.setText(Juguete.mostrarPrecio());
TEXT4.setText(Juguete.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
             PYC Juguete = new Productos("Jugt09", "Tripack-Alien","Juguete", 10);
TEXT1.setText(Juguete.mostrarCodigo());
TEXT2.setText(Juguete.mostrarNombre());
TEXT3.setText(Juguete.mostrarPrecio());
TEXT4.setText(Juguete.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
             PYC Juguete = new Productos("Jugt10", "El-Magias","Juguete", 26);
TEXT1.setText(Juguete.mostrarCodigo());
TEXT2.setText(Juguete.mostrarNombre());
TEXT3.setText(Juguete.mostrarPrecio());
TEXT4.setText(Juguete.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void BTNE6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNE6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNE6MouseClicked

    private void BTNE6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNE6ActionPerformed
    PYC Electrodomestico = new Productos("Elec06", "Refrigerador","Electrodomestico", 750);
TEXT1.setText(Electrodomestico.mostrarCodigo());
TEXT2.setText(Electrodomestico.mostrarNombre());
TEXT3.setText(Electrodomestico.mostrarPrecio());
TEXT4.setText(Electrodomestico.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_BTNE6ActionPerformed

    private void BTNE7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNE7MouseClicked
PYC Electrodomestico = new Productos("Elec07", "Cocina","Electrodomestico", 450);
TEXT1.setText(Electrodomestico.mostrarCodigo());
TEXT2.setText(Electrodomestico.mostrarNombre());
TEXT3.setText(Electrodomestico.mostrarPrecio());
TEXT4.setText(Electrodomestico.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_BTNE7MouseClicked

    private void BTNE7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNE7ActionPerformed

    }//GEN-LAST:event_BTNE7ActionPerformed

    private void BTNE8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNE8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNE8MouseClicked

    private void BTNE8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNE8ActionPerformed
PYC Electrodomestico = new Productos("Elec08", "Ventilador","Electrodomestico", 120);
TEXT1.setText(Electrodomestico.mostrarCodigo());
TEXT2.setText(Electrodomestico.mostrarNombre());
TEXT3.setText(Electrodomestico.mostrarPrecio());
TEXT4.setText(Electrodomestico.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_BTNE8ActionPerformed

    private void BTNE9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNE9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNE9MouseClicked

    private void BTNE9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNE9ActionPerformed
PYC Electrodomestico = new Productos("Elec09", "Tostador","Electrodomestico", 185);
TEXT1.setText(Electrodomestico.mostrarCodigo());
TEXT2.setText(Electrodomestico.mostrarNombre());
TEXT3.setText(Electrodomestico.mostrarPrecio());
TEXT4.setText(Electrodomestico.mostrarCategoria());
agregar();
sumar();
igv();
totalpagar();
    }//GEN-LAST:event_BTNE9ActionPerformed

    private void BTNRestar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRestar2ActionPerformed
        TXTNombre.setText("");
        TXTAPELLIDO.setText("");
        TXTDireccion.setText("");
        //LIMPIAR NOMBRES UNICAMENTE
    }//GEN-LAST:event_BTNRestar2ActionPerformed

    private void TFPrecioF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPrecioF1ActionPerformed
     
    }//GEN-LAST:event_TFPrecioF1ActionPerformed

    private void TFPrecioF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPrecioF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFPrecioF2ActionPerformed

    private void jButton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21MouseClicked

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22MouseClicked

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
     this.setVisible(false);
        Index I = new Index();
        I.setVisible(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void BTNRestar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRestar3ActionPerformed
TXTBoleta.setText("");
    }//GEN-LAST:event_BTNRestar3ActionPerformed

    private void BTNRestar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRestar4ActionPerformed
        limpiar(); //REALIZA UNA LIMPIEZA EN SELECCION DE LAS TABLAS, TRY CATCH (SELECCIONANDO)
    }//GEN-LAST:event_BTNRestar4ActionPerformed

    private void BTNRestar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRestar5ActionPerformed
        TEXT1.setText("");
        TEXT2.setText("");
        TEXT3.setText("");
        TEXT4.setText("");
        TFPrecioT.setText("");
        TFPrecioF1.setText("");
        TFPrecioF2.setText("");
        TXTNombre.setText("");
        TXTAPELLIDO.setText("");
        TXTDireccion.setText("");

        limpiar2(); //REALIZA UNA LIMPIEZA TOTAL
    }//GEN-LAST:event_BTNRestar5ActionPerformed

    private void TXTNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTNombreKeyPressed
        char c = evt.getKeyChar();
                if((c>='0' && c<='9') ){
                        TXTNombre.setEditable(false);
                    }else if(c=='%'){
                        TXTNombre.setEditable(false);
                        
                    }else{
                    TXTNombre.setEditable(true);

                    if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||  evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                        TXTNombre.setEditable(true);
                    }else{
                        TXTNombre.setEditable(true);
                    }}
    }//GEN-LAST:event_TXTNombreKeyPressed

    private void TXTAPELLIDOKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTAPELLIDOKeyPressed
        char c = evt.getKeyChar();
                if((c>='0' && c<='9') ){
                        TXTAPELLIDO.setEditable(false);
                    }else if(c=='%'){
                        TXTAPELLIDO.setEditable(false);
                        
                    }else{
                    TXTAPELLIDO.setEditable(true);

                    if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE ||  evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                        TXTAPELLIDO.setEditable(true);
                    }else{
                        TXTAPELLIDO.setEditable(true);
                    }}
    }//GEN-LAST:event_TXTAPELLIDOKeyPressed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
this.setVisible(false);
        CV I = new CV();
        I.setVisible(true);        
    }//GEN-LAST:event_jButton23ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tailoy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNE1;
    private javax.swing.JButton BTNE2;
    private javax.swing.JButton BTNE3;
    private javax.swing.JButton BTNE4;
    private javax.swing.JButton BTNE5;
    private javax.swing.JButton BTNE6;
    private javax.swing.JButton BTNE7;
    private javax.swing.JButton BTNE8;
    private javax.swing.JButton BTNE9;
    private javax.swing.JButton BTNRegistrar;
    private javax.swing.JButton BTNRestar2;
    private javax.swing.JButton BTNRestar3;
    private javax.swing.JButton BTNRestar4;
    private javax.swing.JButton BTNRestar5;
    private javax.swing.JComboBox<String> OBJDistrito;
    private javax.swing.JTextField TEXT1;
    private javax.swing.JTextField TEXT2;
    private javax.swing.JTextField TEXT3;
    private javax.swing.JTextField TEXT4;
    private javax.swing.JTextField TFPrecioF1;
    private javax.swing.JTextField TFPrecioF2;
    private javax.swing.JTextField TFPrecioT;
    private javax.swing.JTextField TXTAPELLIDO;
    private javax.swing.JTextArea TXTBoleta;
    private javax.swing.JTextField TXTDireccion;
    private javax.swing.JTextField TXTNombre;
    private javax.swing.JTable Tabla1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables


}
