

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Menu extends javax.swing.JFrame {

        
               UsuarioYClaveBD usuarioyclavebd = new UsuarioYClaveBD();
     
                                          //si no fuera static se pondria la palabra verde usuarioyclavebd
     public static final  String URL = UsuarioYClaveBD.getURL();
      public static final  String USERNAME = UsuarioYClaveBD.getUSERNAME();//usuario de la abse de datos
       public static final  String PASSWORD = UsuarioYClaveBD.getPASSWORD(); //clave de la abse de datos
       
       java.sql.PreparedStatement ps;
       ResultSet rs; //variables para poder conectar a la BD
        
      
    public Menu() {
        initComponents();
 
        
      //  Password.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
        try {//ESTO TIENE QUE VER CON LA CLASE FONDOSQING PARA COLOCAR IMAGEN DE FONDO
            FondoSwing fondo = new FondoSwing(ImageIO.read(new File("BD/Fondo-Menu.jpg")));

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

        BotonAgregarpaciente = new javax.swing.JButton();
        BotonEditarpaciente = new javax.swing.JButton();
        BotonEliminarpaciente = new javax.swing.JButton();
        BotonCorreo = new javax.swing.JButton();
        BotonMedicinas = new javax.swing.JButton();
        BotonAdmin = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        BotonInicio = new javax.swing.JButton();
        BotonGrafico = new javax.swing.JButton();
        BotonCalculo = new javax.swing.JButton();
        BotonEnvivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(650, 850));

        BotonAgregarpaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregarpaciente.png"))); // NOI18N
        BotonAgregarpaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAgregarpaciente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Agregarpaciente2.png"))); // NOI18N
        BotonAgregarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarpacienteActionPerformed(evt);
            }
        });

        BotonEditarpaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EditarPaciente.png"))); // NOI18N
        BotonEditarpaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEditarpaciente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EditarPaciente2.png"))); // NOI18N
        BotonEditarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarpacienteActionPerformed(evt);
            }
        });

        BotonEliminarpaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarPaciente.png"))); // NOI18N
        BotonEliminarpaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEliminarpaciente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarPaciente2.png"))); // NOI18N
        BotonEliminarpaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarpacienteActionPerformed(evt);
            }
        });

        BotonCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Correo.png"))); // NOI18N
        BotonCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCorreo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Correo2.png"))); // NOI18N
        BotonCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCorreoActionPerformed(evt);
            }
        });

        BotonMedicinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Medicinas.png"))); // NOI18N
        BotonMedicinas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonMedicinas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Medicinas2.png"))); // NOI18N
        BotonMedicinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMedicinasActionPerformed(evt);
            }
        });

        BotonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin.png"))); // NOI18N
        BotonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAdmin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin2.png"))); // NOI18N
        BotonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAdminActionPerformed(evt);
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

        BotonGrafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Grafico.png"))); // NOI18N
        BotonGrafico.setContentAreaFilled(false);
        BotonGrafico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGrafico.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Grafico2.png"))); // NOI18N
        BotonGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGraficoActionPerformed(evt);
            }
        });

        BotonCalculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculo.png"))); // NOI18N
        BotonCalculo.setToolTipText("");
        BotonCalculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCalculo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calculo2.png"))); // NOI18N
        BotonCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalculoActionPerformed(evt);
            }
        });

        BotonEnvivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Señal.png"))); // NOI18N
        BotonEnvivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEnvivo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Señal2.png"))); // NOI18N
        BotonEnvivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEnvivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BotonGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(BotonCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonEnvivo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonAgregarpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonMedicinas, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonEditarpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonEliminarpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BotonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEnvivo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAgregarpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEditarpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonEliminarpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonMedicinas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotonCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEditarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarpacienteActionPerformed
         if("LAIN☢".equals(this.getTitle())){
        EditarPaciente editarpaciente = new EditarPaciente();//lo dirijo al loginadmin
        editarpaciente.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        editarpaciente.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        dispose();//para cerrar la ventana actual
}
else{
  EditarPaciente editarpaciente = new EditarPaciente();//lo dirijo al loginadmin
        editarpaciente.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        editarpaciente.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        dispose();//para cerrar la ventana actual
}
    }//GEN-LAST:event_BotonEditarpacienteActionPerformed

    private void BotonCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCorreoActionPerformed
        if("LAIN☢".equals(this.getTitle())){
        EnviarCorreo enviarcorreo = new EnviarCorreo();//lo dirijo al loginadmin
        enviarcorreo.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        enviarcorreo.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        dispose();//para cerrar la ventana actual
}
else{
  EnviarCorreo enviarcorreo = new EnviarCorreo();//lo dirijo al loginadmin
        enviarcorreo.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        enviarcorreo.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        dispose();//para cerrar la ventana actual
}
    }//GEN-LAST:event_BotonCorreoActionPerformed

    private void BotonMedicinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMedicinasActionPerformed
        if("LAIN☢".equals(this.getTitle())){
        AgregarMedicina agregarmedicina = new AgregarMedicina();//lo dirijo al loginadmin
        agregarmedicina.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        agregarmedicina.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        dispose();//para cerrar la ventana actual
}
else{
  AgregarMedicina agregarmedicina = new AgregarMedicina();//lo dirijo al loginadmin
        agregarmedicina.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        agregarmedicina.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        dispose();//para cerrar la ventana actual
}    
    }//GEN-LAST:event_BotonMedicinasActionPerformed

    private void BotonAgregarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarpacienteActionPerformed
if("LAIN☢".equals(this.getTitle())){
        AgregarPaciente agregarpaciente = new AgregarPaciente();//lo dirijo al loginadmin
        agregarpaciente.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        agregarpaciente.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        dispose();//para cerrar la ventana actual
}
else{
  AgregarPaciente agregarpaciente = new AgregarPaciente();//lo dirijo al loginadmin
        agregarpaciente.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        agregarpaciente.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        dispose();//para cerrar la ventana actual
}
    }//GEN-LAST:event_BotonAgregarpacienteActionPerformed

    private void BotonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAdminActionPerformed
         MenuAdmin menuadmin = new MenuAdmin();//lo dirijo al loginadmin
        menuadmin.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        menuadmin.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        dispose();//para cerrar la ventana actual
    }//GEN-LAST:event_BotonAdminActionPerformed

    private void BotonEliminarpacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarpacienteActionPerformed
                if("LAIN☢".equals(this.getTitle())){
        EliminarPaciente eliminarpaciente = new EliminarPaciente();//lo dirijo al loginadmin
        eliminarpaciente.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        eliminarpaciente.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        dispose();//para cerrar la ventana actual
}
else{
  EliminarPaciente eliminarpaciente = new EliminarPaciente();//lo dirijo al loginadmin
        eliminarpaciente.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        eliminarpaciente.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        dispose();//para cerrar la ventana actual
}
    }//GEN-LAST:event_BotonEliminarpacienteActionPerformed

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        Login login = new Login();//lo dirijo al loginadmin
        login.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        login.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        dispose();//para cerrar la ventana actual
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void BotonGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGraficoActionPerformed
  //libreria graficas: freechart
  
         int ContadorResucitacion=0;
 int ContadorEmergencia=0;//contadores de estados de los pacientes pa saber el total de pacientes con cada estado
         int ContadorUrgencia=0;
         int ContadorUrgenciaMenor=0;
         
         String Resucitacion="Resucitacion";//estas los nombres de las graficas
          String Emergencia="Emergencia";
           String Urgencia="Urgencia";
            String UrgenciaMenor="Urgencia Menor";
         
        try {
            Connection con=null;
           con= getConection();
           PreparedStatement ps;
          ResultSet res;
              ps= (PreparedStatement) con.prepareStatement("SELECT * FROM paciente");
           res= ps.executeQuery();
           
           while(res.next()){//recorrera cada columna de la tabla
               if("Resucitacion".equals(res.getString(5))){//si la posicion 5 de la tabla es tal... sumele uno a ese contador y asi con todos
               ContadorResucitacion++;
               }
               else if("Emergencia".equals(res.getString(5))){
               ContadorEmergencia++;
               }
               else if("Urgencia".equals(res.getString(5))){
             ContadorUrgencia++;
               }
          else if("Urgencia menor".equals(res.getString(5))){
               ContadorUrgenciaMenor++;
               }
           
        
          
           }
           
     
          
          
        } catch (Exception e) {
                   
        AudioClip    sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Error.wav"));
            sonido2.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/X.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error desconocido</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        
         
      
      
                 Resucitacion="Resucitacion";//estas los nombres de las graficas
           Emergencia="Emergencia";
            Urgencia="Urgencia";
             UrgenciaMenor="Urgencia Menor";
               
               
               // String vel = "Velocidad";
               // String millas = "Millas";
               // String usuarios = "Usuarios";
               // String seguro = "Seguridad";
                
                
                DefaultCategoryDataset dataset = new DefaultCategoryDataset();
 
                  dataset.addValue(ContadorResucitacion, Resucitacion, "Resucitacion");
                //dataset.addValue(3.0, Resucitacion, usuarios);
              //  dataset.addValue(5.0, Resucitacion, millas);
              //  dataset.addValue(5.0, Resucitacion, seguro);
                
                dataset.addValue(ContadorEmergencia, Emergencia, "Emergencia");
             //   dataset.addValue(3.0, Emergencia, usuarios);
               // dataset.addValue(5.0, Emergencia, millas);
               // dataset.addValue(5.0, Emergencia, seguro);
 
                dataset.addValue(ContadorUrgencia, Urgencia, "Urgencia");
              //  dataset.addValue(6.0, Urgencia, usuarios);
              //  dataset.addValue(10.0, Urgencia, millas); //aqui agrega  mas barras
               // dataset.addValue(4.0, Urgencia, seguro);
                
   dataset.addValue(ContadorUrgenciaMenor, UrgenciaMenor, "Urgencia Menor");
             //   dataset.addValue(6.0, UrgenciaMenor, usuarios);
             //   dataset.addValue(10.0, UrgenciaMenor, millas);
               // dataset.addValue(4.0, UrgenciaMenor, seguro);
           
 
                JFreeChart barChart = ChartFactory.createBarChart(
                                "Grafica de Barras",
                                "Categoria",
                                "Pacientes",
                                dataset,
                                PlotOrientation.VERTICAL, true, true, false);
 
                CategoryPlot plot = barChart.getCategoryPlot();
                
        plot.getRenderer().setSeriesPaint(0, new Color(150, 0, 0));
         plot.getRenderer().setSeriesPaint(1, new Color(239, 130, 26));
             plot.getRenderer().setSeriesPaint(2, new Color(220, 220, 0));//PARA ELEGIR LOS COLORES DE CADA BARRA
               plot.getRenderer().setSeriesPaint(3, new Color(0, 200, 0));
               
                ChartPanel panel = new ChartPanel(barChart);
                panel.setPreferredSize(new java.awt.Dimension(560, 367));
 
               
                   
               
                // Creamos la ventana
                JFrame ventana = new JFrame("Grafica");
                ventana.setVisible(true);
                ventana.setSize(800, 600);
                //ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                ventana.add(panel);
            
    }//GEN-LAST:event_BotonGraficoActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        Login login = new Login();//lo dirijo al loginadmin
        login.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        login.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        dispose();//para cerrar la ventana actual
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void BotonCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalculoActionPerformed
        if("LAIN☢".equals(this.getTitle())){
        Calculo calculo = new Calculo();//lo dirijo al loginadmin
        calculo.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        calculo.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        dispose();//para cerrar la ventana actual
}
else{
  Calculo calculo = new Calculo();//lo dirijo al loginadmin
        calculo.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        calculo.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        dispose();//para cerrar la ventana actual
}
    }//GEN-LAST:event_BotonCalculoActionPerformed

    private void BotonEnvivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEnvivoActionPerformed
         try {

            Desktop.getDesktop().browse(new URI("https://gisanddata.maps.arcgis.com/apps/opsdashboard/index.html#/bda7594740fd40299423467b48e9ecf6"));

        }  catch (IOException ex) {   
             AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/X.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error desconocido</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
         //   Texto_alarma.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
         } catch (URISyntaxException ex) {
               AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/X.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error desconocido</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
         //   Texto_alarma.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
         }
    }//GEN-LAST:event_BotonEnvivoActionPerformed

    /**
     */
    
    public void diseño_Botones(){
        
         
     BotonAgregarpaciente.setOpaque(false);
        BotonAgregarpaciente.setContentAreaFilled(false);
        BotonAgregarpaciente.setBorderPainted(false);
        
          BotonEditarpaciente.setOpaque(false);
        BotonEditarpaciente.setContentAreaFilled(false);
        BotonEditarpaciente.setBorderPainted(false);
             BotonAdmin.setOpaque(false);
        BotonAdmin.setContentAreaFilled(false);
        BotonAdmin.setBorderPainted(false);
        
         BotonEliminarpaciente.setOpaque(false);
        BotonEliminarpaciente.setContentAreaFilled(false);
        BotonEliminarpaciente.setBorderPainted(false);
        
        BotonCorreo.setOpaque(false);
        BotonCorreo.setContentAreaFilled(false);
        BotonCorreo.setBorderPainted(false);
        
         BotonAtras.setOpaque(false);
        BotonAtras.setContentAreaFilled(false);
        BotonAtras.setBorderPainted(false);

         BotonMedicinas.setOpaque(false);
        BotonMedicinas.setContentAreaFilled(false);
        BotonMedicinas.setBorderPainted(false);
        
        BotonInicio.setOpaque(false);
        BotonInicio.setContentAreaFilled(false);
        BotonInicio.setBorderPainted(false);
        
        
                  BotonGrafico.setOpaque(false);
        BotonGrafico.setContentAreaFilled(false);
        BotonGrafico.setBorderPainted(false);
        
        BotonCalculo.setOpaque(false);
        BotonCalculo.setContentAreaFilled(false);
        BotonCalculo.setBorderPainted(false);
        
           BotonEnvivo.setOpaque(false);
        BotonEnvivo.setContentAreaFilled(false);
        BotonEnvivo.setBorderPainted(false);
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BotonAdmin;
    private javax.swing.JButton BotonAgregarpaciente;
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonCalculo;
    private javax.swing.JButton BotonCorreo;
    private javax.swing.JButton BotonEditarpaciente;
    private javax.swing.JButton BotonEliminarpaciente;
    private javax.swing.JButton BotonEnvivo;
    private javax.swing.JButton BotonGrafico;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonMedicinas;
    // End of variables declaration//GEN-END:variables
}
