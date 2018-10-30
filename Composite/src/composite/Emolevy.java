/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juho Suni
 */
public class Emolevy implements Laiteosa{
    private List<Laiteosa> komponentit = new ArrayList<>();
    int hinta;
    public Emolevy() {
        this.hinta = 50;
    }

    
    void addLaite(Laiteosa osa){
        komponentit.add(osa);
        hinta = hinta + osa.getHinta();
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
