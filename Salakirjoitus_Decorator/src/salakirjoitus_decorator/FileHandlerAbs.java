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
public abstract class FileHandlerAbs implements FileHandlerIn {
    FileHandlerIn handler;
    
    public FileHandlerAbs(FileHandlerIn aHandler){
        this.handler = aHandler;
    }
    
    @Override
    public abstract void makeFile(String fileName);

    //file creation
    @Override
    public abstract void formatter(String fileName);

    @Override
    public abstract void writeData(String fileName, String dataToWrite);

    @Override
    public abstract void overWriteData(String fileName, String dataToWrite);

    //Read from a scanner, add pathObj to a list, and return the list
    @Override
    public abstract ArrayList<String> readData(String fileName);
    
}
