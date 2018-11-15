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
class GeneralManager extends PayRise {

    private final double ALLOWABLE = BASE + 10;

    @Override
    public void processRequest(PayRiseRequest request) {
        if (request.getAmount() < ALLOWABLE) {
            System.out.println(
                    "President will approve " + request.getAmount()+ "%.");
        } else {
            System.out.println("Your request for "
                    + request.getAmount()+ "% pay rise" + " needs a board meeting!");
        }
    }
}
