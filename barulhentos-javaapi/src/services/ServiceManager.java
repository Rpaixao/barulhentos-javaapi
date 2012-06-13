/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import db.DBConnect;
import db.SQLInstruct;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rui
 */
public class ServiceManager implements Serializable{

    DBConnect db;

    public ServiceManager() throws SQLException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        db = new DBConnect(SQLInstruct.dbAdress, SQLInstruct.dbUsername, SQLInstruct.dbPassword);
        db.loadDriver();
    }

    
        
    
    public Services userService() {
        Services us = new Services(db);
        return us;
    }
    
    
    public void closeConnection() throws SQLException {
        db.closeDB();
    }
    
   
    
}
