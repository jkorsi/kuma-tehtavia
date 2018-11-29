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
public class HourHand extends Hand implements Cloneable {
    
    public int getHour(LocalTime lt) {
        lt = LocalTime.now();
        hour = lt.getHour();
        return hour;
    }
    
    @Override
    public HourHand clone() throws CloneNotSupportedException{
        HourHand hand = null;
        try{
            hand = (HourHand)super.clone();
            hand.localTime = localTime;
            hand.modTime = modTime;
            return hand;
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }
}
