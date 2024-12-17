package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDemo  {
	public static void main(String[] args) {
	
	List<Employee> list=new ArrayList<>();
	list.add(new Employee(102, "Chandu", 15250.00));
	list.add(new Employee(101, "Harsha", 45865.00));
	list.add(new Employee(104, "Naveen", 35987.00));
	list.add(new Employee(105, "Ntr", 98756.00));
	
//	Collections.sort(list, new EmployeeIdComparator());
//	Collections.sort(list,new EmployeeNameComparator());
	
	
	for(Employee emp:list) {
		System.out.println(emp);
	}
	
	}
	
	
		
		


}
