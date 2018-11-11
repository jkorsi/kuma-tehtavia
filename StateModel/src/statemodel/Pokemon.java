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
public interface Pokemon {
    
    public void attack();
    public void move();
    public void jump();
    public int getPoints();
    
    
    public void setEngine(GameEngine engine);
}
