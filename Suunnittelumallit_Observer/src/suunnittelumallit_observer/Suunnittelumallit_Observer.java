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
public class Suunnittelumallit_Observer {

    /**
     * @param args the command line arguments
     *
     *
     * Observer: Toteuta luentomateriaalissa (Observer.pdf) Observer-mallin
     * sovelluksena esitetty hahmotelma digitaalisesta kellosta Javalla
     * täydentäen koodia puuttuvin osin. Käytä ratkaisussasi Javan APIsta
     * löytyviä Observer-rajapintaa ja Observable-luokkaa
     *
     */
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock clock = new DigitalClock(timer);
        
         clock.update(timer, args);
        

        //timer.addObserver(clock);
    }

}
