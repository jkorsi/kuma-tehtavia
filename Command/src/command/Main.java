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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {

        final ChristmasLight lamp = new ChristmasLight();

        final Command switchUp = new FlipUpCommand(lamp);
        final Command switchDown = new FlipDownCommand(lamp);

        final Switch mySwitch = new Switch();

        mySwitch.storeAndExecute(switchUp);
        mySwitch.storeAndExecute(switchDown);
        mySwitch.undo();
        mySwitch.undo();

    }

}
