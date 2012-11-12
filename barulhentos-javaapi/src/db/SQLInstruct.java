/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.Serializable;

public class SQLInstruct implements Serializable {

    //Database Configsi:
//    public static final String dbAdress = "jdbc:mysql://localhost:3306/etoilev3";
//    public static final String dbUsername = "root";
    //public static final String dbPassword = "";
//    public static final String dbPassword = "etoile";
//    public static final String dbAdress = "jdbc:mysql://localhost:3306/etoilev3";
//    public static final String dbUsername = "root";
//    public static final String dbPassword = "";
    //public static final String dbPassword = "etoile";
   public static final String dbAdress = "jdbc:mysql://localhost:3306/test";
//    public static final String dbAdress = "jdbc:mysql://84.40.22.48:3306/etoilepl_etoilev3";
    public static final String dbUsername = "root";
    public static final String dbPassword = "";
    
    // fazer no cmd ssh -L 3306:localhost:3306 -l user v3.etoilecascadesideas.eu
//    Example:
//    public static String getNews(){
//       return "SELECT id,title,news,url, professor FROM news"; 
//    }

    public static String getSocios() {
        return "SELECT * FROM socio";
    }

  
    

 
}
