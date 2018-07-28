import java.util.*;
public class CountryTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of countries");
		int num=sc.nextInt();
		
		Country[] country=new Country[num];
		
		for(int i=0;i<num;i++)
		{
			country[i]=new Country();
			
			System.out.println("Enter the country name");
			String name=sc.next();
			country[i].setCountryName(name);
			
			System.out.println("Enter the country area");
			country[i].setArea(sc.nextDouble());
			
			System.out.println("Enter the country population");
			country[i].setPopulation(sc.nextDouble());
		}

		System.out.print("The country with the largest area is ");
		System.out.println(country[0].findLargestArea(num,country));
		
		System.out.print("The country with the largest population is ");
		System.out.println(country[0].findLargestPopulation(num,country));
		
		System.out.print("The country with the largest population density is ");
		System.out.println(country[0].findLargestPopDen(num,country));
	}
}
