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
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FoodRunner giveMeFood = new FoodRunner();
       BurgerRestaurant vegeBuiler = new VegeBurgerRestaurant();
       BurgerRestaurant meatBuiler = new MeatBurgerRestaurant();
       
       giveMeFood.setBugerRestaurant(meatBuiler);
       giveMeFood.makeBurger();
       
       Burger burger = giveMeFood.getBurger();
       
    }
    
}
