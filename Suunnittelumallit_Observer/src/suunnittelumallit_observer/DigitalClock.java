/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit_observer;

/**
 *
 * @author eo388
 */
import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

    private ClockTimer timer;

    public DigitalClock(ClockTimer ct) {
        timer = ct;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable s, Object arg) {
        if (s == timer) {
            draw();
        }
    }

    private void draw() {
        int hour = timer.getHour();
        int minutes = timer.getMinute();
        int seconds = timer.getSecond();
        System.out.println("Aika on: " + hour + " : " + minutes + " : " + seconds + ".");
    }

}
