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
public class Charizard implements Pokemon{
    GameEngine engine;
    int points = 10;
    int speed = 10;
    int power = 10;

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
            points += 3;       
    }

    @Override
    public void move() {
        points += 3;
    }

    @Override
    public void jump() {
        points += 3;
    }
    
    
    @Override
    public String toString(){
      return "Charizard";
   }

    @Override
    public int getPoints(){
        return points;
    }
    
}
