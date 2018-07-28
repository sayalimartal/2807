//Display distances in feets and inches and sum of two distance values
public class DistanceTest {

	public static void main(String[] args) {
		Distance D1=new Distance();
		Distance D2=new Distance();
		Distance D3=new Distance();
		
		D1.set(12, 12);
		System.out.println("First distance is "+D1.getFeet()+" feet and "+D1.getInches()+" inches");
		
		D2.set(25, 11);
		System.out.println("Second distance is "+D2.getFeet()+" feet and "+D2.getInches()+" inches");
		
		D3=D1.add(D1,D2);
		System.out.println("Sum of distances is "+D3.getFeet()+" feet and "+D3.getInches()+" inches");

	}

}
