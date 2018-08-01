package com.subdirectory;

import java.io.File;
import java.util.Scanner;

public class findSubdirectories {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the directory name along with the path");
		String path=scanner.nextLine();
		File dir=new File(path);
		
		File[] subDirs=dir.listFiles((file) -> file.isDirectory()); 
		System.out.println("List of subdirectories in the given directory is");
		for(File file:subDirs) {
			System.out.println(file.getName());
		}
		
		System.out.println("*******************************");
		
		File[] subDirsMR=dir.listFiles(File::isDirectory); 
		System.out.println("List of subdirectories in the given directory is");
		for(File file:subDirsMR) {
			System.out.println(file.getName());
		}
	}
}
