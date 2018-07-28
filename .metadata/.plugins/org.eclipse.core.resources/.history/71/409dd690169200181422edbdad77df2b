package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		
		map.put("Sayali", "Apple");
		map.put("Siddhi", "Mango");
		map.put("Nishad", "Grapes");
		map.put("Drishti", "Watermelon");
		
		Set<Entry<String,String>> set= map.entrySet();
		
		set.stream().forEach((e) -> System.out.println(e.getKey()+" "+e.getValue()));
		
		Set keyset=map.keySet();
		System.out.println("Key set values are: "+keyset);
		
	}

}
