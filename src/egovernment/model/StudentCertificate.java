/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.model;

import egovernment.interfaces.Service;
import java.util.Date;

/**
 *
 * @author Mehmet
 */
public class StudentCertificate implements Service{
    private String documentID;
    private String identityNo;
    private String explanation;
    private Date date;

    @Override
    public void create(String identity, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
