//Remove duplicate characters from the word input
import java.util.Scanner;

public class RemoveDuplicate {
	public static void main(String args[]) {
		int i,j;
		char[] str=new char[50];
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		str=scanner.next().toCharArray(); //Store the string input in a character array
		
		int len=str.length;
		for(i=0;i<len;i++) {
			char c=str[i];
			for(j=i+1;j<len;j++)
			{
				if(c==str[j]) 
					str[j]=' '; //Replace all repeated characters with spaces
			}
		}
		
		String string=new String(str);
		string=string.replaceAll(" ","");  //Remove all spaces
		System.out.println("String with duplicate characters removed is "+string);
	}
}
