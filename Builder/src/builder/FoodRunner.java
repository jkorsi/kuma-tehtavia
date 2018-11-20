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
public class FoodRunner {
    private BurgerRestaurant burgerRestaurant;
    
    public void setBugerRestaurant(BurgerRestaurant bR){
        burgerRestaurant = bR;
    }

    public Burger getBurger() {
        return burgerRestaurant.getBurger();
    }
    
    public void makeBurger(){
        burgerRestaurant.createBurger();
        burgerRestaurant.buildBread();
        burgerRestaurant.buildBeef();
        burgerRestaurant.buildSalad();
        burgerRestaurant.buildSauce();
    }
}
