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
class Supervisor extends PayRise {

    private final double ALLOWABLE = BASE + 2;

    @Override
    public void processRequest(PayRiseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println(
                    "Supervisor will approve " + request.getAmount() + "%.");
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
