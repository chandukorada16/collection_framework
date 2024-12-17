package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student(102,"chandu",5));
		list.add(new Student(106,"harsha",3));
		list.add(new Student(101,"shiva",2));
		list.add(new Student(105,"akbar",1));
		
		Collections.sort(list);
		
		for(Student stu:list) {
			System.out.println(stu);
		}

	}

}
