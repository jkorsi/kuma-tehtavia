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
public class Charmander implements Pokemon {

    GameEngine engine;
    int points = 0;
    int speed = 3;
    int power = 3;

    public GameEngine getEngine() {
        return engine;
    }

    @Override
    public void setEngine(GameEngine engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void attack() {
        if (checkState()) {
            points += 1;
        }
    }

    @Override
    public void move() {
        if (checkState()) {
            points += 1;
        }
    }

    @Override
    public void jump() {
        if (checkState()) {
            points += 1;
        }
    }

    @Override
    public String toString() {
        return "Charmander";
    }

    @Override
    public int getPoints() {
        return points;
    }

    //<       >
    private boolean checkState() {
        boolean boo = true;
        if (points >= 3) {
            boo = false;
            engine.setPokemonState(new Charmeleon());
            engine.attack();

        }
        return boo;
    }

}
