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
public class VegeBurgerRestaurant extends BurgerRestaurant {

    @Override
    public void buildBread() {
        burger.setBread("Rye bread");
    }

    @Override
    public void buildBeef() {
        burger.setBeef("Juicy tofu steak");
    }

    @Override
    public void buildSalad() {
        burger.setSalad("Rucola");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Hummus");
    }
}
