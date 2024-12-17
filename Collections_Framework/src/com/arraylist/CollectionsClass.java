package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(54);
		list.add(50);
		list.add(59);
		list.add(65);
		list.add(35);
		list.add(89);

		System.out.println("Before sort " + list);

		Collections.sort(list);

		System.out.println("After sort " + list);

		Collections.reverse(list);

		System.out.println("After reverse " + list);
	}

}
