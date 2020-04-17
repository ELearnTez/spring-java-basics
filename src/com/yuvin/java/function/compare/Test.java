package com.yuvin.java.function.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	//Comparator
	public static void main(String[] args) {
		
		
		// toString() -> object to String
		// compareTo -> comapre Comp
		
		
	List<Integer> numbers = Arrays.asList(1,4,3,2, 7,6, 9);
		
	 numbers.forEach( i -> System.out.println(i) );
		
	/*Stream<Integer> stream = numbers.stream();
	   
	Function<Integer, Integer> doubleFunction = new Function<Integer, Integer>() {
										@Override
										public Integer apply(Integer t) {
											return t * t;
										}
									};
	   
	Stream<Integer> stream1 =  stream.map( doubleFunction );
	   
	List<Integer> updatedList =  stream1.collect(Collectors.toList());
	    
	System.out.println("------------------------------------");
	  
	updatedList.forEach(i -> System.out.println(i));*/
	
	//condition 
	
	//if() --> boolean 
	 
	 
	 Function<Integer, Integer> doubleFunction = t ->  t * t ;
	
		numbers
		.stream()
		.filter(t ->  t % 2 == 0 ? true : false)
		.map( doubleFunction )
		.sorted()
		.collect(Collectors.toList())
		.forEach(i -> System.out.println(i));
		
		numbers.forEach( i -> System.out.println(i) );
		
		// Amazon -> GST -> mobiles
		// Medical -> medicine 
		//Apple
		
		
	}
	
	// Java 1.8 ->  stream little poor 
	// Java 11 -> 
	//latest IDE
	
}
