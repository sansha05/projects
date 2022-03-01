package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionDemo {

	public static void main(String[] args) {
		//using arraylist from collection framework
		ArrayList<String> cars = new ArrayList<>();
		cars.add("maruti");
		cars.add("Honda");
		cars.add("suzuki");
		cars.add("Hyundai");
		cars.add("Tata");
		cars.add("Mahindra");
		
		System.out.println("ArrayList:");
		for(String car: cars) {
			System.out.println(car);
		}
		
		// using linkedlist
		LinkedList<String> bikes = new LinkedList<>();
		bikes.add("Hero");
		bikes.add("Honda");
		bikes.add("pulser");
		bikes.add("TVS");
		bikes.add("Avenger");
		
		//iterating through linked list
		System.out.println("\nLinkedList:");
		for (String bike: bikes) {
			System.out.println(bike);
		}
		
		// using hashset
		HashSet<Integer> rollno = new HashSet<>();
		rollno.add(32);
		rollno.add(44);
		rollno.add(20);
		rollno.add(32);
		
		System.out.println("\nHashSet");
		for (int i: rollno) {
			System.out.println(i);
		}
		
		
		// using linkedhashset
		LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
		rollno.add(32);
		rollno.add(44);
		rollno.add(20);
		rollno.add(32);
		
		System.out.println("\nLinkedHashSet");
		for (int i: rollno) {
			System.out.println(i);
		}
		
		
		
		
		

	}

}
