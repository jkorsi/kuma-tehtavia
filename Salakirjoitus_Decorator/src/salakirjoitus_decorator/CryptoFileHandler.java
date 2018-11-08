/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salakirjoitus_decorator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Juho Suni
 */
public class CryptoFileHandler extends FileHandlerAbs {

    public CryptoFileHandler(FileHandlerIn handler) {
        super(handler);
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
        String changedString = "";
        try {
            changedString = encrypt(dataToWrite, fileName);
        } catch (Exception ex) {
            Logger.getLogger(CryptoFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (FileWriter fWriter = new FileWriter(fileName, true);
                BufferedWriter bWriter = new BufferedWriter(fWriter);
                PrintWriter pWriter = new PrintWriter(bWriter)) {

            if ("".equals(changedString)) {
                System.out.println("Sorry, nothing to add here");
            } else if (1 <= changedString.length()) {
                //The actual data is written here
                pWriter.print("<end>" + changedString);

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
                String strToList;
                String a = reader.next();
                strToList = decrypt(a, fileName);

                if (!"".equals(strToList)) {
                    strList.add(strToList);
                }

                i = i + 1;

                //debug
                System.out.println(i + ". Iteraatio");
                System.out.printf("Current obejct: " + "%s \n", strToList);

            }
            reader.close();

        } catch (FileNotFoundException ex) {
            NotifyBox.alertBox("File could not be read", "Sorry, but the file could not be read");
        } catch (Exception ex) {
            Logger.getLogger(CryptoFileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return strList;
    }

    //Encryption methods from: http://www.adeveloperdiary.com/java/how-to-easily-encrypt-and-decrypt-text-in-java/
    public static String encrypt(String strClearText, String strKey) throws Exception {
        String strData = "";

        try {
            SecretKeySpec skeyspec = new SecretKeySpec(strKey.getBytes(), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, skeyspec);
            byte[] encrypted = cipher.doFinal(strClearText.getBytes());
            strData = new String(encrypted);

        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new Exception(e);
        }
        return strData;
    }

    public static String decrypt(String strEncrypted, String strKey) throws Exception {
        String strData = "";

        try {
            SecretKeySpec skeyspec = new SecretKeySpec(strKey.getBytes(), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.DECRYPT_MODE, skeyspec);
            byte[] decrypted = cipher.doFinal(strEncrypted.getBytes());
            strData = new String(decrypted);

        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new Exception(e);
        }
        return strData;
    }

}
