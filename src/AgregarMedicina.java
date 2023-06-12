
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
 * @author informatica
 */
public class AgregarMedicina extends javax.swing.JFrame {

      UsuarioYClaveBD usuarioyclavebd = new UsuarioYClaveBD();
     
                                          //si no fuera static se pondria la palabra verde usuarioyclavebd
     public static final  String URL = UsuarioYClaveBD.getURL();
      public static final  String USERNAME = UsuarioYClaveBD.getUSERNAME();//usuario de la abse de datos
       public static final  String PASSWORD = UsuarioYClaveBD.getPASSWORD(); //clave de la abse de datos
            
       PreparedStatement ps;
       ResultSet rs; //variables para poder conectar a la BD
    public AgregarMedicina() {
         initComponents();

        
        
      //  Password.requestFocus();//esto es para que se puede volver a escribir en el Jtext si tener que clickearlo
        try {//ESTO TIENE QUE VER CON LA CLASE FONDOSQING PARA COLOCAR IMAGEN DE FONDO
            FondoSwing fondo = new FondoSwing(ImageIO.read(new File("BD/AgregarMedicina.jpg")));

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
        TextoNombre.requestFocus();
    }

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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonInicio = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxAplicacion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextoDescripcion = new javax.swing.JTextArea();
        BotonOK = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        BotonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(650, 850));

        BotonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio.png"))); // NOI18N
        BotonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inicio2.png"))); // NOI18N
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripcion:");

        ComboBoxAplicacion.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        ComboBoxAplicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pastilla", "Inyeccion", "Ambos" }));
        ComboBoxAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAplicacionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Aplicacion:");

        TextoNombre.setFont(new java.awt.Font("Tempus Sans ITC", 3, 30)); // NOI18N
        TextoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoNombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TextoNombre.setSelectionColor(new java.awt.Color(0, 0, 0));
        TextoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNombreActionPerformed(evt);
            }
        });
        TextoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextoNombreKeyTyped(evt);
            }
        });

        TextoDescripcion.setColumns(20);
        TextoDescripcion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextoDescripcion.setRows(5);
        TextoDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextoDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(TextoDescripcion);

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

        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png"))); // NOI18N
        BotonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa2.png"))); // NOI18N
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(472, 472, 472)
                        .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(4, 4, 4)
                        .addComponent(ComboBoxAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        Login login = new Login();//lo dirijo al loginadmin
        login.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        login.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        dispose();//para cerrar la ventana actual
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void ComboBoxAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAplicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAplicacionActionPerformed

    private void TextoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNombreActionPerformed

    private void TextoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoNombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNombreKeyTyped

    private void TextoDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoDescripcionKeyTyped
        if(TextoDescripcion.getText().length()>=500){
        evt.consume();//pa q no permita agregar mas caracteres
              AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();
          Icon icon = new ImageIcon(getClass().getResource("/Imagenes/AB.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Maximo 500 caracteres</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_TextoDescripcionKeyTyped

    private void BotonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOKActionPerformed
  if("".equals(TextoNombre.getText()) || "".equals(TextoDescripcion.getText()) ){//verifico que no este nada vacio
AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();
    JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Uno de los campos esta vacio</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE);

}
  else{
  
  try {//aqui entra a la BD y lo agrega
      Connection con =null;
        con =  getConection();
        ps = con.prepareStatement("INSERT INTO medicina (Nombre, Aplicacion , Descripcion) VALUES(?,?,?)");
        ps.setString(1, TextoNombre.getText());//para almacenar en la BD, el 1 es su posicion en la tabla
         ps.setString(2, (String) ComboBoxAplicacion.getSelectedItem());
          ps.setString(3, TextoDescripcion.getText());
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
   
    }//GEN-LAST:event_BotonOKActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
      
if("LAIN☢".equals(this.getTitle())){//uso el titulo pa saber si esta en admin o no
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

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
           if("LAIN☢".equals(this.getTitle())){
        ReporteMedicinas reportemedicinas = new ReporteMedicinas();//lo dirijo al loginadmin
        reportemedicinas.setTitle("LAIN☢");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        reportemedicinas.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        
}
else{
  ReporteMedicinas reportemedicinas = new ReporteMedicinas();//lo dirijo al loginadmin
        reportemedicinas.setTitle("LAIN☢-Admin");//para que muestre en el la pantalla esquina superior izquierda un titutlo
        reportemedicinas.setVisible(true);
        AudioClip sonido2 = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Boton.wav"));
        sonido2.play();
        
        
}
    }//GEN-LAST:event_BotonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarMedicina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarMedicina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarMedicina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarMedicina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarMedicina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonOK;
    private javax.swing.JComboBox<String> ComboBoxAplicacion;
    private javax.swing.JTextArea TextoDescripcion;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
