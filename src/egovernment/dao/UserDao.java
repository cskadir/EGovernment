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
public interface UserDao {
    
    public int add(User user) throws SQLException;
     
    public void delete(String identificationNo) throws SQLException;
    
    public User getUser(String identificationNo) throws SQLException;
    
    public List<User> getUsers() throws SQLException;
    
    public void update(User user) throws SQLException;
    
}
