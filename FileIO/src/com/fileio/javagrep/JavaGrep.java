package com.fileio.javagrep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaGrep {

	public static void main(String[] args) throws IOException {
		int lineCount=0,flag=0;
		
		System.out.println("Enter the file path");
		Scanner scanner=new Scanner(System.in);
		String path=scanner.nextLine();
		System.out.println("Enter the string to be searched");
		String string=scanner.nextLine();
		File file=new File(args[0]);
		BufferedReader b=new BufferedReader(new FileReader(path));
		String line;
		while((line=b.readLine()) != null) {
			lineCount++;
			if(line.contains(string)) {
				flag=1;
				System.out.println("Line number: "+lineCount+" Line: "+line);
			}
		}
		if(flag==0)
			System.out.println("String "+string+" not found");
	}
}
