

import com.mysql.jdbc.Connection;
import java.applet.AudioClip;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jona
 */
public class ReporteMedicinas extends javax.swing.JFrame {

     UsuarioYClaveBD usuarioyclavebd = new UsuarioYClaveBD();
     
                                          //si no fuera static se pondria la palabra verde usuarioyclavebd
     public static final  String URL = UsuarioYClaveBD.getURL();
      public static final  String USERNAME = UsuarioYClaveBD.getUSERNAME();//usuario de la abse de datos
       public static final  String PASSWORD = UsuarioYClaveBD.getPASSWORD(); //clave de la abse de datos
       
       PreparedStatement ps;
           ResultSet rs; //variables para poder conectar a la BD
    public ReporteMedicinas() {
         initComponents();

        
        
      //  Password.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
        try {//ESTO TIENE QUE VER CON LA CLASE FONDOSQING PARA COLOCAR IMAGEN DE FONDO
            FondoSwing fondo = new FondoSwing(ImageIO.read(new File("BD/Fondo.png")));

            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
           
        }
        
MostrarMedicinas();
        diseño_Botones();
          
 int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
       int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    
      this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 650, 450); //Al dividir el «ancho» entre 2 estoy ubicándome en el centro de la pantalla (horizontalmente). Pero, esto haría que el lado izquierdo de nuestra ventana colinde con el centro, así que le restamos la mitad del tamaño que tenga nuestra ventana. Esto hará que horizontalmente se coloque la ventana en el centro. Lo mismo se aplica para las coordenadas verticales.
 //modifico el ancho y alto por defecto

         this.setResizable(false); //para que no modifiquen el ancho y no se agrande
        this.setLocationRelativeTo(this); // para que este en el centro de la pantalla
        //this.setTitle("xd");
       
        
       
        
    Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Lain.png"));//le coloco el icono a la aplicacion

        this.setIconImage(icono);

      //  this.setExtendedState(this.MAXIMIZED_BOTH); // para que inicie ocupando toda la pantalla
    
    }

   public void diseño_Botones(){
   //aqui modifico la letra de los titulos de la tabla
        JTableHeader th;
        th = tabla.getTableHeader();
        Font fuente = new Font("Vijaya", Font.BOLD, 27);
        th.setFont(fuente);
   }
   
   public void MostrarMedicinas(){
     
        try {
            Connection con=null;
           con= getConection();
           com.mysql.jdbc.PreparedStatement ps;
          ResultSet res;
              ps= (com.mysql.jdbc.PreparedStatement) con.prepareStatement("SELECT * FROM medicina");
           res= ps.executeQuery();
           
           while(res.next()){//recorrera cada columna de la tabla
          // usuarioBD =res.getString(2);//el usuario esta en la posicion 2 , (se cuenta desde el 1 no desde el 0 )
            
          DefaultTableModel modelo = (DefaultTableModel) tabla.getModel(); //le digo que ya esta el modelo hecho, se lo doy
            tabla.setModel(modelo);
           Object[] filas_tabla = new Object[3]; //numero de filas  de la tabla -> ----
           
           filas_tabla[0] =res.getString(1);
           filas_tabla[1] =res.getString(2);
           filas_tabla[2] =res.getString(3);
          modelo.addRow(filas_tabla);
           }
         
          
        } catch (Exception e) {
                   
        AudioClip    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Error.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/X.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error desconocido</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
        }
   
   
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(650, 458));
        setPreferredSize(new java.awt.Dimension(650, 458));
        setSize(new java.awt.Dimension(650, 458));

        tabla.setFont(new java.awt.Font("Tempus Sans ITC", 1, 15)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Aplicacion", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(1).setPreferredWidth(30);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(300);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public static  Connection getConection(){
   
       Connection con = null;
       
       try {
           Class.forName("com.mysql.jdbc.Driver");
         con=  (Connection) DriverManager.getConnection(URL,USERNAME, PASSWORD);
          
       } catch (Exception e) {
           System.out.println(e);
       }
       return con;
   }
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
            java.util.logging.Logger.getLogger(ReporteMedicinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReporteMedicinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReporteMedicinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReporteMedicinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReporteMedicinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
