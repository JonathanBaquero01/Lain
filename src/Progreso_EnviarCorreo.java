
import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jona
 */
public class Progreso_EnviarCorreo extends SwingWorker<Integer, String>  {



    private JProgressBar jpbar;
    private String Correo;
    private String Clave;
    private String CorreoPaciente;
    private String NombrePaciente;
    private String Descripcion;
    private String ubicacionArchivo;
    private String NombreArchivo;
    private String TipoCorreo;

    public Progreso_EnviarCorreo(JProgressBar jpbar, String Correo, String Clave, String CorreoPaciente, String NombrePaciente, String Descripcion, String ubicacionArchivo, String NombreArchivo, String TipoCorreo) {//le maqnde el correo y la clave

        this.jpbar = jpbar;
        this.Correo = Correo;
        this.Clave = Clave;
         this.CorreoPaciente = CorreoPaciente;
         this.NombrePaciente = NombrePaciente;
        this.Descripcion = Descripcion;
        this.ubicacionArchivo =ubicacionArchivo;
this.NombreArchivo= NombreArchivo;
this.TipoCorreo=TipoCorreo;
    }

    @Override
    protected Integer doInBackground() throws Exception {
            getJpbar().setIndeterminate(true);
        //aqui abajo va el proceso

        try {
           

            Properties props = new Properties();
           
            if("Outlook".equals(TipoCorreo)){//vere que tipo de correos es para poner la direccion
              props.setProperty("mail.smtp.host", "smtp.live.com"); //servidor de yahoo	
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");//puerto de outlook y hotmail
            props.setProperty("mail.smtp.auth", "true");
            }
            else if("Yahoo".equals(TipoCorreo)){
             props.setProperty("mail.smtp.host", "smtp.mail.yahoo.com"); //servidor de yahoo	
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "25");//puerto de outlook y hotmail
            props.setProperty("mail.smtp.auth", "true");
            }
else if("Gmail".equals(TipoCorreo)){
             props.setProperty("mail.smtp.host", "smtp.gmail.com"); //servidor de yahoo	
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "25");//puerto de outlook y hotmail
            props.setProperty("mail.smtp.auth", "true");
            }
           
            Session session = Session.getDefaultInstance(props);
             String correoReceptor = CorreoPaciente;//correo a donde llegara el mensaje
             String correoRemitente = Correo;
            String passwordRemitente = Clave;         
            String asunto = "Novedades "+NombrePaciente;
            String mensaje = Descripcion;
            
            if("".equals(ubicacionArchivo)){//si el archivo no tiene ubicacion es que no se enviara un archivo asi que usara otro codigo
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje, "ISO-8859-1", "html");

            Transport t = session.getTransport("smtp");
            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();
            getJpbar().setIndeterminate(false);
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Realizado.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/Correo invalido.png")); //para poner icono al aviso
            JOptionPane.showMessageDialog(null, "<html><b> Correo enviado </b>", "Enviado", JOptionPane.INFORMATION_MESSAGE, icon);
            
            }
            else {//si la ubicacion del archivo no esta vacia entonces el codigo pa enviar un archivo
             BodyPart texto = new MimeBodyPart();
            texto.setContent(mensaje, "text/html");

            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource(ubicacionArchivo)));
           adjunto.setFileName(NombreArchivo);

           MimeMultipart miltiParte = new MimeMultipart();
            miltiParte.addBodyPart(texto);
            miltiParte.addBodyPart(adjunto);

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
           message.setContent(miltiParte);

            Transport t = session.getTransport("smtp");
            t.connect(correoRemitente, passwordRemitente);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();
            
              
            getJpbar().setIndeterminate(false);
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Realizado.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/Correo invalido.png")); //para poner icono al aviso
            JOptionPane.showMessageDialog(null, "<html><b> Correo enviado </b>", "Enviado", JOptionPane.INFORMATION_MESSAGE, icon);
            }

            
           
          


 
        } catch (AddressException ex) {

            getJpbar().setIndeterminate(false);
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Error.wav"));
            sonido.play();
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/X.png")); //para poner icono al aviso
            JOptionPane.showMessageDialog(null, "<html><b>Error desconocido </b> ", "Vuelve a intentarlo", JOptionPane.INFORMATION_MESSAGE, icon);

        } catch (MessagingException ex) {
        
           getJpbar().setIndeterminate(false);
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Advertencia.wav"));
            sonido.play();           
            Icon icon = new ImageIcon(getClass().getResource("/Imagenes/Correo invalido.png")); //para poner icono al aviso
            JOptionPane.showMessageDialog(null, "<html><b>Clave o correo incorrectos </b> ", "Error", JOptionPane.INFORMATION_MESSAGE, icon);

        }

        getJpbar().setIndeterminate(false);
        return 1;// no retorna nada, solo q le pongo que devuelva 1 pa q no de error
    }

    public JProgressBar getJpbar() {
        return jpbar;
    }

    public void setJpbar(JProgressBar jpbar) {
        this.jpbar = jpbar;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getCorreoPaciente() {
        return CorreoPaciente;
    }

    public void setCorreoPaciente(String CorreoPaciente) {
        this.CorreoPaciente = CorreoPaciente;
    }

    public String getNombrePaciente() {
        return NombrePaciente;
    }

    public void setNombrePaciente(String NombrePaciente) {
        this.NombrePaciente = NombrePaciente;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getUbicacionArchivo() {
        return ubicacionArchivo;
    }

    public void setUbicacionArchivo(String ubicacionArchivo) {
        this.ubicacionArchivo = ubicacionArchivo;
    }

    public String getNombreArchivo() {
        return NombreArchivo;
    }

    public void setNombreArchivo(String NombreArchivo) {
        this.NombreArchivo = NombreArchivo;
    }

    public String getTipoCorreo() {
        return TipoCorreo;
    }

    public void setTipoCorreo(String TipoCorreo) {
        this.TipoCorreo = TipoCorreo;
    }

    

     
    
   
   
    
    
}
