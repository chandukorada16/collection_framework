package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListClass {
	/*
	 * ArrayList:- ->Implementation class Of List Interface ->Internal Datastructure
	 * Is Growable Array ->Insertion Order is Preserved ->Null Values are accepted
	 * ->Duplicates are Allowed ->Default Capacity is 10 ->Best for Retrieval Operations beacuse it will retrive based on index only
	 * Retrieve Constructors:- ArrayList al=new ArrayList(); ArrayList al=new
	 * ArrayList(int capacity); ArrayList al=new ArrayList(Collection c);
	 * 
	 * Methods:- add(Object o) addAll(Collection c) remove(Object o) removeAll()
	 * size(),clear(),contains(),containsAll(),equals();
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(15);
		list.add(15);
		list.add(15);
		list.add(15);
		list.add(15);
		list.add(15);
		list.add(15);
		list.add(15);
		list.add(15);
		list.add(15);
		list.add(15);
		list.add(15);
		

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ListIterator li = list.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		while (li.hasPrevious()) {
			System.out.println(li.next());
		}

	}

}
