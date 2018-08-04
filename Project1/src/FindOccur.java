//Check if a name is present in an array of names
import java.util.Scanner;

public class FindOccur {
	public static void main(String args[]) {
		int i,count=0;
		String[] str=new String[50];  //Array of strings to store the names
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an array of strings");
		for(i=0;i<28;i++)
			str[i]=scanner.nextLine(); //Input the names in the array of strings
		System.out.println("Enter the string to be checked");
		String check=scanner.nextLine();   //Input the element to be checked
		
		for(i=0;i<20;i++) {
			if(check.equals(str[i]))
				count++;  //Increment count of occurrence if name found in array
		}
		System.out.println(count); //Display the count of occurrence
	}
}
