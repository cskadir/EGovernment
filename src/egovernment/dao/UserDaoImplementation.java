/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.dao;

import egovernment.model.User;
import egovernment.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kadir
 */
public class UserDaoImplementation implements UserDao{
    static Connection con = DatabaseConnection.getConnection();

    @Override
    public int add(User user) throws SQLException {
        String query
            = "insert into users(identification_no, name,surname,password,family_code ) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps
            = con.prepareStatement(query);
            ps.setString(1, user.getIdentificationNo());
            ps.setString(2, user.getName());
            ps.setString(3, user.getSurname());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getFamilyCode());
        int n = ps.executeUpdate();
        return n;
    }

    @Override
    public void delete(int identificationNo) throws SQLException {
        String query
            = "delete from userss where identification_no =?";
        PreparedStatement ps
            = con.prepareStatement(query);
        ps.setInt(1, identificationNo);
        ps.executeUpdate();
    }

    @Override
    public User getUser(int identificationNo) throws SQLException {
        String query
            = "select * from users where identification_no= ?";
        PreparedStatement ps
            = con.prepareStatement(query);
  
        ps.setInt(1, identificationNo);
        User user = new User();
        ResultSet rs = ps.executeQuery();
        boolean check = false;
  
        while (rs.next()) {
            check = true;
            user.setIdentificationNo(rs.getNString("identification_no"));
            user.setName(rs.getNString("name"));
            user.setSurname(rs.getNString("surname"));
            user.setPassword(rs.getNString("password"));
            user.setFamilyCode(rs.getNString("family_code"));      
        }
  
        if (check == true) {
            return user;
        }
        else
            return null;
    }

    @Override
    public List<User> getUsers() throws SQLException {
        String query = "select * from users";
        PreparedStatement ps
            = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<User> ls = new ArrayList();
  
        while (rs.next()) {
            User user = new User();
            user.setIdentificationNo(rs.getNString("identification_no"));
            user.setName(rs.getNString("name"));
            user.setSurname(rs.getNString("surname"));
            user.setPassword(rs.getNString("password"));
            user.setFamilyCode(rs.getNString("family_code"));  
            ls.add(user);
        }
        return ls;
    }

    @Override
    public void update(User user) throws SQLException {
      String query
            = "update employee set name=?, "
              + " surname= ?,"
              + " password= ?,"
              + " family_code= ?"
              + " where identification_no = ?";
        PreparedStatement ps
            = con.prepareStatement(query);
        ps.setString(1, user.getName());
        ps.setString(2, user.getSurname());
        ps.setString(3, user.getPassword());
        ps.setString(3, user.getFamilyCode());
        ps.executeUpdate();
    }    
}
