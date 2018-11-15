/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author eo388
 */
public class MementoCaretaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadCustomer a = new ThreadCustomer("a");
        
        GuesserOriginator gesr = new GuesserOriginator();
        gesr.joinGame(a);
        
        gesr.guess(a, 1);
        gesr.guess(a, 2);
        gesr.guess(a, 3);
        gesr.guess(a, 4);
        gesr.guess(a, 5);
        gesr.guess(a, 6);
        gesr.guess(a, 7);
        gesr.guess(a, 8);
        gesr.guess(a, 9);
        
        
    }
    
}
