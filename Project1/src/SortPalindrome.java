//Identify palindromes in input and sort in descending order of characters present in each input
import java.util.*;

public class SortPalindrome {
	public static void main(String args[]) {
		int i,j,position=0;
		int[] location=new int[10];
		String[] str=new String[10];

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 10 strings");
		for(i=0;i<10;i++)
			str[i]=scanner.nextLine(); //Input 10 strings
		
		for(i=0;i<10;i++)
		{
			StringBuffer strcopy =new StringBuffer(str[i]);
			StringBuffer strrev=strcopy.reverse();
			if(strrev.toString().equals(str[i])) { //If palindrome,store its position in array 'location'
				location[position]=i;
				position++;
			}
		}
		
		String[] strPalindrome=new String[position];
		for(i=0;i<position;i++)
			strPalindrome[i]=str[location[i]];  //Array of palindromes only 
		
		for(i=1;i<position;i++)
		{	
			String temp=strPalindrome[i];
			j=i-1;
			while(j>=0 && temp.length()>strPalindrome[j].length())  //Sort array in descending order of length of strings
			{
				strPalindrome[j+1]=strPalindrome[j];
				j--;	
			}
			strPalindrome[j+1]=temp;
		}
		
		System.out.println("Sorted palindromes are");
		for(i=0;i<position;i++)
			System.out.println(strPalindrome[i]);   //Display sorted palindromes
	}
}
