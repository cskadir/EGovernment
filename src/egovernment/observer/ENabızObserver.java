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
public class ENabızObserver implements Observer{

    private HES hes;
    @Override
    public void update(HES hes) {
    }
    public void display (){
        this.hes=hes;
    }
    public void saveToMyStream(){
        System.out.println(hes.toString());
    }
    
}
