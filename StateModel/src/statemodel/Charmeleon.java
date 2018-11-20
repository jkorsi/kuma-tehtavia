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
public class Charmeleon implements Pokemon{
    GameEngine engine;
    int points = 5;
    int speed = 5;
    int power = 5;

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
            points += 2;
        }
    }

    @Override
    public void move() {
         if (checkState()) {
            points += 2;
        }
    }

    @Override
    public void jump() {
         if (checkState()) {
            points += 2;
        }
    }
    @Override
    public String toString(){
      return "Charmeleon";
   }

    @Override
    public int getPoints(){
        return points;
    }
    private boolean checkState() {
        boolean boo = true;
        if (points >= 10) {
            boo = false;
            engine.setPokemonState(new Charizard());
            engine.attack();

        }
        return boo;
    }
    @Override
    public void accept(BonusVisitor visitor){
        
        visitor.addBonusPoints(this);
    }
}
