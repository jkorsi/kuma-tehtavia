/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author juhos
 */
public class ChristmasLight {
    private boolean powerOn = false;


    public void turnOn() {
        System.out.println("The light is on");
        powerOn = true;
    }

    public void turnOff() {
        System.out.println("The light is off");
        powerOn = false;
    }
    
    public void turnRed(){
        if(powerOn){
            System.out.println("Light is now red");
        }else{
            System.out.println("Can't change color, light is off.");
        }
    }
}
