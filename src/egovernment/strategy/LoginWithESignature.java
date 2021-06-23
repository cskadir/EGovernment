/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.strategy;
import egovernment.dao.DatabaseHelper;
import egovernment.interfaces.LoginStrategy;
import egovernment.util.Utils;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mehmet
 */
public class LoginWithESignature implements LoginStrategy{

    @Override
    public boolean login(String identificationNo,String pass) {
        Boolean device = Utils.checkDevice();  // Check Tubitak / E-Signature Usb Device
        boolean login = false;
        DatabaseHelper databaseHelper= DatabaseHelper.getDatabaseHelper();
        
        if(device)
        {
            try {
                login=databaseHelper.signIn(identificationNo, pass);
            } catch (SQLException ex) {
                Logger.getLogger(LoginWithESignature.class.getName()).log(Level.SEVERE, null, ex);
            }
            return login;
        }
        return login;
    }
    
}
