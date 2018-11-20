/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.ArrayList;

/**
 *
 * @author eo388
 */
public class Burger {
    private Object bread = null;
    private Object beef = null;
    private Object salad = null;
    private Object sauce = null;
    
    public Burger(){
        
    }
    public Burger(ArrayList aL){
        
    }

    public Object getBread() {
        return bread;
    }

    public void setBread(Object bread) {
        this.bread = bread;
    }

    public Object getBeef() {
        return beef;
    }

    public void setBeef(Object beef) {
        this.beef = beef;
    }

    public Object getSalad() {
        return salad;
    }

    public void setSalad(Object salad) {
        this.salad = salad;
    }

    public Object getSauce() {
        return sauce;
    }

    public void setSauce(Object sauce) {
        this.sauce = sauce;
    }
    
    
}
