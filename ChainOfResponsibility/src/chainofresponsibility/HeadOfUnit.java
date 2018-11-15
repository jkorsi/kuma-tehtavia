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
class HeadOfUnit extends PayRise {

    private final double ALLOWABLE = BASE + 5;

    @Override
    public void processRequest(PayRiseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println(
                    "Head of unit will approve " + request.getAmount() + "%");
        } else if (successor != null) {
            successor.processRequest(request);
        }
    }
}
