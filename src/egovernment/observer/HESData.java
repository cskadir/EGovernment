/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egovernment.observer;

import egovernment.interfaces.Observer;
import egovernment.interfaces.Subject;
import egovernment.model.HES;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kadir
 */
public class HESData implements Subject{
    
    private List<Observer> observer = new ArrayList();
    public HES hes;

    public HESData(HES hes) {
        this.hes = hes;
    }

    
    @Override
    public void registerObserver(Observer o) {
        this.observer.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observer.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        observer.forEach((observer) -> {
            observer.update(hes);
        });
    }
    
    public void hesCodeChanged(){
        
    }
    public void setHESCode(HES hes){
        this.hes=hes;
    }
    
    
    
}
