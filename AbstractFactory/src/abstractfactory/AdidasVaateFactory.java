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
public class AdidasVaateFactory implements VaateFactory {

    @Override
    public Paahine makePaahine() {
        
        return new AdidasPaahine();
    }

    @Override
    public Housut makeHousut() {
        
        return new AdidasHousut();
    }

    @Override
    public Kengat makeKengat() {
        
        return new AdidasKengat();
    }

    @Override
    public Paita makePaita() {
        
        return new AdidasPaita();
    }

}
