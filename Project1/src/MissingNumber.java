//Find the missing number given an array of distinct numbers
import java.util.Scanner;

public class MissingNumber {
	public static void main(String args[])
	{
		int i,j,k=0,len,swap=0,minimum;
		int[] array=new int[10];
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		len=scanner.nextInt();
		System.out.println("Enter array elements");
		for(i=0;i<len;i++)
			array[i]=scanner.nextInt();
		
		minimum=array[0];
		for(i=0;i<len;i++) //Find the minimum value from the array elements
		{
			if(minimum>array[i])
				minimum=array[i];
		}
		
		for(i=0;i<len;i++)  //Sort the array in ascending order
		{
			for(j=i+1;j<len;j++)
			{
				if(array[j]<array[i])
				{
					swap=array[j];
					array[j]=array[i];
					array[i]=swap;	
				}
			}
		}
		
		int[] arrCopy=new int[len+1]; //New array that includes missing number
		for(i=0;i<len;i++)
		{
			arrCopy[i]=minimum;
			minimum++;
		}
		
		for(i=0;i<len;i++)
		{
			if(array[i]==arrCopy[k]) //Compare elements of two arrays 
			{
				k++;
				continue;
			}
			else                    // If elements are not equal, that value in new array is the missing number
			{
				System.out.println("Missing number is "+arrCopy[k]);
				break;
			}
		}
	}
}
