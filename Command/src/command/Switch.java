/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juhos
 */
/**
 * The Invoker class
 */
public class Switch {

    private final List<Command> history = new ArrayList<>();

    public void storeAndExecute(final Command cmd) {
        this.history.add(cmd); // optional
        cmd.execute();
    }

    public void undo() {
        this.history.get(history.size()-1).unExcecute();
        this.history.remove(history.size()-1);
    }
}
