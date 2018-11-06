/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suunnittelumallit_observer;

import java.util.Observable;
import java.time.LocalTime;
import java.util.Observer;

/**
 *
 * Push- ja pull-mallit muutoksen selvittämiseksi:  Push: subjekti lähettää
 * yksityiskohtaisen tiedon muutoksesta updaten paramerina  Pull: observerit
 * kyselevät lisäinformaatiota  Kiinnostuksen kohteen rekisteröinti: 
 * rekisteröityessään subjektille observer ilmoittaa mistä muutoksista (Aspect)
 * se on kiinnostunut:
 *
 * void attach( Observer o, Aspect interest);  vastaavasti subjekti ilmoittaa
 * observerille muutoksen kohteen:
 *
 * void update( Subject s, Aspect interest);
 */
public class ClockTimer extends Observable {

    LocalTime localTime;
    Observer o;

    public ClockTimer() {
        localTime = LocalTime.now();
    }

    public int getHour() {
        return localTime.getHour();
    }

    public int getMinute() {
        return localTime.getMinute();
    }

    public int getSecond() {
        return localTime.getSecond();
    }

    ;
    void tick() throws InterruptedException {

        wait(1000);
        
        notify();

    }
}
