/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;

/**
 *
 * @author eo388
 */
/*12. Proxy:
-Laajenna Wikipediassa olevan Proxy-esimerkkiä  http://en.wikipedia.org/wiki/Proxy_pattern siten, 
että lisäät Image-rajapintaan showData()-metodin, joka näyttää kuvan nimen. 
-Lisää pääohjelmaan valokuvakansio (esim. List-rakenne), johon lisäät valokuvia proxyinä. 
-Tulosta pääohjelmassa tiedot valokuvakansion sisällöstä (kuvia ei ladata). 
-Esitä myös kuinka valokuvakansiota voidaan selata (kuvat ladataan, ellei vielä ole ladattu).
 */
public class Proxy {

    final static ArrayList<Image> imageList = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Image a = new ProxyImage("tiedosto");
        Image b = new ProxyImage("tiedosto1");
        Image c = new ProxyImage("tiedosto2");
        Image d = new ProxyImage("tiedosto3");
        imageList.add(a);
        imageList.add(b);
        imageList.add(c);
        imageList.add(d);
        imageDataIterator();
        imageShowIterator();

    }
    

    static void imageDataIterator() {
        int i = 0;
        imageList.forEach((Image p) -> {
            
            System.out.println("Kuvan nimi: " + p.showData());           
        });
    }
    static void imageShowIterator(){
        imageList.forEach((k) -> {
            k.displayImage();
        });
    }

}
