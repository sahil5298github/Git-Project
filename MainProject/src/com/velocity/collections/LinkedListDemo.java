package com.velocity.collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Sahil");
		list.add("Arpit");
		list.add("Sumit");
		list.add("Harshit");
		list.add("Ram");

		for (String str : list) {
			System.out.println(str);
		}
	}
}
