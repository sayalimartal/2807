package com.collection;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<String> linkedhashset=new LinkedHashSet<>();
		
		linkedhashset.add("Sayali");
		linkedhashset.add("Siddhi");
		linkedhashset.add("Nishad");
		linkedhashset.add("Drishti");
		linkedhashset.add("Anindya");
		
		linkedhashset.stream().forEach((name) -> System.out.println(name));
	}

}
