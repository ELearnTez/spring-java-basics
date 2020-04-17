package com.yuvin.java.function.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) 
    { 
        // Creating predicate 
        java.util.function.Predicate<Integer> lesserthan = i -> (i < 18);  
  
        // Calling Predicate method 
        System.out.println(lesserthan.test(10));  
        
        
        //With Collection
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for(int i : list) {
        	if(i < 5) {
        		System.out.println(i);
        	}
        }
        
        
        
        list.forEach(i -> {
        	
        	Predicate<Integer> predicate =  p -> p < 5;
        	
        	if(predicate.test(i)) {
        		System.out.println(i);
        	}
        	
        });
    } 
}
