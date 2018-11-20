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
abstract public class BurgerRestaurant {
    protected Burger burger;

    public Burger getBurger() {
        System.out.println("Beef: "+burger.getBeef());
        System.out.println("Bread: "+burger.getBread());
        System.out.println("Salad: "+burger.getSalad());
        System.out.println("Sauce: "+burger.getSauce());
        return burger;
    }

    public void createBurger() {
        this.burger = new Burger();
    }
    
    public abstract void buildBread();
    public abstract void buildBeef();
    public abstract void buildSalad();
    public abstract void buildSauce();
    
}
