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
public class CryptingWriter_Main {

    static String aData = "fileN";
    static CryptoFileHandler crypter;
    static BasicFileHandler writer;
    static String fileName = "tiedosto.txt";

    public static void main(String[] args) {
        // TODO code application logic here

        printMenu();
    }

    private static void printMenu() {
        char select, select1;
        String data;
        setUp();

        do {

            System.out.println("\n\t\t\t1. Kirjoita");
            System.out.println("\t\t\t2. Salakirjoita");
            System.out.println("\t\t\t3. Lue normaali tiedosto");
            System.out.println("\t\t\t4. Lue Salattu tiedosto");
            System.out.println("\t\t\t5. Tyhjennä tiedosto");
            System.out.println("\t\t\t6. Lopeta");
            System.out.print("\n\n"); // tehdään tyhjiä rivejä
            select = Lue.merkki();
            switch (select) {
                case '1':
                    System.out.println("Anna teksti (merkkijono)");
                    data = Lue.rivi();
                    writer.writeData(fileName, data);
                    break;
                case '2':

                    data = Lue.rivi();

                    if (data == null) // ei valittu mitään
                    {
                        break;
                    } else {
                        crypter.writeData(fileName, data);
                    }

                    break;
                case '3':
                    ArrayList<String> strings = writer.readData(fileName);
                    strings.forEach((x) -> System.out.println(x));
                    break;
                case '4': 
                    ArrayList<String> cStrings = crypter.readData(fileName);
                    cStrings.forEach((x) -> System.out.println(x));
                    break;
                case '5':
                    writer.overWriteData(fileName, "");
                    break;

            }
            break;

        } while (select != '6');
    }

    private static void setUp() {
        CryptingWriter_Main.crypter = new CryptoFileHandler(new BasicFileHandler());
        CryptingWriter_Main.writer = new BasicFileHandler();
    }

}
