import java.util.Scanner;
public class RemoveDuplicate {
public static void main(String args[])
{
	int i,j;
	char[] str=new char[50];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	str=sc.next().toCharArray();
	int len=str.length;
	for(i=0;i<len;i++) {
		char c=str[i];
		for(j=i+1;j<len;j++)
		{
			if(c==str[j])
			str[j]=' ';
		}
	
	}
	String string=new String(str);
	string=string.replaceAll(" ","");
	System.out.println("String with duplicate characters removed is "+string);
}
}

