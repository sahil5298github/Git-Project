package com.velocity.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sahil");
		al.add("Arpit");
		al.add("Sumit");
		al.add("Harshit");
		al.add("Ram");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
