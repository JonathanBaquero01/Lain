
import java.applet.AudioClip;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jona
 */
public class Calculo extends javax.swing.JFrame {

    
    
    public Calculo() {
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
      TextoMes.requestFocus();
    }

    public void Calculo(){
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        TextoMes = new javax.swing.JTextField();
        BotonOK = new javax.swing.JButton();
        BotonGraficar = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        BotonInicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 850));
        setSize(new java.awt.Dimension(650, 850));

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mes:");

        TextoMes.setFont(new java.awt.Font("Tempus Sans ITC", 3, 47)); // NOI18N
        TextoMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextoMes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TextoMes.setSelectionColor(new java.awt.Color(0, 0, 0));
        TextoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoMesActionPerformed(evt);
            }
        });
        TextoMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextoMesKeyTyped(evt);
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

        BotonGraficar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Grafico_boton.png"))); // NOI18N
        BotonGraficar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGraficar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Grafico_boton2.png"))); // NOI18N
        BotonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGraficarActionPerformed(evt);
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
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addComponent(BotonGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
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
                .addComponent(BotonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(BotonGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoMesActionPerformed

    private void TextoMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoMesKeyTyped
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
            TextoMes.setCursor(null);
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
            TextoMes.setCursor(null);
        }
      
    }//GEN-LAST:event_TextoMesKeyTyped

    private void BotonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOKActionPerformed
       if("".equals(TextoMes.getText())){//si esta vacio
            AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
       sonido.play();
    JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Campo vacio</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE);
      TextoMes.requestFocus();
       }
      
        else if(Integer.parseInt(TextoMes.getText())==0){//si el mes es mayor a 12
            AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
       sonido.play();
    JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">El mes no puede ser 0</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE);
    TextoMes.setText("");
         TextoMes.requestFocus();
       }
        else{
        int t = Integer.parseInt(TextoMes.getText());
        double X= 5+(0.02*t);//FORMULAS
        double Y = 6+(0.04*Math.sqrt(t));
        //RAZON DE CAMBIO DE LA DEMANDA DE LA PRIMERA (VACUNA PARAELIMINAR VIRUS)) CON RESPECTO AL TIEMPO EN EL MES T
        double Calculo = (-0.4*X)+20*(0.2/Math.sqrt(t));//debo graficar esta funcion, la variable que cambiara sera t
        
           AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Realizado.wav"));
            sonido.play();
          Icon icon = new ImageIcon(getClass().getResource("/Imagenes/chulito.png")); //para poner icono al aviso
             JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">"+ Calculo+ " Galones por mes"+"  </b>", "Galones por mes", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_BotonOKActionPerformed

    private void BotonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGraficarActionPerformed
       
          if("".equals(TextoMes.getText())){//si esta vacio
            AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
       sonido.play();
    JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">Campo vacio</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE);
      TextoMes.requestFocus();
       }
       
        else if(Integer.parseInt(TextoMes.getText())==0){//si el mes es mayor a 12
            AudioClip  sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
       sonido.play();
    JOptionPane.showMessageDialog(null, "<html><b><span style=\"font-size:1.3em\">El mes no puede ser 0</b>", "Error✘", JOptionPane.INFORMATION_MESSAGE);
    TextoMes.setText("");
         TextoMes.requestFocus();
       }
        else{
        int t = Integer.parseInt(TextoMes.getText());
        
        double X= 5+(0.02*t);//FORMULAS
        double Y = 6+(0.04*Math.sqrt(t));
       
         XYSeries GraficaMeses = new XYSeries("Grafica");
              for (int i = 1; i <= t; i++) {//hare un for de 12 ciclos ya que son 12 meses
                   double Calculo = (-0.4*X)+20*(0.2/Math.sqrt(i));//debo graficar esta funcion, la variable que cambiara sera tGrafica
             
              
                GraficaMeses.add(i, Calculo);
                
              
              }
       
        XYSeriesCollection dataset = new XYSeriesCollection();
                dataset.addSeries(GraficaMeses);
                
                JFreeChart xylineChart = ChartFactory.createXYLineChart(
                                "Grafica XY",
                                "Meses",
                                "Galones por mes",
                                dataset,
                                PlotOrientation.VERTICAL, true, true, false);
 
               
                XYPlot plot = xylineChart.getXYPlot();
               
                XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
               
                renderer.setSeriesPaint(0, Color.RED);//color grafica              
                renderer.setSeriesStroke(0, new BasicStroke(4.0f));//grosor de la grafica            
                plot.setRenderer(renderer);
               
                ChartPanel panel = new ChartPanel(xylineChart);
 
                // Creamos la ventana
                JFrame ventana = new JFrame("Grafica");
                ventana.setVisible(true);
                ventana.setSize(800, 600);
              //  ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
                ventana.add(panel);
        
        }
    }//GEN-LAST:event_BotonGraficarActionPerformed

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
        
        BotonGraficar.setOpaque(false);
        BotonGraficar.setContentAreaFilled(false);
        BotonGraficar.setBorderPainted(false);
        
         BotonInicio.setOpaque(false);
        BotonInicio.setContentAreaFilled(false);
        BotonInicio.setBorderPainted(false);
                
                BotonAtras.setOpaque(false);
        BotonAtras.setContentAreaFilled(false);
        BotonAtras.setBorderPainted(false);
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
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonGraficar;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonOK;
    private javax.swing.JTextField TextoMes;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
