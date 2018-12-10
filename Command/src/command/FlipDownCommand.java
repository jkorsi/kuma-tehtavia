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
/**
 * The Command for turning off the light - ConcreteCommand #2
 */
public class FlipDownCommand implements Command {

    private final ChristmasLight theLight;

    public FlipDownCommand(final ChristmasLight light) {
        this.theLight = light;
    }

    @Override    // Command
    public void execute() {
        theLight.turnOff();
    }

    @Override
    public void unExcecute() {
        theLight.turnOn();
    }
}
