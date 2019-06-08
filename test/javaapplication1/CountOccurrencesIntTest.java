/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.List;
import java.util.stream.Collectors;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

/**
 *
 * @author s206e12
 */
public class CountOccurrencesIntTest {
    
    public CountOccurrencesIntTest() {
    }

    /**
     * Test of countOccurrences method, of class CountOccurrencesInt.
     */
    @Test
    public void testCountOccurrences() {
        System.out.println("countOccurrences");
        int arr[] = { 7,7,5,5,5,2,3};
        String exp[] = { "7:2", "5:3", "2", "3"};
        List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());
        CountOccurrencesInt instance = new CountOccurrences();
        List<String> expResult = Arrays.stream(exp).collect(Collectors.toList());;
        List<String> result = instance.countOccurrences(list);
        assertEquals(expResult, result);
    }
    
    
     @Test
    public void testCountOccurrences1() {
        System.out.println("countOccurrences");
        int arr[] = { 7,7,7,7,5,5,4,4,5,2,3,3};
        String exp[] = { "7:4", "5:2", "4:2", "5", "2", "3:2"};
        List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());
        CountOccurrencesInt instance = new CountOccurrences();
        List<String> expResult = Arrays.stream(exp).collect(Collectors.toList());;
        List<String> result = instance.countOccurrences(list);
        assertEquals(expResult, result);
    }


    
}
