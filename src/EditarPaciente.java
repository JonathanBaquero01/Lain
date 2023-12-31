


import com.mysql.jdbc.Connection;
import java.applet.AudioClip;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
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
public class EditarPaciente extends javax.swing.JFrame {

    UsuarioYClaveBD usuarioyclavebd = new UsuarioYClaveBD();
     
                                          //si no fuera static se pondria la palabra verde usuarioyclavebd
     public static final  String URL = UsuarioYClaveBD.getURL();
      public static final  String USERNAME = UsuarioYClaveBD.getUSERNAME();//usuario de la abse de datos
       public static final  String PASSWORD = UsuarioYClaveBD.getPASSWORD(); //clave de la abse de datos
       
       PreparedStatement ps;
       ResultSet rs; //variables para poder conectar a la BD
       
         long IDPaciente=0;
    String Nombre="";
     String FechaNacimiento="";
     String Nacionalidad="";//estar variables del paciente no se pueden moldificar asi q las guardare
     String Genero="";
     boolean Encontropaciente = false;//para saber si yah ya un paciente que encontro
    public EditarPaciente() {
         initComponents();

        
        
      //  Password.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
        try {//ESTO TIENE QUE VER CON LA CLASE FONDOSQING PARA COLOCAR IMAGEN DE FONDO
            FondoSwing fondo = new FondoSwing(ImageIO.read(new File("BD/Agregar-paciente.jpg")));

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
TextoDocumento.requestFocus();
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

        jLabel3 = new javax.swing.JLabel();
        TextoDocumento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ComboBoxEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TextoCelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextoCorreo = new javax.swing.JTextField();
        BotonOK = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        BotonInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(650, 850));

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Documento o ID:");

        TextoDocumento.setFont(new java.awt.Font("Tempus Sans ITC", 3, 30)); // NOI18N
        TextoDocumento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoDocumento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TextoDocumento.setSelectionColor(new java.awt.Color(0, 0, 0));
        TextoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoDocumentoActionPerformed(evt);
            }
        });
        TextoDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextoDocumentoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado de enfermedad:");

        ComboBoxEstado.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        ComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Urgencia menor", "Urgencia", "Emergencia", "Resucitacion" }));

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Celular:");

        TextoCelular.setFont(new java.awt.Font("Tempus Sans ITC", 3, 30)); // NOI18N
        TextoCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoCelular.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TextoCelular.setSelectionColor(new java.awt.Color(0, 0, 0));
        TextoCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCelularActionPerformed(evt);
            }
        });
        TextoCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextoCelularKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo de un familiar:");

        TextoCorreo.setFont(new java.awt.Font("Tempus Sans ITC", 3, 30)); // NOI18N
        TextoCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoCorreo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TextoCorreo.setSelectionColor(new java.awt.Color(0, 0, 0));
        TextoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCorreoActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(BotonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoDocumentoActionPerformed

    private void TextoDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoDocumentoKeyTyped
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
            TextoDocumento.setCursor(null);
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
            TextoDocumento.setCursor(null);
        }
    }//GEN-LAST:event_TextoDocumentoKeyTyped

    private void TextoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCelularActionPerformed

    private void TextoCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoCelularKeyTyped
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
            TextoDocumento.setCursor(null);
        }
    }//GEN-LAST:event_TextoCelularKeyTyped

    private void TextoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCorreoActionPerformed

    private void BotonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOKActionPerformed
if("".equals(TextoDocumento.getText())){
    AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();
    JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">El campo ID esta vacio</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE);
  TextoDocumento.requestFocus();
return;//me salgo del metodo
}

      Connection con = null;
         con = getConection();
        try{
            
            if(Encontropaciente==false){
             
            ps = con.prepareStatement("SELECT * FROM paciente WHERE IDPaciente = ?");//busco el paciente por el ID
             ps.setLong(1, Long.parseLong(TextoDocumento.getText()));
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                IDPaciente= rs.getLong("IDPaciente");
                Nombre =  rs.getString("Nombre");//guardo los datos que no se van a modificar
                FechaNacimiento = rs.getString("FechaNacimiento");
                Nacionalidad  = rs.getString("Nacionalidad");
                Genero  = rs.getString("Genero");
             
                   AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Realizado.wav"));
            sonido.play();
          Icon icon = new ImageIcon(getClass().getResource("/Imagenes/chulito.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Paciente: "+Nombre+"</b>", "Paciente", JOptionPane.INFORMATION_MESSAGE, icon);
         
             ComboBoxEstado.setSelectedItem(rs.getString("EstadoEnfermedad"));//para poner en el combo box el estado del paciente
           TextoCelular.setText(rs.getString("Celular"));
            TextoCorreo.setText(rs.getString("Correo"));
            Encontropaciente=true; //ya hay un paciente
            TextoDocumento.setEditable(false);//bloqueo el textoID para que sepa a quien esta editando
            } 
            else {
                 AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/X.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">No se encontro la persona</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
         //   Texto_alarma.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
         TextoDocumento.requestFocus();
            }
            }
            else{//si  Encontropaciente es true es q ya hay un paciente
              ps = con.prepareStatement("UPDATE paciente SET IDPaciente=?, Nombre=?, FechaNacimiento=?, Nacionalidad=?, EstadoEnfermedad=?, Genero=?, Correo=?,  Celular=? WHERE IDPaciente=?");
            ps.setLong(1, IDPaciente);//ahora lo midifico, el ID sigue igual
            ps.setString(2, Nombre);
            ps.setString(3, FechaNacimiento);
            ps.setString(4, Nacionalidad);
            ps.setString(5, (String) ComboBoxEstado.getSelectedItem());
            ps.setString(6, Genero);
            ps.setString(7, TextoCorreo.getText());
             ps.setString(8, TextoCelular.getText());
             ps.setLong(9, IDPaciente);//ahora este de ultimo ya que es el ultimo y lo va a buscar
           
            
            int res = ps.executeUpdate();
            
            if(res > 0){
        
                Encontropaciente=false;//lo pongo en flase ya q como ya lo modifico ese paciente sale
                  IDPaciente=0;
     Nombre="";
      FechaNacimiento="";
      Nacionalidad="";//estar variables del paciente no se pueden moldificar asi q las guardare
      Genero="";
           TextoDocumento.setEditable(true);//dejo que sea editable el texto ID por si quiere editar otro paciente
           TextoDocumento.setText("");
           TextoCelular.setText("");
           TextoCorreo.setText("");
                AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Realizado.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/chulito.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Persona modificada</b>", "OK✔", JOptionPane.INFORMATION_MESSAGE, icon);
         //   Texto_alarma.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
            } else {
                
                        AudioClip    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Error.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/X.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error al modificar persona, vuelve a intentarlo</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
                
            }
            
            con.close();
            }
          
            
        } catch(Exception e){
                   AudioClip    sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Error.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/X.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Error desconocido</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
        }
      
    }//GEN-LAST:event_BotonOKActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
     
if("LAIN☢".equals(this.getTitle())){
    Menu menu = new Menu();//lo dirijo al loginadmin
        menu.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        menu.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
          Menu.BotonAdmin.setVisible(false);//en el menu puse esta variable publica la llamo y la modifico
        dispose();//para cerrar la ventana actual
}

else {
  Menu menu = new Menu();//lo dirijo al loginadmin
        menu.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        menu.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
          Menu.BotonAdmin.setVisible(true);//en el menu puse esta variable publica la llamo y la modifico
        dispose();//para cerrar la ventana actual

}


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
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonOK;
    private javax.swing.JComboBox<String> ComboBoxEstado;
    private javax.swing.JTextField TextoCelular;
    private javax.swing.JTextField TextoCorreo;
    private javax.swing.JTextField TextoDocumento;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
