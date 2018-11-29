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
public class Clock implements Cloneable {
     LocalTime localTime;
     HourHand hourHand;
     MinuteHand minuteHand;
     int hour;
     int minute;
     String time;
     
     
     public Clock(){
         hourHand = new HourHand();
         minuteHand = new MinuteHand();
         hour = hourHand.getHour(localTime);
         minute = minuteHand.getMinute(localTime);
         time = String.valueOf(hour) +":"+ String.valueOf(minute);
     }
     public String getTime(){
         return time;
     }
     
     
     @Override
     public Clock clone() throws CloneNotSupportedException{
         Clock clock = null;
         try {
                clock = (Clock)super.clone();
                clock.hourHand = (HourHand)hourHand.clone();
                clock.minuteHand = (MinuteHand)minuteHand.clone();
                clock.hour = hourHand.getHour(localTime);
                clock.minute = minuteHand.getMinute(localTime);
                clock.time = String.valueOf(hour) +":"+ String.valueOf(minute);
                return clock;
                
         } catch (CloneNotSupportedException e) 
         { 
             e.printStackTrace(); 
         } 
         return null;
     }
     
     
}
