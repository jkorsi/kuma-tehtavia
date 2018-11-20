/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statemodel;

/**
 *
 * @author Juho Suni
 */
public class StateModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GameEngine engine = new GameEngine();
        BonusVisitor bonuser = new BonusVisitor();
        
        System.out.println(engine.getPokemonState());
        engine.attack();
        engine.jump();
        engine.accept(bonuser);
        System.out.println(engine.getPokemonState());
        engine.move();
        engine.attack();
        System.out.println(engine.getPokemonState());
        engine.attack();
        engine.accept(bonuser);
        engine.move();
        engine.attack();
        engine.move();
        System.out.println(engine.getPokemonState());
        engine.attack();
        engine.jump();
        engine.jump();
        engine.accept(bonuser);
        engine.jump();
        engine.attack();
        System.out.println(engine.getPokemonState());
                
        
    }

}
