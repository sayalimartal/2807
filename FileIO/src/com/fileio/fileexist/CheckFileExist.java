package com.fileio.fileexist;

import java.io.File;
import java.util.Scanner;

public class CheckFileExist {

	public static void main(String[] args) {
		
		System.out.println("Enter the file path");
		Scanner scanner=new Scanner(System.in);
		String path=scanner.nextLine();
		
		File file=new File(path);
		if(file.exists() && file.isFile())
			System.out.println("File exists");
		else
			System.out.println("File does not exist");

	}
}
