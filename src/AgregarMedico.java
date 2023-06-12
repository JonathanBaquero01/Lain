

import com.mysql.jdbc.Connection;
import java.applet.AudioClip;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jona
 */
public class AgregarMedico extends javax.swing.JFrame {

    UsuarioYClaveBD usuarioyclavebd = new UsuarioYClaveBD();
     
                                          //si no fuera static se pondria la palabra verde usuarioyclavebd
     public static final  String URL = UsuarioYClaveBD.getURL();
      public static final  String USERNAME = UsuarioYClaveBD.getUSERNAME();//usuario de la abse de datos
       public static final  String PASSWORD = UsuarioYClaveBD.getPASSWORD(); //clave de la abse de datos
       

    
     
       PreparedStatement ps;
       ResultSet rs; //variables para poder conectar a la BD
    public AgregarMedico() {
       initComponents();

        
        
      //  Password.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
        try {//ESTO TIENE QUE VER CON LA CLASE FONDOSQING PARA COLOCAR IMAGEN DE FONDO
            FondoSwing fondo = new FondoSwing(ImageIO.read(new File("BD/Fondo-AgregarMedico.jpg")));

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
       TextoNombreMedico.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        TextoNombreMedico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextoCedulaMedico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextoClave = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        TextoConfirmarClave = new javax.swing.JPasswordField();
        BotonOK = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        BotonInicio = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(650, 850));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre completo:");

        TextoNombreMedico.setFont(new java.awt.Font("Tempus Sans ITC", 3, 47)); // NOI18N
        TextoNombreMedico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoNombreMedico.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TextoNombreMedico.setSelectionColor(new java.awt.Color(0, 0, 0));
        TextoNombreMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNombreMedicoActionPerformed(evt);
            }
        });
        TextoNombreMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextoNombreMedicoKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cedula:");

        TextoCedulaMedico.setFont(new java.awt.Font("Tempus Sans ITC", 3, 47)); // NOI18N
        TextoCedulaMedico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoCedulaMedico.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TextoCedulaMedico.setSelectionColor(new java.awt.Color(0, 0, 0));
        TextoCedulaMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCedulaMedicoActionPerformed(evt);
            }
        });
        TextoCedulaMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextoCedulaMedicoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirmar clave:");

        TextoClave.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        TextoClave.setSelectionColor(new java.awt.Color(0, 0, 0));
        TextoClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoClaveActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Clave:");

        TextoConfirmarClave.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        TextoConfirmarClave.setSelectionColor(new java.awt.Color(0, 0, 0));
        TextoConfirmarClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoConfirmarClaveActionPerformed(evt);
            }
        });

        BotonOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok.png"))); // NOI18N
        BotonOK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonOK.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.png"))); // NOI18N
        BotonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOKActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoNombreMedico)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoCedulaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 90, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(TextoNombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(TextoCedulaMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(TextoConfirmarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addComponent(BotonAtras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoNombreMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNombreMedicoActionPerformed
 
    }//GEN-LAST:event_TextoNombreMedicoActionPerformed

    private void TextoCedulaMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCedulaMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCedulaMedicoActionPerformed

    private void TextoClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoClaveActionPerformed

    private void TextoConfirmarClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoConfirmarClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoConfirmarClaveActionPerformed

    private void BotonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOKActionPerformed

        if("".equals(TextoNombreMedico.getText()) || "".equals(TextoCedulaMedico.getText()) || "".equals(TextoClave.getText()) ||"".equals(TextoConfirmarClave.getText()) ){//verifico que no este nada vacio
AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();
    JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Uno de los campos esta vacio</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE);
return; //pa sairme del metodo
}
        
        
        if(TextoClave.getText().equals(TextoConfirmarClave.getText())){//verifico si las claves son iguales
Connection con =null;

    try {//aqui entra a la BD y lo agrega
        con =  getConection();
        ps = con.prepareStatement("INSERT INTO medico (IDmedico, Nombre , Clave) VALUES(?,?,?)");
        ps.setLong(1, Long.parseLong(TextoCedulaMedico.getText()));//para almacenar en la BD, el 1 es su posicion en la tabla
         ps.setString(2, TextoNombreMedico.getText());
          ps.setString(3, TextoClave.getText());
        int res=  ps.executeUpdate();
        
        if(res>0){//si se guardo ira aqui
             AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Realizado.wav"));
            sonido.play();
          Icon icon = new ImageIcon(getClass().getResource("/Imagenes/chulito.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Guardado</b>", "OK✔", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        else{//si no se guardo aqui
                    AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Error.wav"));
            sonido.play();
          Icon icon = new ImageIcon(getClass().getResource("/Imagenes/X.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">No se pudo guardar, vuelve a intentarlo</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
        }
        con.close();
    } catch (Exception e) {
        AudioClip    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Error.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/X.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error desconocido</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}     
else{
 AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Error.wav"));
            sonido.play();
          Icon icon = new ImageIcon(getClass().getResource("/Imagenes/clave.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Las claves no coinsiden</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);

}  
    }//GEN-LAST:event_BotonOKActionPerformed

    private void TextoNombreMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoNombreMedicoKeyTyped
       //todo esto es para validar solo letras
        char C= evt.getKeyChar();
     
     if(Character.isDigit(C))
     {
        // getToolkit().beep(); //esto lo que ahce es hacer un sonido de beep
         evt.consume();
               
          AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();
          Icon icon = new ImageIcon(getClass().getResource("/Imagenes/AB.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Solo caracteres alfabeticos</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
         TextoNombreMedico.setCursor(null);
     }
      else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
       //  getToolkit().beep();//esto lo que ahce es hacer un sonido de beep
         evt.consume();
         
              
          AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();
          Icon icon = new ImageIcon(getClass().getResource("/Imagenes/AB.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Solo caracteres alfabeticos</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
         TextoNombreMedico.setCursor(null);
     }
    }//GEN-LAST:event_TextoNombreMedicoKeyTyped

    private void TextoCedulaMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoCedulaMedicoKeyTyped
       //esto para valdiar solo numeros
        char C= evt.getKeyChar();
     
     if(Character.isLetter(C))
     {
        // getToolkit().beep();  //esto lo que ahce es hacer un sonido de beep
         evt.consume();
          AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();
          Icon icon = new ImageIcon(getClass().getResource("/Imagenes/123.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Solo caracteres numericos</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
         TextoCedulaMedico.setCursor(null);
     }
     else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
             ||(int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
             || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
             || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
    {
       //  getToolkit().beep();// //esto lo que ahce es hacer un sonido de beep
         evt.consume();
          AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();
          Icon icon = new ImageIcon(getClass().getResource("/Imagenes/123.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Solo caracteres numericos</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
         TextoCedulaMedico.setCursor(null);
     }
    }//GEN-LAST:event_TextoCedulaMedicoKeyTyped

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        MenuAdmin menuadmin = new MenuAdmin();//lo dirijo al loginadmin
        menuadmin.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        menuadmin.setVisible(true);
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

   public void diseño_Botones(){
    BotonOK.setOpaque(false);
        BotonOK.setContentAreaFilled(false);
        BotonOK.setBorderPainted(false);
        
        BotonAtras.setOpaque(false);
        BotonAtras.setContentAreaFilled(false);
        BotonAtras.setBorderPainted(false);
        
          BotonInicio.setOpaque(false);
        BotonInicio.setContentAreaFilled(false);
        BotonInicio.setBorderPainted(false);
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
            java.util.logging.Logger.getLogger(AgregarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonOK;
    private javax.swing.JTextField TextoCedulaMedico;
    private javax.swing.JPasswordField TextoClave;
    private javax.swing.JPasswordField TextoConfirmarClave;
    private javax.swing.JTextField TextoNombreMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
