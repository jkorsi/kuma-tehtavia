/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Juho Suni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kotelo kotelo = new Kotelo();
        Emolevy emolevy = new Emolevy();
        kotelo.addLaite(emolevy);
        
        Suoritin suoritin = new Suoritin();
        kotelo.addLaite(suoritin);
        emolevy.addLaite(suoritin);
        
        Näytönohjain näytönohjain = new Näytönohjain();
        kotelo.addLaite(näytönohjain);
        emolevy.addLaite(näytönohjain);
        
        Virtalähde virtalähde = new Virtalähde();
        kotelo.addLaite(virtalähde);
        
        Keskusmuisti keskusmuisti = new Keskusmuisti();
        kotelo.addLaite(keskusmuisti);
        emolevy.addLaite(keskusmuisti);
        
        Tallennuslevy tallennuslevy = new Tallennuslevy();
        kotelo.addLaite(tallennuslevy);
        emolevy.addLaite(tallennuslevy);
        
        System.out.println("Emolevyn koostehinta: " + emolevy.hinta);
        System.out.println("Kotelon koostehinta: " + kotelo.hinta);
    }
    
}
