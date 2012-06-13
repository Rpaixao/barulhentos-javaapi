/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import db.DBConnect;
import db.SQLInstruct;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rubenpaixao
 */
public class Services {
        DBConnect db ;
    public Services (DBConnect db){
        this.db=db;
    }
    
    
    public void getSocios() throws SQLException{
        String get_socios = SQLInstruct.getSocios();
        ResultSet rSet = db.queryDB(get_socios);
        
        while(rSet.next()){
            System.out.println("Número de Sócio: "+rSet.getInt(1)); 
            System.out.println("Nome: "+rSet.getString(2));
            System.out.println("Foto: "+rSet.getString(4));
            System.out.println("---------------x---------------");
        }
    }
}
