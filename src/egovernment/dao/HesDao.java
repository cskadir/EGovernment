/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.dao;

import egovernment.model.Hes;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kadir
 */
public interface HesDao {
    
    public int add(Hes hes) throws SQLException;
     
    public void delete(String id) throws SQLException;
    
    public Hes getUser(String id) throws SQLException;
    
    public List<Hes> getHes() throws SQLException;
    
    public void update(Hes hes) throws SQLException;
    
}
