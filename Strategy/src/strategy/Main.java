/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author juhos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Character> aList = new ArrayList();
        int min = 1;
        int max = 1000;
        long luku;
        byte[] bytes = new byte[5];
        for (int i = 0; i < 5; i++) {
            luku = ThreadLocalRandom.current().nextLong(min, max);           
            bytes[0] = (byte)luku;
            char data1 = (char)bytes[0];
            aList.add(data1);
        }
        
        ListConverter eka = new ListConverterRowAfterAll();
        ListConverter toka = new ListConverterRowAfterEverySecond();
        ListConverter kolmas = new ListConverterRowAfterEveryThird();
        
        System.out.println("Eka: " + eka.listToString(aList));
        System.out.println("Toka: " + toka.listToString(aList));
        System.out.println("Kolmas: " + kolmas.listToString(aList));
        
    }

}
