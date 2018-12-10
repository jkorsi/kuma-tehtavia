/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;

/**
 *
 * @author juhos
 */
public class ListConverterRowAfterEveryThird implements ListConverter{

    @Override
    public String listToString(List list) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            builder.append(list.get(i));
        }
        return builder.toString();
    }
    
}
