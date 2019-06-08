/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s206e12
 */
public class CountOccurrences implements CountOccurrencesInt{
    
    public List<String> countOccurrences(List<Integer> list){
     List<String> result = new ArrayList<>();
     Integer lastOne = null;
     int count = 0;
     
        for (Integer integer : list) {
                        
            if(lastOne == null){
                lastOne = integer;
                count++;
            }else{
                if(lastOne.equals(integer)){
                    count++;
                }else{
                    result.add(lastOne +  (count > 1 ? ":" + count : ""));
                    lastOne = integer;
                    count = 1;
                }
            }            
        }
        
        //Add the last element of the list 
        result.add(lastOne +  (count > 1 ? ":" + count : ""));
                 
        String a;
        
     return result;
    }
        
}
