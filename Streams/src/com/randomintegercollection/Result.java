package com.randomintegercollection;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Result {

	public static void main(String[] args) throws IOException {
		
		File file=new File("boy.txt");
		
		PrintWriter printWriter=new PrintWriter(file);
		for(int i=0;i<100;i++)
		{
			Random random=new Random();
			printWriter.write(""+random.nextInt(50));
			printWriter.println();
		}
		printWriter.close();
		ArrayList<Integer> intList= new ArrayList<>(); 

		Scanner scanner=new Scanner(file);
		
		while(scanner.hasNextInt()) {
			intList.add(scanner.nextInt());
		}
		
		intList.stream().distinct().sorted().forEach(System.out::println);
	}

}
