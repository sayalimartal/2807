import java.util.Scanner;
public class MultiDimensionalArray {
public static void main(String args[])
{
	int i,j,row,col,search,flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the array dimensions");
	row=sc.nextInt();
	col=sc.nextInt();
	System.out.println("Enter the array elements");
	int[][] mulDim=new int[row][col];
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
			mulDim[i][j]=sc.nextInt();
	}
	System.out.println("Enter the element to be searched");
	search=sc.nextInt();
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
			if(mulDim[i][j]==search)
			{
				System.out.println("Element present in the multi-dimesional array");
				flag=1;
				break;
			}
	}
	if(flag==0)
		System.out.println("Element not found in the multi-dimesional array");	
}
}
