/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author eo388
 */
public class GuesserOriginator {

    private final HashMap<ThreadCustomer, Integer> mementoMap;
    private final int min = 1;
    private final int max = 9;

    public GuesserOriginator() {
        mementoMap = new HashMap();
    }

    void joinGame(ThreadCustomer customer) {
        int num = ThreadLocalRandom.current().nextInt(min, max);
        mementoMap.putIfAbsent(customer, num);
        System.out.println(customer.getName() + " has joined the game.");
    }
    
    boolean guess(ThreadCustomer customer, int guess){
        System.out.println("Player " + customer.getName() + " guesses number: " + guess);
        int i = mementoMap.get(customer);
        
        if(i == guess){
            System.out.println("Player " + customer.getName() + " guessed right! :)");
            return true;
        }
        
        System.out.println("Player " + customer.getName() + " guessed wrong! :(");
        return false;
        
    }
}
