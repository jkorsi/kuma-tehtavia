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
public class Jasper {
  
    Housut housut;
    Kengat kengat;
    Paita paita;
    Paahine paahine;
    
    public Jasper(){      
    }
    
    public Jasper(VaateFactory tehdas){
        this.housut = tehdas.makeHousut();
        this.kengat = tehdas.makeKengat();
        this.paita = tehdas.makePaita();
        this.paahine = tehdas.makePaahine();
        
    }
   


    
}
