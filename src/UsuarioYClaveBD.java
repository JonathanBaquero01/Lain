/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jona
 */
public class UsuarioYClaveBD  {
    
    
     public static final String URL = "jdbc:mysql://localhost:3306/lain";
      public static final  String USERNAME = "root";//usuario de la abse de datos
       public static final   String PASSWORD = "1234"; //clave de la abse de datos



   
//getter para pedirlo desde otra clase
    public static String getURL() {
        return URL;
    }

    public static String getUSERNAME() {
        return USERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    
       
}
