/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadediterator;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juhos
 */

/*

Thread STATES:

NEW – A thread that has not yet started is in this state.
RUNNABLE – A thread executing in the Java virtual machine is in this state.
BLOCKED – A thread that is blocked waiting for a monitor lock is in this state.
WAITING – A thread that is waiting indefinitely for another thread to perform a particular action is in this state.
TIMED_WAITING – A thread that is waiting for another thread to perform an action for up to a specified waiting time is in this state.
TERMINATED – A thread that has exited is in this state.

 */
public class IteratorThread implements Runnable {

    private String sana;
    public ArrayList<String> lista;
    private Iterator<String> iteratorX;

    public IteratorThread(String sana) {
        this.sana = sana;
        lista = fillArray(sana);
        iteratorX = lista.iterator();
    }

    @Override
    public void run() {
        try {
            IterateObject(lista);
            sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(IteratorThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<String> fillArray(String sana) {
        List<String> listaX = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listaX.add(sana + i);
        }
        return (ArrayList<String>) listaX;
    }

    public void IterateObject(List<String> lista) throws InterruptedException {

        if (iteratorX != null) {
            while (iteratorX.hasNext()) {
                System.out.println("Nykyinen iterator: " + sana);
                System.out.println(iteratorX.next());
                //Käytetään SLEEP-funktiota, jotta keretään helpommin
                //toteuttamaan muokkaustestejä/huomaamaan vaikutukset
                sleep(200);
            }
        }else{
            System.out.println("Iterator not initialized");
        }

    }

    public String getSana() {
        return sana;
    }

    public void setSana(String sana) {
        this.sana = sana;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    public Iterator<String> getIteratorX() {
        return iteratorX;
    }

    public void setIteratorX(Iterator<String> iteratorX) {
        this.iteratorX = iteratorX;
    }

}
