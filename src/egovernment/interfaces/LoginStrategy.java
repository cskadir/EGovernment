/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.interfaces;

/**
 *
 * @author Mehmet
 */
public interface LoginStrategy {
    
    public boolean login(String identificationNo,String pass);
    
}
