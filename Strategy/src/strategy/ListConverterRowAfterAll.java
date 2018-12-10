/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author juhos
 */
public class ListConverterRowAfterAll implements ListConverter {

    List<Character> aList;
    Iterator<Character> iterator;
    String word;

    @Override
    public String listToString(List list) {
        aList = list;
        iterator = aList.iterator();
        
        StringBuilder builder = new StringBuilder(list.size());
        
        while (iterator.hasNext()) {
            builder.append(iterator.next());
            builder.append('\n');
        }
        word = builder.toString();

        return word;
    }

}
