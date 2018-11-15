/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author eo388
 */
public class ChainOfResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Supervisor superVisor = new Supervisor();
        HeadOfUnit headOfUnit = new HeadOfUnit();
        GeneralManager president = new GeneralManager();
        superVisor.setSuccessor(headOfUnit);
        headOfUnit.setSuccessor(president);
        
// Press Ctrl+C to end.
        try {
            while (true) {
                System.out.println("Enter the amount to check who should approve your pay rise.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                superVisor.processRequest(new PayRiseRequest(d, "General"));
            }
        } catch (IOException | NumberFormatException e) {
            System.exit(1);
        }
    }

}
