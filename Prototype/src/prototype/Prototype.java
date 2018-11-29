/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.time.LocalTime;

/**
 *
 * @author eo388
 */
public class Prototype {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Clock orgClock = new Clock();
        Clock cloneClock = (Clock)orgClock.clone();
        System.out.println(orgClock.getTime());
        System.out.println(cloneClock.getTime());
        
        
        System.out.println(orgClock.getTime());
        System.out.println(cloneClock.getTime());
        
        
        
    }
    
}
