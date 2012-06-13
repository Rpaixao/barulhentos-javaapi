/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import barulhentos.javaapi.Partner;
import db.DBConnect;
import db.SQLInstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author rubenpaixao
 */
public class Services {
        DBConnect db ;
        LinkedList<Partner> partners = new LinkedList<Partner>();
        
    public Services (DBConnect db){
        this.db=db;
    }
    
    
    public LinkedList<Partner> getSocios() throws SQLException{
        String get_socios = SQLInstruct.getSocios();
        ResultSet rSet = db.queryDB(get_socios);
        
        while(rSet.next()){
            System.out.println("Número de Sócio: "+rSet.getInt(1)); 
            System.out.println("Nome: "+rSet.getString(2));
            System.out.println("Foto: "+rSet.getString(4));
            System.out.println("---------------x---------------");
            partners.add(new Partner(rSet.getInt(1),rSet.getString(2),rSet.getString(4)));
        }
        return partners;
    }
}
