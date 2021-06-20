/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.dao;

import egovernment.model.HES;
import egovernment.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author kadir
 */
public class HesDaoImplementation implements HesDao{
    
    static Connection con = DatabaseConnection.getConnection();
    
    static HesDaoImplementation hesDaoImplementation = null;
    
    public static HesDaoImplementation getDaoImplementation(){
        if (hesDaoImplementation == null)
            hesDaoImplementation = new HesDaoImplementation();
  
        return hesDaoImplementation;
    }

    @Override
    public int add(HES hes) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HES getUser(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HES> getHes() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(HES hes) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
