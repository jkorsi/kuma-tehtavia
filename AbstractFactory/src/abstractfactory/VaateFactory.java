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
public interface VaateFactory {
    
    public abstract Housut makeHousut();
    public abstract Paita makePaita();
    public abstract Kengat makeKengat();
    public abstract Paahine makePaahine();
}
