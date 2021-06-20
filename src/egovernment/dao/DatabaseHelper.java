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
    
    static UserDaoImplementation daoImplementation = UserDaoImplementation.getDaoImplementation(); 
    
    
    public List<User> getFamilyMembers (String familCode) throws SQLException{
        return daoImplementation.getFamilyMembers(familCode);
    }
    public boolean  signIn(String identificationNo, String password) throws SQLException{
        return daoImplementation.signIn(identificationNo, password);
    }
    
    public User getUSer(String id) throws SQLException{
        
        return daoImplementation.getUser(id);
    }
}
