package com.yuvin.java.interface_demo;

import java.util.ArrayList;
import java.util.List;

public class Java7 {
	
	public static void main(String[] args) {
		List<Employee> employees = employees();
		
		for(Employee emp:employees) {
			System.out.println(emp);
		}
		
		List<Employee>  fifteenPercentageEmployees= employees();
		List<Employee> tenPercentageEmployees = employees();
		List<Employee> fivePercentageEmployees = employees();
		
		for(Employee emp:employees) {
			
			if(emp.getSalary() <=10000) {
				int salary = emp.getSalary();
				int increment = (int)(salary *(15/100.0f));
				emp.setSalary(salary+increment);
				fifteenPercentageEmployees.add(emp);
				
			}
			else if(emp.getSalary() > 10000 && emp.getSalary() <= 20000 ){
				int salary = emp.getSalary();
				int increment = (int)(salary *(10/100.0f));
				emp.setSalary(salary+increment);
				tenPercentageEmployees.add(emp);
			}
			else {
				int salary = emp.getSalary();
				int increment = (int)(salary *(5/100.0f));
				emp.setSalary(salary+increment);
				fivePercentageEmployees.add(emp);
			}
			
		}
		
		//15% hike employees
		for(Employee emp:fifteenPercentageEmployees) {
			System.out.println(emp);
		}
		
		//10% hike employees
		for(Employee emp:tenPercentageEmployees) {
			System.out.println(emp);
		}
		
		//5% hike employees
		for(Employee emp:fivePercentageEmployees) {
			System.out.println(emp);
		}
		
	}
	
	private static List<Employee> employees(){
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "Sunil Manaka", 10000));
		employees.add(new Employee(1, "James", 12000));
		employees.add(new Employee(1, "Adam", 15000));
		employees.add(new Employee(1, "Sunil Manaka", 9000));
		employees.add(new Employee(1, "Sunil Manaka", 21000));
		
		return employees;
		
	}

	//70 lines -> 10 lines
	
}
