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
class PayRiseRequest {

    private double amount;
    private String purpose;

    public PayRiseRequest(double amount, String purpose) {
        this.amount = amount;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amt) {
        amount = amt;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String reason) {
        purpose = reason;
    }
}
