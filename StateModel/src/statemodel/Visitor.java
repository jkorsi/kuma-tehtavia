/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemodel;

/**
 *
 * @author eo388
 */
public interface Visitor {
    public int addBonusPoints(Charmander charmander);
    public int addBonusPoints(Charmeleon charmeleon);
    public int addBonusPoints(Charizard charizard);
    
}
