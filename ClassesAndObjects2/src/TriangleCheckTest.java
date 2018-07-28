import java.util.Scanner;

public class TriangleCheckTest {

	public static void main(String[] args) {
		
		int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of triangles");
		int num=sc.nextInt();
		
		int[][] side1=new int[num][3];
		Triangle[] triangle=new Triangle[num];
		
		for(i=0;i<num;i++)
		{
			triangle[i]=new Triangle();
			
			System.out.println("Enter the sides of triangle "+(i+1));
			for(int j=0;j<3;j++)
				side1[i][j]=sc.nextInt();
			triangle[i].setSide(side1[i]);
		}
		
		for(i=0;i<num;i++)
		{
			System.out.print(triangle[i].toString());
			if(triangle[i].isEquilateral(triangle[i])==true)
				System.out.println(" is an equilateral triangle");
			else
			{
				if(triangle[i].isRight(triangle[i])==true)
					System.out.println(" is a right angled triangle");
				else
				{
					if(triangle[i].isIsosceles(triangle[i])==true)
						System.out.println(" is an isosceles triangle");
					else
					{
						if(triangle[i].isScalene(triangle[i])==true)
							System.out.println(" is a scalene triangle");
					}
				}
			}
		}			
	}
}
