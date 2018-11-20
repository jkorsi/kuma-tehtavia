/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author eo388
 */
public class MeatBurgerRestaurant extends BurgerRestaurant {
    StringBuilder sB = new StringBuilder();
    
    @Override
    public void buildBread() {
        burger.setBread("Bun bread");
    }
    
    @Override
    public void buildBeef() {
        burger.setBeef("Greasy beef");
    }
    
    @Override
    public void buildSalad() {
        burger.setSalad("Pickle");
    }
    
    @Override
    public void buildSauce() {
        burger.setSauce("Cheese mayonnaise");
    }
    
}
