package com.yuvin.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Java8Predicate {
	
	 public static void main(String[] args) {

	        List<String> list = null; //Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        for(int i=0 ; i < list.size();i++) {
	        	System.out.println(list.get(i));	        	
	       }
	        
	        for(String i : list) {
	        	System.out.println(i);
	        }
	        //external loop
	        
	        //internal loop
	        list.forEach( i -> {
	        	System.out.println(i.concat(""));
	        	System.out.println(i);
	        });

	        // i -> input 
	        // System.out.println(i) -> body of lambda expression
	        
			/*
			 * list.forEach( new Consumer<Integer>(){ public void accept(Integer i) {
			 * System.out.println(); } });
			 */
	        
	    }

}
