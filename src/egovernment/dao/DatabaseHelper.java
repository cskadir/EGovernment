/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.dao;

import egovernment.model.User;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kadir
 */
public class DatabaseHelper {
    
    static UserDaoImplementation userDaoImplementation = UserDaoImplementation.getDaoImplementation(); 
    static HesDaoImplementation hesDaoImplementation = HesDaoImplementation.getDaoImplementation();
    
    
    public List<User> getFamilyMembers (String familCode) throws SQLException{
        return userDaoImplementation.getFamilyMembers(familCode);
    }
    public boolean  signIn(String identificationNo, String password) throws SQLException{
        return userDaoImplementation.signIn(identificationNo, password);
    }
    
    public User getUSer(String id) throws SQLException{
        
        return userDaoImplementation.getUser(id);
    }
}
