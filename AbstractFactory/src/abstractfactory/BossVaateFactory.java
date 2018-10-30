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
public class BossVaateFactory implements VaateFactory {
    @Override
    public Paahine makePaahine() {
        
        return new BossPaahine();
    }

    @Override
    public Housut makeHousut() {
        
        return new BossHousut();
    }

    @Override
    public Kengat makeKengat() {
        
        return new BossKengat();
    }

    @Override
    public Paita makePaita() {
        
        return new BossPaita();
    }



}
