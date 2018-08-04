//Find if element is present in multi-dimensional array
import java.util.Scanner;

public class MultiDimensionalArray {
	public static void main(String args[]) {
		int i,j,dimensionA,dimensionB,search,flag=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array dimensions");
		dimensionA=scanner.nextInt();  //Input array dimensions
		dimensionB=scanner.nextInt();
		
		System.out.println("Enter the array elements");
		int[][] mulDim=new int[dimensionA][dimensionB];
		for(i=0;i<dimensionA;i++)
		{
			for(j=0;j<dimensionB;j++)
				mulDim[i][j]=scanner.nextInt();  //Input array elements
		}
		
		System.out.println("Enter the element to be searched");
		search=scanner.nextInt();  //Input element to be searched
		
		for(i=0;i<dimensionA;i++)
		{
			for(j=0;j<dimensionB;j++)
				if(mulDim[i][j]==search)
				{
					//If element present, display its position and stop search
					System.out.println("Element "+search+" present in the multi-dimesional array at dimensions "+dimensionA+","+dimensionB);
					flag=1;
					break;
				}
		}
		
		if(flag==0)  //Display if element not present in array
			System.out.println("Element not found in the multi-dimesional array");	
	}
}
