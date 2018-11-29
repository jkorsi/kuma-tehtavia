/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.time.LocalTime;

/**
 *
 * @author juhos
 */
public abstract class Hand implements Cloneable {
    LocalTime localTime;
    LocalTime modTime; 
    int hour;
    int minute;
    
    
    //Long l= new Long(10);  
    //int i=l.intValue();  
    public Hand() {
        localTime = LocalTime.now();
        modTime = localTime.minusHours(2);
    }
    @Override
    public Hand clone() throws CloneNotSupportedException{
        Hand hand = null;
        try{
            hand = (Hand)super.clone();
            hand.localTime = localTime;
            hand.modTime = modTime;
            return hand;
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }
    public void setHour(int i){
        hour = hour + i;
    }
}
