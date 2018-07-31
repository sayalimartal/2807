package com.fileio.linecount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineCount {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the file path");
		Scanner scanner=new Scanner(System.in);
		String path=scanner.nextLine();
		
		BufferedReader reader =new BufferedReader(new FileReader(path));
		int lineCount=0;
		while(reader.readLine() != null)
			lineCount++;
		reader.close();
		System.out.println(lineCount);

	}

}
