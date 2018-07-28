package com.collection;

import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		TreeSet<String> treeset=new TreeSet<>();
		
		treeset.add("Sayali");
		treeset.add("Siddhi");
		treeset.add("Nishad");
		treeset.add("Drishti");
		treeset.add("Anindya");
		
		treeset.stream().forEach((name) -> System.out.println(name));

	}

}
