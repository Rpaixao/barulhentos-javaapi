/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package barulhentos.javaapi;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.ServiceManager;

/**
 *
 * @author rubenpaixao
 */
public class BarulhentosJavaapi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        run();
    }

    private static void run() {
        try {
            ServiceManager manager = new ServiceManager();
            manager.userService().getSocios();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BarulhentosJavaapi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(BarulhentosJavaapi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(BarulhentosJavaapi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BarulhentosJavaapi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
  