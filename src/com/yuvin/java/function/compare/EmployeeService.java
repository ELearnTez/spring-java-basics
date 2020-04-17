package com.yuvin.java.function.compare;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	
	
	public static List<Employee> getEmployess() {
		List<Employee> result = new ArrayList<>();
		result.add(new Employee("Eve", new BigDecimal("81000"), 31));
		result.add(new Employee("iris", new BigDecimal("170000"), 45));		
		result.add(new Employee("jason", new BigDecimal("100000"), 19));
		result.add(new Employee("Adom", new BigDecimal("79000"), 29));
		return result;
	}

}
