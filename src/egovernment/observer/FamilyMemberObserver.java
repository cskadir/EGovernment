/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.observer;

import egovernment.interfaces.Observer;
import egovernment.model.HES;

/**
 *
 * @author kadir
 */
public class FamilyMemberObserver implements Observer{
    private HES hes;

    @Override
    public void update(HES hes) {
        
        this.hes=hes;
    }
    public void display (){
        System.out.println(hes.toString());
        
    }
    
    
}
