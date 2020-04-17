package com.yuvin.java.function.compare;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest {

	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();
		List<Employee> emps = service.getEmployess();
		

		System.out.println("Before Sort");
		for (Employee developer : emps) {
			System.out.println(developer);
		}
		
		
		//lambda here!
		emps.sort(( o1,  o2) ->  o1.getAge() - o2.getAge());
		
		System.out.println("After Sort");
		for (Employee developer : emps) {
			System.out.println(developer);
		}
			
		//java 8 only, lambda also, to print the List
		emps.forEach( emp->System.out.println(emp) );
		
	}
	
	
	

	
}
