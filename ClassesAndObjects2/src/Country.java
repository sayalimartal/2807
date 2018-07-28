
public class Country {
	
	private String countryName;
	private double population;
	private double area;
	
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public double getPopulation() {
		return population;
	}
	public void setPopulation(double population) {
		this.population = population;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public String findLargestArea(int num, Country C[])
	{
		int i,flag=0;
		double maxArea=C[0].getArea();
		for(i=0;i<num;i++)
		{
			if(C[i].getArea()>maxArea)
			{
				maxArea=C[i].getArea();
				flag=i;
			}
		}
		return C[flag].getCountryName();
	}
	
	public String findLargestPopulation(int num, Country C[])
	{
		int i,flag=0;
		double maxPopulation=C[0].getPopulation();
		for(i=0;i<num;i++)
		{
			if(C[i].getPopulation()>maxPopulation)
			{
				maxPopulation=C[i].getPopulation();
				flag=i;
			}
		}
		return C[flag].getCountryName();
	}
	
	public String findLargestPopDen(int num, Country C[])
	{
		int i,flag=0;
		double maxPopDen=(C[0].getPopulation()/C[0].getArea());
		for(i=0;i<num;i++)
		{
			if((C[i].getPopulation()/C[i].getArea())>maxPopDen)
			{
				maxPopDen=(C[i].getPopulation()/C[i].getArea());
				flag=i;
			}
		}
		return C[flag].getCountryName();
	}
		
}
