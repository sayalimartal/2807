import java.util.Scanner;
public class FindOccur {
public static void main(String args[])
{
	int i,count=0;
	String[] str=new String[50];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an array of strings");
	for(i=0;i<28;i++)
		str[i]=sc.nextLine();
	System.out.println("Enter the string to be checked");
	String check=sc.nextLine();
	for(i=0;i<20;i++) {
		if(check.equals(str[i]))
			count++;
	}
	System.out.println(count);
}
}
