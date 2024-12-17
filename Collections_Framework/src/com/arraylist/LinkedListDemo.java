package com.arraylist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
		/*
		 * LinkedList:- ->Implementation class of List interface ->Duplicates are
		 * allowed ->Internal Data structure is Double Linkedlist ->Null values are
		 * allowed ->Insertion Order is maintained ->Best operations for access
		 * Constructors:- ->LinkedList ll=new LinkedList(); ->LinkedList ll=new
		 * LinkedList(int capacity); ->Linkedlist ll=new LinkedList(Collection c);
		 */
		List ll=new LinkedList();
		ll.add("Chandu");
		ll.add("Ramu");
		ll.add("Somu");
		System.out.println(ll);
		
		
	}

}
