package com.whycollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WhyCollections {

	public static void main(String[] args) {
		
		/*
		 * Variable:-to store the data Datatypes:-to store specify type of data
		 * Datatypes are two types.They are 1.Primitive Data types 2.reference data
		 * types/non-primitive Primitive Datatypes:-Byte(0)(1 byte),Short(0)(2
		 * bytes),int(0)(4 bytes),long(0l)(8 bytes),float(0.0f)(4 bytes),double(0.0d)(8
		 * bytes),char(//uuff?)(2 bytes),boolean(false)(1 bit) Ex:-int a=10;String
		 * s="Chandu"; In variable we can store only one value. I want store 100 values
		 * 100 variables are required. I want to store 1000 values 1000 variables are
		 * required. It is not a good programming and take much time To Overcome this
		 * problem Array Concept introduced. Array is a Container which is used to
		 * stored homogeneous values. Arrays,Strings and classes are referenced
		 * datatypes. But arrays some disadvantages are there. Array size is Fixed and
		 * we can store same type of values only Object array was introduced but one
		 * problem was not fixed.that is Array has Fixed length. and we can perform
		 * insert,sort our own process To Overcome this Problems Collections are
		 * Introduced. cursors are three types they are1.Iterator 2.List iterator
		 * 3.Enumeration
		 */
		 
		List list=new ArrayList();
		list.add(15);
		list.add(45);
		list.add(58);
		list.add(889);
		list.add(578);
		list.add("Chandu");
		
		//Appraoach-1
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------------------------------------------");
		//Approach-2
		for(Object obj:list) {
			System.out.println(obj);
		}
		System.out.println("---------------------------------------------------");
		//Approach-3
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("----------------------------------------------------");
		
		ListIterator listiterator=list.listIterator();
		while(listiterator.hasNext()) {
			System.out.println(listiterator.next());
		}
		while(listiterator.hasPrevious()) {
			System.out.println(listiterator.previous());
		}
		System.out.println("ForEach--------------------------");
		
		//Approach-5
		list.forEach(i->System.out.println(i));
	}

}
