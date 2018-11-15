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
abstract class PayRise {

    protected static final double BASE = 0;
    protected PayRise successor;

    public void setSuccessor(PayRise successor) {
        this.successor = successor;
    }

    abstract public void processRequest(PayRiseRequest request);
}
