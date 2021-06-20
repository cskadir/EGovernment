/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment;

import egovernment.dao.UserDaoImplementation;
import egovernment.model.User;
import java.sql.SQLException;

/**
 *
 * @author kadir
 */
public class EGovernment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        UserDaoImplementation userDao = new UserDaoImplementation();
        
        //for test
        User user = new User();
        user.setIdentificationNo("1");
        user.setName("kadir");
        user.setSurname("korkmaaz");
        user.setPassword("123456");
        user.setFamilyCode("10");
        
        userDao.add(user);
    }
    
}
