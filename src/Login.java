
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.applet.AudioClip;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author informatica
 */
public class Login extends javax.swing.JFrame {

     UsuarioYClaveBD usuarioyclavebd = new UsuarioYClaveBD();
     
                                          //si no fuera static se pondria la palabra verde usuarioyclavebd
     public static final  String URL = UsuarioYClaveBD.getURL();
      public static final  String USERNAME = UsuarioYClaveBD.getUSERNAME();//usuario de la abse de datos
       public static final  String PASSWORD = UsuarioYClaveBD.getPASSWORD(); //clave de la abse de datos
      
         
    public Login() {
                
              
        initComponents();
//Menu  menu =new Menu();//llamo al menu ya q cogere un boton de este
        
        
      //  Password.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
        try {//ESTO TIENE QUE VER CON LA CLASE FONDOSQING PARA COLOCAR IMAGEN DE FONDO
            FondoSwing fondo = new FondoSwing(ImageIO.read(new File("BD/Fondo-Login.jpg")));

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
    TextoUsuario.requestFocus();
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
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAdmin = new javax.swing.JButton();
        TextoUsuario = new javax.swing.JTextField();
        TextoClave = new javax.swing.JPasswordField();
        BotonIniciarSesion = new javax.swing.JButton();
        Boton_Mostrarclave = new javax.swing.JButton();
        BotonAdmin1 = new javax.swing.JButton();

        BotonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin.png"))); // NOI18N
        BotonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAdminActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(650, 850));

        TextoUsuario.setFont(new java.awt.Font("Tempus Sans ITC", 3, 47)); // NOI18N
        TextoUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TextoUsuario.setSelectionColor(new java.awt.Color(0, 0, 0));
        TextoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoUsuarioActionPerformed(evt);
            }
        });

        TextoClave.setFont(new java.awt.Font("Tempus Sans ITC", 1, 40)); // NOI18N
        TextoClave.setSelectionColor(new java.awt.Color(0, 0, 0));
        TextoClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoClaveActionPerformed(evt);
            }
        });

        BotonIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IniciarSesion.png"))); // NOI18N
        BotonIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonIniciarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IniciarSesion2.png"))); // NOI18N
        BotonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarSesionActionPerformed(evt);
            }
        });

        Boton_Mostrarclave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        Boton_Mostrarclave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Boton_Mostrarclave.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar2.png"))); // NOI18N
        Boton_Mostrarclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_MostrarclaveActionPerformed(evt);
            }
        });

        BotonAdmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin.png"))); // NOI18N
        BotonAdmin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAdmin1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin2.png"))); // NOI18N
        BotonAdmin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAdmin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BotonAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(BotonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_Mostrarclave, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BotonAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(TextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Mostrarclave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoUsuarioActionPerformed

    }//GEN-LAST:event_TextoUsuarioActionPerformed

    private void TextoClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoClaveActionPerformed

    private void BotonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarSesionActionPerformed

String usuarioBD="";
String claveBD="";//aqui almacenare los usuarios y claves que encuentre en la base de datos
        
        try {
            Connection con=null;
           con= getConection();
           PreparedStatement ps;
          ResultSet res;
              ps= (PreparedStatement) con.prepareStatement("SELECT * FROM medico");
           res= ps.executeQuery();
           
           while(res.next()){//recorrera cada columna de la tabla
           usuarioBD =res.getString(2);//el usuario esta en la posicion 2 , (se cuenta desde el 1 no desde el 0 )
           claveBD = res.getString(3);//esta en la posicion 3 , (se cuenta desde el 1 no desde el 0 )
           
           if(TextoUsuario.getText().equals(usuarioBD) && TextoClave.getText().equals(claveBD)){//si el usuario y clave dijitados son iguales a los de la BD que entre al menu
             Menu menu = new Menu();//lo dirijo al menu
        menu.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        menu.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Realizado.wav"));
        sonido2.play();
        Menu.BotonAdmin.setVisible(false);//en el menu puse esta variable publica la llamo y la modifico
       
        dispose();//para cerrar la ventana actual
        return;//para salir del metodo
           }
          
           }
           
              AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/Usuario_erroneo.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Usuario o clave incorrectos</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
         //   Texto_alarma.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
           
           
          
        } catch (Exception e) {
                   
        AudioClip    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Error.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/X.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error desconocido</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        
    }//GEN-LAST:event_BotonIniciarSesionActionPerformed

    private void BotonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonAdminActionPerformed

    private void BotonAdmin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAdmin1ActionPerformed
       LoginAdmin loginadmin = new LoginAdmin();//lo dirijo al loginadmin
        loginadmin.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        loginadmin.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        dispose();//para cerrar la ventana actual
    }//GEN-LAST:event_BotonAdmin1ActionPerformed

    private void Boton_MostrarclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_MostrarclaveActionPerformed
        char mostrarClave = 0;

        TextoClave.setEchoChar(mostrarClave);
    }//GEN-LAST:event_Boton_MostrarclaveActionPerformed

    public void diseño_Botones() {
    BotonIniciarSesion.setOpaque(false);
        BotonIniciarSesion.setContentAreaFilled(false);
        BotonIniciarSesion.setBorderPainted(false);
        
         Boton_Mostrarclave.setOpaque(false);
        Boton_Mostrarclave.setContentAreaFilled(false);
        Boton_Mostrarclave.setBorderPainted(false);
        
          
       BotonAdmin1.setOpaque(false);
        BotonAdmin1.setContentAreaFilled(false);
        BotonAdmin1.setBorderPainted(false);
        
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAdmin;
    private javax.swing.JButton BotonAdmin1;
    private javax.swing.JButton BotonIniciarSesion;
    private javax.swing.JButton Boton_Mostrarclave;
    private javax.swing.JPasswordField TextoClave;
    private javax.swing.JTextField TextoUsuario;
    // End of variables declaration//GEN-END:variables
}
