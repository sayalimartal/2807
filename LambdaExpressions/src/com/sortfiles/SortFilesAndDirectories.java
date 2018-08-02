package com.sortfiles;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class SortFilesAndDirectories {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		ArrayList<File> files=new ArrayList<>();
		System.out.println("Enter directory name along with the path");
		String path=scanner.nextLine();
		File dir=new File(path);
		
		File[] file=dir.listFiles();
		
		files.addAll(Arrays.asList(file));
		Predicate<File> findDirectories = (fileInList) -> fileInList.isDirectory();
		
		files.stream().filter(findDirectories).sorted().forEach(System.out::println);	
		files.stream().filter(findDirectories.negate()).sorted().forEach(System.out::println);
		scanner.close();
	}
}
