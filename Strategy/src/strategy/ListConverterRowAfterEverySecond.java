/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author juhos
 */
public class ListConverterRowAfterEverySecond implements ListConverter {
    HashMap map;

    @Override
    public String listToString(List list) {
        map = listToHash(list);
        StringBuilder builder = new StringBuilder();
        
        for(int i = 0; i < map.size(); i++){
            builder.append(map.get(i));
            if(i%2==0){
                builder.append('\n');
            }
        }
         return builder.toString();
    }
    
    public HashMap listToHash(List list){
        HashMap rMap = new HashMap(list.size());
        for(int i = 0; i < list.size(); i++){            
            rMap.put(i, list.get(i)); 
        }
        return rMap;
    }
    
}
