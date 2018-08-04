//Determine if an integer is palindrome or not
import java.util.*;

class Palindrome
{
	public static void main(String args[])
	{
		int number,rev=0,d;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		number=scanner.nextInt();
		
		int copy=number;
		while(number>0)  //Find reverse of the number
		{
			d=number%10;
			rev=(rev*10)+d;
			number=number/10;
		}
		
		if(copy==rev)  //Display whether palindrome or not
		System.out.println("true");
		else
		System.out.println("false");
	}
}
