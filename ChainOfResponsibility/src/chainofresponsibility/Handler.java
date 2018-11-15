/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author eo388
 */
public abstract class Handler {

    private Handler successor;

    public Handler(Handler s) {

        successor = s;
    }

    public void handle() {
        if (successor != null) {
            successor.handle();
        }
    }

}
