/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.dao;

import egovernment.model.HES;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kadir
 */
public interface HesDao {
    
    public int add(HES hes) throws SQLException;
     
    public void delete(String id) throws SQLException;
    
    public HES getUser(String id) throws SQLException;
    
    public List<HES> getHes() throws SQLException;
    
    public void update(HES hes) throws SQLException;
    
}
