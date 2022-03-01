package com.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapsDemo {

	public static void main(String[] args) {
		//hash map
		HashMap<Integer, String> studetail = new HashMap<>();
		System.out.println("HashMap: ");
		studetail.put(101, "vivek");
		studetail.put(102, "pratap");
		studetail.put(103, "parul");
		studetail.put(103, "sandeep");
		studetail.put(105, "saksham");
		
		for(int key: studetail.keySet()) {
			System.out.println(studetail.get(key));
		}
		
		// linked hashmap
		LinkedHashMap<Integer, String> studetail2 = new LinkedHashMap<>();
		System.out.println("\nLinkedHashMap: ");
		studetail2.put(101, "vivek");
		studetail2.put(102, "pratap");
		studetail2.put(103, "parul");
		studetail2.put(103, "sandeep");
		studetail2.put(105, "saksham");
		
		for(int key: studetail2.keySet()) {
			System.out.println(studetail2.get(key));
		}

	}

}
