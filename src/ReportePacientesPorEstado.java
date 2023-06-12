


import com.mysql.jdbc.Connection;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javafx.stage.WindowEvent;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
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
public class ReportePacientesPorEstado extends javax.swing.JFrame {

    UsuarioYClaveBD usuarioyclavebd = new UsuarioYClaveBD();
     
                                          //si no fuera static se pondria la palabra verde usuarioyclavebd
     public static final  String URL = UsuarioYClaveBD.getURL();
      public static final  String USERNAME = UsuarioYClaveBD.getUSERNAME();//usuario de la abse de datos
       public static final  String PASSWORD = UsuarioYClaveBD.getPASSWORD(); //clave de la abse de datos
       
       PreparedStatement ps;
           ResultSet rs; //variables para poder conectar a la BD
    public ReportePacientesPorEstado() {
         initComponents();

        
        
      //  Password.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
        try {//ESTO TIENE QUE VER CON LA CLASE FONDOSQING PARA COLOCAR IMAGEN DE FONDO
            FondoSwing fondo = new FondoSwing(ImageIO.read(new File("BD/Fondo.png")));

            JPanel panel = (JPanel) this.getContentPane();
            panel.setBorder(fondo);
        } catch (IOException ex) {
           
        }
        
MostrarPacientesPorFecha();
        diseño_Botones();
          
 int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
       int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    
      this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 550, 77); //Al dividir el «ancho» entre 2 estoy ubicándome en el centro de la pantalla (horizontalmente). Pero, esto haría que el lado izquierdo de nuestra ventana colinde con el centro, así que le restamos la mitad del tamaño que tenga nuestra ventana. Esto hará que horizontalmente se coloque la ventana en el centro. Lo mismo se aplica para las coordenadas verticales.
 //modifico el ancho y alto por defecto

         this.setResizable(false); //para que no modifiquen el ancho y no se agrande
        this.setLocationRelativeTo(this); // para que este en el centro de la pantalla
        //this.setTitle("xd");
       
        
       
        
    Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Lain.png"));//le coloco el icono a la aplicacion

        this.setIconImage(icono);

      //  this.setExtendedState(this.MAXIMIZED_BOTH); // para que inicie ocupando toda la pantalla
    }

    public void diseño_Botones(){
    
    }
    
    public void MostrarPacientesPorFecha(){
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonUrgenciaMenor = new javax.swing.JButton();
        BotonUrgencia = new javax.swing.JButton();
        BotonEmergencia = new javax.swing.JButton();
        BotonResucitacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BotonUrgenciaMenor.setBackground(new java.awt.Color(255, 255, 255));
        BotonUrgenciaMenor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonUrgenciaMenor.setText("Urgencia Menor");
        BotonUrgenciaMenor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonUrgenciaMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUrgenciaMenorActionPerformed(evt);
            }
        });

        BotonUrgencia.setBackground(new java.awt.Color(255, 255, 255));
        BotonUrgencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonUrgencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonUrgencia.setLabel("Urgencia");
        BotonUrgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUrgenciaActionPerformed(evt);
            }
        });

        BotonEmergencia.setBackground(new java.awt.Color(255, 255, 255));
        BotonEmergencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonEmergencia.setText("Emergencia");
        BotonEmergencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEmergenciaActionPerformed(evt);
            }
        });

        BotonResucitacion.setBackground(new java.awt.Color(255, 255, 255));
        BotonResucitacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonResucitacion.setText("Resucitacion");
        BotonResucitacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonResucitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResucitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonUrgenciaMenor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(BotonUrgencia)
                .addGap(36, 36, 36)
                .addComponent(BotonEmergencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonResucitacion)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonResucitacion)
                    .addComponent(BotonEmergencia)
                    .addComponent(BotonUrgencia)
                    .addComponent(BotonUrgenciaMenor))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonUrgenciaMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUrgenciaMenorActionPerformed
          try {
              int contadorColumnas = 1; //uno ya q empezare a escribir los pacientes en la 2da columna
              
            Connection con=null;
           con= getConection();
           com.mysql.jdbc.PreparedStatement ps;
          ResultSet res;
              ps= (com.mysql.jdbc.PreparedStatement) con.prepareStatement("SELECT * FROM paciente");
           res= ps.executeQuery();
           
           //aqui creo el Excel
               Workbook book = new  XSSFWorkbook();
               Sheet sheet = book.createSheet("Pacientes");//aqui creo una hoja y le doy un nombre
               FileOutputStream fileout = new FileOutputStream("Pacientes-UrgenciaMenor.xlsx");//aqui CREO el archivo excel
               
             
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
       //solo a los pacientes con urgencia menor
             if ("Urgencia menor".equals(res.getString(5))){
             celda = fila.createCell(0);//sera la primera fila
                    celda.setCellValue(res.getLong(1));//aqui busco en la posicion 1 el ID y lo escribo en el excel
             }
                     
                    
//sheet.autoSizeColumn(0);//para que el largo se automatice segun el texto


 
//solo contare a los de urgencia menor
  if ("Urgencia menor".equals(res.getString(5))){

              celda = fila.getCell(0);//cojo la celda del ID que es la primera
         
          XSSFCellStyle style1 = (XSSFCellStyle) book.createCellStyle(); 
          style1.setFillForegroundColor(HSSFColor.GREEN.index);//y le pongo color 
          style1.setFillPattern(CellStyle.SOLID_FOREGROUND); 
                 style1.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style1.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style1);//y se lo asigno a la celda
 
 
 
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
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error desconocido</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon2);
        }
    }//GEN-LAST:event_BotonUrgenciaMenorActionPerformed

    private void BotonUrgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUrgenciaActionPerformed
        try {
              int contadorColumnas = 1; //uno ya q empezare a escribir los pacientes en la 2da columna
              
            Connection con=null;
           con= getConection();
           com.mysql.jdbc.PreparedStatement ps;
          ResultSet res;
              ps= (com.mysql.jdbc.PreparedStatement) con.prepareStatement("SELECT * FROM paciente");
           res= ps.executeQuery();
           
           //aqui creo el Excel
               Workbook book = new  XSSFWorkbook();
               Sheet sheet = book.createSheet("Pacientes");//aqui creo una hoja y le doy un nombre
               FileOutputStream fileout = new FileOutputStream("Pacientes-Urgencia.xlsx");//aqui CREO el archivo excel
               
             
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
       //solo a los pacientes con urgencia menor
             if ("Urgencia".equals(res.getString(5))){
             celda = fila.createCell(0);//sera la primera fila
                    celda.setCellValue(res.getLong(1));//aqui busco en la posicion 1 el ID y lo escribo en el excel
             }
                     
                    
//sheet.autoSizeColumn(0);//para que el largo se automatice segun el texto


 
//solo contare a los de urgencia menor
  if ("Urgencia".equals(res.getString(5))){

              celda = fila.getCell(0);//cojo la celda del ID que es la primera
         
          XSSFCellStyle style1 = (XSSFCellStyle) book.createCellStyle(); 
          style1.setFillForegroundColor(HSSFColor.YELLOW.index);//y le pongo color 
          style1.setFillPattern(CellStyle.SOLID_FOREGROUND); 
                 style1.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style1.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style1);//y se lo asigno a la celda
 
 
 
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
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error desconocido</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon2);
        }
    }//GEN-LAST:event_BotonUrgenciaActionPerformed

    private void BotonEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEmergenciaActionPerformed
       try {
              int contadorColumnas = 1; //uno ya q empezare a escribir los pacientes en la 2da columna
              
            Connection con=null;
           con= getConection();
           com.mysql.jdbc.PreparedStatement ps;
          ResultSet res;
              ps= (com.mysql.jdbc.PreparedStatement) con.prepareStatement("SELECT * FROM paciente");
           res= ps.executeQuery();
           
           //aqui creo el Excel
               Workbook book = new  XSSFWorkbook();
               Sheet sheet = book.createSheet("Pacientes");//aqui creo una hoja y le doy un nombre
               FileOutputStream fileout = new FileOutputStream("Pacientes-Emergencia.xlsx");//aqui CREO el archivo excel
               
             
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
       //solo a los pacientes con urgencia menor
             if ("Emergencia".equals(res.getString(5))){
             celda = fila.createCell(0);//sera la primera fila
                    celda.setCellValue(res.getLong(1));//aqui busco en la posicion 1 el ID y lo escribo en el excel
             }
                     
                    
//sheet.autoSizeColumn(0);//para que el largo se automatice segun el texto


 
//solo contare a los de urgencia menor
  if ("Emergencia".equals(res.getString(5))){

              celda = fila.getCell(0);//cojo la celda del ID que es la primera
         
          XSSFCellStyle style1 = (XSSFCellStyle) book.createCellStyle(); 
          style1.setFillForegroundColor(HSSFColor.ORANGE.index);//y le pongo color 
          style1.setFillPattern(CellStyle.SOLID_FOREGROUND); 
                 style1.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style1.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style1);//y se lo asigno a la celda
 
 
 
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
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error desconocido</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon2);
        }
    }//GEN-LAST:event_BotonEmergenciaActionPerformed

    private void BotonResucitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResucitacionActionPerformed
       try {
              int contadorColumnas = 1; //uno ya q empezare a escribir los pacientes en la 2da columna
              
            Connection con=null;
           con= getConection();
           com.mysql.jdbc.PreparedStatement ps;
          ResultSet res;
              ps= (com.mysql.jdbc.PreparedStatement) con.prepareStatement("SELECT * FROM paciente");
           res= ps.executeQuery();
           
           //aqui creo el Excel
               Workbook book = new  XSSFWorkbook();
               Sheet sheet = book.createSheet("Pacientes");//aqui creo una hoja y le doy un nombre
               FileOutputStream fileout = new FileOutputStream("Pacientes-Resucitacion.xlsx");//aqui CREO el archivo excel
               
             
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
       //solo a los pacientes con urgencia menor
             if ("Resucitacion".equals(res.getString(5))){
             celda = fila.createCell(0);//sera la primera fila
                    celda.setCellValue(res.getLong(1));//aqui busco en la posicion 1 el ID y lo escribo en el excel
             }
                     
                    
//sheet.autoSizeColumn(0);//para que el largo se automatice segun el texto


 
//solo contare a los de urgencia menor
  if ("Resucitacion".equals(res.getString(5))){

              celda = fila.getCell(0);//cojo la celda del ID que es la primera
         
          XSSFCellStyle style1 = (XSSFCellStyle) book.createCellStyle(); 
          style1.setFillForegroundColor(HSSFColor.RED.index);//y le pongo color 
          style1.setFillPattern(CellStyle.SOLID_FOREGROUND); 
                 style1.setBorderBottom(XSSFCellStyle.BORDER_THIN);//le doy un borde
style1.setBorderRight(XSSFCellStyle.BORDER_THIN);
 celda.setCellStyle(style1);//y se lo asigno a la celda
 
 
 
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
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error desconocido</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon2);
        }
    }//GEN-LAST:event_BotonResucitacionActionPerformed

    
     
    
 

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
            java.util.logging.Logger.getLogger(ReportePacientesPorEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportePacientesPorEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportePacientesPorEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportePacientesPorEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportePacientesPorEstado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEmergencia;
    private javax.swing.JButton BotonResucitacion;
    private javax.swing.JButton BotonUrgencia;
    private javax.swing.JButton BotonUrgenciaMenor;
    // End of variables declaration//GEN-END:variables
}
