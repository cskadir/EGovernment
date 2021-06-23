/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.strategy;

import egovernment.interfaces.LoginStrategy;

/**
 *
 * @author Mehmet
 */
public class LoginContext {
    private LoginStrategy loginStrategy;

    public LoginContext(LoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }
    
    public boolean login(String identificationNo,String pass){
      return loginStrategy.login(identificationNo, pass);
   }
}
