/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.decorator;

import egovernment.interfaces.Service;

/**
 *
 * @author Mehmet
 */
public class ValidityDateServiceDecorator extends ServiceDecorator{

    public ValidityDateServiceDecorator(Service myService) {
        super(myService);
    }

    @Override
    public void show() {
        super.show(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void create(String identity, Object o) {
        
        super.create(identity, o); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void addValidityDate(){
        
    }
    
    
    
}
