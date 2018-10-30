/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author eo388
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VaateFactory adidasTehdas = new AdidasVaateFactory();
        VaateFactory bossTehdas = new BossVaateFactory();
        
        Jasper oJ = new Jasper(adidasTehdas);
        System.out.println("Opiskelija Jasperin vaatteet ovat: " + oJ.housut + ", " + oJ.kengat + ", " + oJ.paahine + " ja " + oJ.paita + ".");
        
        Jasper iJ = new Jasper(bossTehdas);
        System.out.println("Insinööri Jasperin vaatteet ovat: " + iJ.housut + ", " + iJ.kengat + ", " + iJ.paahine + " ja " + iJ.paita + ".");
    }
    
    
    
}
