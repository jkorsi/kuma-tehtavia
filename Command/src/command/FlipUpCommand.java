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
 * The Command for turning on the light - ConcreteCommand #1
 */
public class FlipUpCommand implements Command {

    private final ChristmasLight theLight;

    public FlipUpCommand(final ChristmasLight light) {
        this.theLight = light;
    }

    @Override    // Command
    public void execute() {
        theLight.turnOn();
    }

    @Override
    public void unExcecute() {
        theLight.turnOff();
    }
}
