/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment;

import egovernment.dao.DatabaseHelper;
import egovernment.dao.UserDaoImplementation;
import egovernment.model.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kadir
 */
public class EGovernment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        DatabaseHelper dbHelper = new DatabaseHelper();
        
        /*User u = dbHelper.getUSer("123");
        System.out.println(u.getName());
        
        List<User> family = dbHelper.getFamilyMembers("10");
        
        for (User user : family) {
            System.out.println(user.getIdentificationNo());
            
        }*/
        System.out.println(dbHelper.signIn("123", "1e23456"));
    }
    
}
