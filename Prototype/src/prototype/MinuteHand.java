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
public class MinuteHand extends Hand implements Cloneable {

    public int getMinute(LocalTime lt) {
        lt = LocalTime.now();
        minute = lt.getMinute();
        return minute;
    }

    @Override
    public MinuteHand clone() throws CloneNotSupportedException {
        MinuteHand hand = null;
        try {
            hand = (MinuteHand) super.clone();
            hand.localTime = localTime;
            hand.modTime = modTime;
            return hand;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
