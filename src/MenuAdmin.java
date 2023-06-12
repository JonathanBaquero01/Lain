


import com.mysql.jdbc.Connection;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jona
 */
public class MenuAdmin extends javax.swing.JFrame {

  
 UsuarioYClaveBD usuarioyclavebd = new UsuarioYClaveBD();
     
                                          //si no fuera static se pondria la palabra verde usuarioyclavebd
     public static final  String URL = UsuarioYClaveBD.getURL();
      public static final  String USERNAME = UsuarioYClaveBD.getUSERNAME();//usuario de la abse de datos
       public static final  String PASSWORD = UsuarioYClaveBD.getPASSWORD(); //clave de la abse de datos
       
       PreparedStatement ps;
       ResultSet rs; //variables para poder conectar a la BD
    public MenuAdmin() {
          initComponents();

        
        
      //  Password.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
        try {//ESTO TIENE QUE VER CON LA CLASE FONDOSQING PARA COLOCAR IMAGEN DE FONDO
            FondoSwing fondo = new FondoSwing(ImageIO.read(new File("BD/Fondo.png")));

            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
           
        }

        diseño_Botones();
 int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
       int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    
      this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 650, 850); //Al dividir el «ancho» entre 2 estoy ubicándome en el centro de la pantalla (horizontalmente). Pero, esto haría que el lado izquierdo de nuestra ventana colinde con el centro, así que le restamos la mitad del tamaño que tenga nuestra ventana. Esto hará que horizontalmente se coloque la ventana en el centro. Lo mismo se aplica para las coordenadas verticales.
 //modifico el ancho y alto por defecto

         this.setResizable(false); //para que no modifiquen el ancho y no se agrande
        this.setLocationRelativeTo(this); // para que este en el centro de la pantalla
        //this.setTitle("xd");
       
        
       
        
    Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Lain.png"));//le coloco el icono a la aplicacion

        this.setIconImage(icono);

      //  this.setExtendedState(this.MAXIMIZED_BOTH); // para que inicie ocupando toda la pantalla
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAgregarMedico = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        BotonInicio = new javax.swing.JButton();
        GenerarExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(650, 850));

        BotonAgregarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarMedico.png"))); // NOI18N
        BotonAgregarMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAgregarMedico.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AgregarMedico2.png"))); // NOI18N
        BotonAgregarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarMedicoActionPerformed(evt);
            }
        });

        BotonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png"))); // NOI18N
        BotonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras2.png"))); // NOI18N
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png"))); // NOI18N
        BotonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio2.png"))); // NOI18N
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        GenerarExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Excel.png"))); // NOI18N
        GenerarExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GenerarExcel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Excel2.png"))); // NOI18N
        GenerarExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonAgregarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(GenerarExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(BotonAgregarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(GenerarExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarMedicoActionPerformed
          AgregarMedico agregarmedico = new AgregarMedico();//lo dirijo al loginadmin
        agregarmedico.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        agregarmedico.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        dispose();//para cerrar la ventana actual
    }//GEN-LAST:event_BotonAgregarMedicoActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        Menu menu = new Menu();//lo dirijo al loginadmin
        menu.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        menu.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        dispose();//para cerrar la ventana actual
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        Login login = new Login();//lo dirijo al loginadmin
        login.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        login.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        dispose();//para cerrar la ventana actual
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void GenerarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarExcelActionPerformed
 int contadorColumnas = 1; //uno ya q empezare a escribir los pacientes en la 2da columna
     AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Realizado.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/ExcelAviso.png")); //para poner icono al aviso
              //esto es pa crear un Joptionpane personalizado
        String [] botones = { "Todos los pacientes", "Por estado" };
 int variable = JOptionPane.showOptionDialog (null,  "<html><b><span style=\"font-size:1.3em\">Generar reporte en Excel</b>", "Excel", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, icon, botones, botones[0]);
        if(variable==0){//si es 0 es q elijio todos los pacientes
        
        try {
            Connection con=null;
           con= getConection();
           com.mysql.jdbc.PreparedStatement ps;
          ResultSet res;
              ps= (com.mysql.jdbc.PreparedStatement) con.prepareStatement("SELECT * FROM paciente");
           res= ps.executeQuery();
           
           //aqui creo el Excel
               Workbook book = new  XSSFWorkbook();
               Sheet sheet = book.createSheet("Pacientes");//aqui creo una hoja y le doy un nombre
               FileOutputStream fileout = new FileOutputStream("Pacientes.xlsx");//aqui CREO el archivo excel
               
             
            XSSFRow fila = (XSSFRow) sheet.getRow(0);//numero de filas filas
             fila = (XSSFRow) sheet.createRow(0);//esta sera la fila a escribir, aqui la creo
             
             
  
//ESTO ES PARA CAMBIAR EL TIPO DE LETRA, PONDRE UNA EN NEGRILLA, Y CAMBIAR SU TAMAÑO Y COLOR
 XSSFFont font = (XSSFFont) book.createFont();
font.setFontHeightInPoints((short) 14);//TAMAÑO
font.setBoldweight(Font.BOLDWEIGHT_BOLD);//FUENTE
        
XSSFCellStyle style = (XSSFCellStyle) book.createCellStyle();//CREO EL ESTY¡ILO
 style.setFillForegroundColor(HSSFColor.AQUA.index);//Y LE PONGO UN COLOR
          style.setFillPattern(CellStyle.SOLID_FOREGROUND); 

      style.setFont(font);


              XSSFCell celda = fila.createCell(0);//sera la primera fila
                    celda.setCellValue("ID");//aqui pongo que sera la columna de ID y asi con las q sigen
  sheet.setColumnWidth(0, 3000);//numero columna , tamaño de celda
   celda.setCellStyle(style);//LE ASIGNO EL ESTILO
style.setBorderBottom(XSSFCellStyle.BORDER_THIN);//para generar bordes, border_thin es borde delgado
style.setBorderRight(XSSFCellStyle.BORDER_THIN);
//sheet.autoSizeColumn(0);//para que el largo se automatice segun el texto

                    celda = fila.createCell(1);//la segunda del excelsera para guardar el nombre 
                    celda.setCellValue("Nombre");
  celda.setCellStyle(style);
  sheet.setColumnWidth(1, 8000);
  
                    celda = fila.createCell(2);
                    celda.setCellValue("Fecha Nacimiento");                   
  celda.setCellStyle(style);
   sheet.setColumnWidth(2, 5500);

                    celda = fila.createCell(3);
                    celda.setCellValue("Nacionalidad");
                      celda.setCellStyle(style);
                       sheet.setColumnWidth(3, 4500);
                    
                    celda = fila.createCell(4);
                    celda.setCellValue("Genero");
                      celda.setCellStyle(style);
                    
                         celda = fila.createCell(5);
                    celda.setCellValue("Correo");
                      celda.setCellStyle(style);
                       sheet.setColumnWidth(5, 8000);
                    
                         celda = fila.createCell(6);
                    celda.setCellValue("Celular");
                      celda.setCellStyle(style);
                      sheet.setColumnWidth(6, 4000);
                    
           while(res.next()){//recorrera cada columna de la tabla
               //AHORA AGREGAREMOS LOS PACIENTES DE MIERDA AL EXCEL :V
  fila = (XSSFRow) sheet.getRow(contadorColumnas);//numero de filas filas
             fila = (XSSFRow) sheet.createRow(contadorColumnas);//esta sera la fila a escribir, aqui la creo
       
                     celda = fila.createCell(0);//sera la primera fila
                    celda.setCellValue(res.getLong(1));//aqui busco en la posicion 1 el ID y lo escribo en el excel
                    
//sheet.autoSizeColumn(0);//para que el largo se automatice segun el texto

 if("Resucitacion".equals(res.getString(5))){//si el estado de enfermedad es igual a tanto... le pondre un color al ID
     
              celda = fila.getCell(0);//cojo la celda del ID que es la primera
         
          XSSFCellStyle style1 = (XSSFCellStyle) book.createCellStyle(); 
          style1.setFillForegroundColor(HSSFColor.RED.index);//y le pongo color 
          style1.setFillPattern(CellStyle.SOLID_FOREGROUND); 
                
style1.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style1.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style1);//y se lo asigno a la celda
           }
 else if ("Emergencia".equals(res.getString(5))){
 
              celda = fila.getCell(0);//cojo la celda del ID que es la primera
         
          XSSFCellStyle style1 = (XSSFCellStyle) book.createCellStyle(); 
          style1.setFillForegroundColor(HSSFColor.ORANGE.index);//y le pongo color 
          style1.setFillPattern(CellStyle.SOLID_FOREGROUND); 
                style1.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style1.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style1);//y se lo asigno a la celda
 }
 else if ("Urgencia".equals(res.getString(5))){

              celda = fila.getCell(0);//cojo la celda del ID que es la primera
         
          XSSFCellStyle style1 = (XSSFCellStyle) book.createCellStyle(); 
          style1.setFillForegroundColor(HSSFColor.YELLOW.index);//y le pongo color 
          style1.setFillPattern(CellStyle.SOLID_FOREGROUND); 
                style1.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style1.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style1);//y se lo asigno a la celda
 }
 else if ("Urgencia menor".equals(res.getString(5))){

              celda = fila.getCell(0);//cojo la celda del ID que es la primera
         
          XSSFCellStyle style1 = (XSSFCellStyle) book.createCellStyle(); 
          style1.setFillForegroundColor(HSSFColor.GREEN.index);//y le pongo color 
          style1.setFillPattern(CellStyle.SOLID_FOREGROUND); 
                 style1.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style1.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style1);//y se lo asigno a la celda
 }


 XSSFCellStyle style3 = (XSSFCellStyle) book.createCellStyle();//creo un nuevo estilo para los demas bordes
 
                    celda = fila.createCell(1);//la segunda del excelsera para guardar el nombre 
                    celda.setCellValue(res.getString(2));
                   
  style3.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style3.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style3);//y se lo asigno a la celda
  
                    celda = fila.createCell(2);
                    celda.setCellValue(res.getString(3));                   
   style3.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style3.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style3);//y se lo asigno a la celda
   

                    celda = fila.createCell(3);
                    celda.setCellValue(res.getString(4));
             style3.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style3.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style3);//y se lo asigno a la celda
                      
                    
                    celda = fila.createCell(4);
                    celda.setCellValue(res.getString(6));
                      style3.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style3.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style3);//y se lo asigno a la celda
                    
                         celda = fila.createCell(5);
                    celda.setCellValue(res.getString(7));
                      style3.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style3.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style3);//y se lo asigno a la celda
                     
                    
                         celda = fila.createCell(6);
                         try {
                   celda.setCellValue(Long.parseLong(res.getString(8)));//si esta nulo el espacio y lo convertira a long dara error
                        style3.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style3.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style3);//y se lo asigno a la celda
               } catch (Exception e) {
                    celda.setCellValue("");//y le aisgno un valor vacio
                        style3.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style3.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style3);//y se lo asigno a la celda
               }
                    
 
 
                     contadorColumnas++;//y le sumo 1 pa pasar a la sgte columna
          
           }
           
           
           
           book.write(fileout);//cierro el archivo
           fileout.close();

                                AudioClip  sonido4 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Realizado.wav"));
            sonido4.play();
          Icon icon4 = new ImageIcon(getClass().getResource("/Imagenes/chulito.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Excel generado</b>", "OK✔", JOptionPane.INFORMATION_MESSAGE, icon4); 
           
           
          
        } catch (Exception e) {
                   
        AudioClip    sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Error.wav"));
            sonido2.play();
            Icon icon2 = new ImageIcon(getClass().getResource("/Imagenes/X.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error desconocido</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        }
        else{//si no pues por estado y lo gio a la clase
         if("LAIN☢".equals(this.getTitle())){
        ReportePacientesPorEstado reportepacientesporestado = new ReportePacientesPorEstado();//lo dirijo al loginadmin
        reportepacientesporestado.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        reportepacientesporestado.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        
}
else{
  ReportePacientesPorEstado reportepacientesporestado = new ReportePacientesPorEstado();//lo dirijo al loginadmin
        reportepacientesporestado.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        reportepacientesporestado.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
       
}  
        }
    }//GEN-LAST:event_GenerarExcelActionPerformed
                                  

    /**
     * @param args the command line arguments
     */
    
    public void diseño_Botones(){
     BotonAgregarMedico.setOpaque(false);
        BotonAgregarMedico.setContentAreaFilled(false);
        BotonAgregarMedico.setBorderPainted(false);
        
        
        
        BotonAtras.setOpaque(false);
        BotonAtras.setContentAreaFilled(false);
        BotonAtras.setBorderPainted(false);
        
          BotonInicio.setOpaque(false);
        BotonInicio.setContentAreaFilled(false);
        BotonInicio.setBorderPainted(false);
        
         GenerarExcel.setOpaque(false);
        GenerarExcel.setContentAreaFilled(false);
        GenerarExcel.setBorderPainted(false);
        
    
    }
    
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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarMedico;
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton GenerarExcel;
    // End of variables declaration//GEN-END:variables
}
