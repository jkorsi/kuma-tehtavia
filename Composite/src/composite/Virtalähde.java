/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Juho Suni
 */
public class Virtalähde implements Laiteosa {
int hinta;
    public Virtalähde() {
    this.hinta = 100;
    }

    @Override
    public void setHinta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getHinta() {
        return hinta;
    }
    
}
