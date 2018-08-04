//Reverse the order of characters in each word
import java.util.*;

class StringRev
{
	public static void main(String args[])
	{
		int i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scanner.nextLine();
		
		String[] strcopy=str.split(" "); //Separate the words in the sentence and store in a String array
		int len=strcopy.length;
		
		for(i=0;i<len;i++)
		{
			StringBuffer s =new StringBuffer(strcopy[i]);
			System.out.print(s.reverse()+" ");  //Reverse each word
		}
	}
}		
