package salakirjoitus_decorator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Juho Suni
 *
 * Class includes:
 *
 * (1. a) makeFile(filename ), calls formatter -->b) formatter((filename + path)
 *
 * (2. addData(Formatter, string1)
 *
 * (3. readData(Scanner), returns ArrayList of Strings in this implementation
 *
 */
public class BasicFileHandler implements FileHandlerIn {

    String data;

    public BasicFileHandler() {
        
    }

    @Override
    public void makeFile(String fileName) {

        try (FileWriter fWriter = new FileWriter(fileName);
                BufferedWriter bWriter = new BufferedWriter(fWriter);
                PrintWriter pWriter = new PrintWriter(bWriter)) {

            pWriter.print("");
            //NotifyBox.alertBox("File and path added to list", "File and path added to list."); 
            pWriter.flush();
            pWriter.close();

        } catch (Exception e) {
            NotifyBox.alertBox("Writing to a text file failed", "Sorry, but writing to the file failed.");
        }
    }

    //file creation
    @Override
    public void formatter(String fileName) {

        final Formatter makeFile;

        try {

            System.out.println(fileName);
            makeFile = new Formatter(fileName);

            NotifyBox.alertBox("File made", "File has been made!");
            makeFile.close();

        } catch (FileNotFoundException ex) {

            NotifyBox.alertBox("File not made", "File could not be made...");

        }

    }

    @Override
    public void writeData(String fileName, String dataToWrite) {       
        try (FileWriter fWriter = new FileWriter(fileName, true);
                BufferedWriter bWriter = new BufferedWriter(fWriter);
                PrintWriter pWriter = new PrintWriter(bWriter)) {

            if ("".equals(dataToWrite)) {
                System.out.println("Sorry, nothing to add here");
            } else if (1 <= dataToWrite.length()) {
                //The actual data is written here
                pWriter.print("<end>" + dataToWrite);

            } else {
                System.out.println("Nothing to write... Please add something to write! :)");
            }

            //NotifyBox.alertBox("File and path added to list", "File and path added to list."); 
            pWriter.flush();
            pWriter.close();

        } catch (Exception e) {
            NotifyBox.alertBox("Writing to a text file failed", "Sorry, but writing to the file failed.");
        }

    }

    

    @Override
    public void overWriteData(String fileName, String dataToWrite) {

        //Add true to FileWriter arguments for appending instead of overwriting
        try (FileWriter fWriter = new FileWriter(fileName);
                BufferedWriter bWriter = new BufferedWriter(fWriter);
                PrintWriter pWriter = new PrintWriter(bWriter)) {
            if ("".equals(dataToWrite)) {
                System.out.println("Sry nothing to add here");
            } else if (1 <= dataToWrite.length()) {
                //Finally the data is written
                pWriter.print("<end>" + dataToWrite);
            } else {
                System.out.println("Nothing to write here... Terveisin: overWriteData");
            }

            //NotifyBox.alertBox("File and path added to list", "File and path added to list."); 
            pWriter.flush();
            pWriter.close();

        } catch (Exception e) {
            NotifyBox.alertBox("Overwriting to a text file failed", "Sorry, but overwriting to the file failed.");
            System.out.println("Error code: " + e);
        }

    }

    //Read from a scanner, add pathObj to a list, and return the list
    @Override
    public ArrayList<String> readData(String fileName) {

        final Scanner reader;
        String workingFile = fileName;

        ArrayList<String> strList = new ArrayList<>();
        int i = 0;

        try {
            reader = new Scanner(new File(workingFile)).useDelimiter("<end>");

            while (reader.hasNext()) {
                //String strToList = new String();
                String a = reader.next();
 

                if (!"".equals(a)) {
                    strList.add(a);
                }

                i = i + 1;

               //debug
               //System.out.println(i + ". Iteraatio");
               //System.out.printf("Current obejct: " + "%s \n", a);

            }
            reader.close();

        } catch (FileNotFoundException ex) {
            NotifyBox.alertBox("File could not be read", "Sorry, but the file could not be read");
        }
        return strList;
    }

}
