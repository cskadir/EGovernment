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
public class ServiceDecorator implements Service{
    protected Service myService;

    public ServiceDecorator(Service myService) {
        this.myService = myService;
    }
    
    @Override
    public void create(String identity, Object o) {
        myService.create(identity, o);
    }

    @Override
    public void show() {
        myService.show();
    }
    
}
