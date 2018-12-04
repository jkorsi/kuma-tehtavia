/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadediterator;

import static java.lang.Thread.sleep;

/**
 *
 * @author juhos
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        IteratorThread sanaThr = new IteratorThread("sana");
        IteratorThread makkaraThr = new IteratorThread("makkara");

        makkaraThr.setIteratorX(sanaThr.getIteratorX());

        Thread thr1 = new Thread(sanaThr);

        thr1.start();
        sleep(500);
        thr1.stop();

        sanaThr.lista.add(5, "hajoaaaaaaaaako");

        Thread thr2 = new Thread(makkaraThr);

        thr2.start();

    }

}
