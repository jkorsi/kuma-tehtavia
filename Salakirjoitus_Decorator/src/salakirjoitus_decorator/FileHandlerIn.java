/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salakirjoitus_decorator;

import java.util.ArrayList;

/**
 *
 * @author Juho Suni
 */
public interface FileHandlerIn {

    ArrayList<String> list = new ArrayList<String>();

    public void makeFile(String fileName);

    public void formatter(String fileName);

    public void writeData(String fileName, String dataToWrite);

    public void overWriteData(String fileName, String dataToWrite);

    public ArrayList<String> readData(String fileName);

}
