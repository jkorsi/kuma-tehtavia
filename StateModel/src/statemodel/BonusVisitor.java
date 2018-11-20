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
public class BonusVisitor implements Visitor {

    @Override
    public int addBonusPoints(Charmander charmander) {

        int points = charmander.getPoints();
        System.out.println("We got some bonuses! Score before bonus: " + points);
        points += 1;
        System.out.println("Score after bonuses: " + points);

        return points;
    }

    @Override
    public int addBonusPoints(Charmeleon charmeleon) {
        int points = charmeleon.getPoints();
        System.out.println("We got some bonuses! Score before bonus: " + points);
        points += 2;
        System.out.println("Score after bonuses: " + points);
        return points;
    }

    @Override
    public int addBonusPoints(Charizard charizard) {
        int points = charizard.getPoints();
        System.out.println("We got some bonuses! Score before bonus: " + points);
        points += 3;
        System.out.println("Score after bonuses: " + points);
        return points;
    }
}
