//Calculate training charges based on training types
abstract class Training {
	
	int id;
	String subject;
	double fees;
	abstract double getOrderValue(); //Implement function according to training type
	
}
//For public training, charges based on number of participants
class PublicTraining extends Training {
	int participants;
	PublicTraining(String subject,double fees,int participants) { //Parameterized constructor to initialize instance members
		this.subject=subject;
		this.fees=fees;
		this.participants=participants;
	}
	public double getOrderValue()  //Overriding getOrderValue of Training class to calculate charges
	{
		return (fees*participants);
	}
}
//For corporate training, charges based on number of days
class CorporateTraining extends Training {
	int days;
	CorporateTraining(String subject,double fees,int days) {  //Parameterized constructor to initialize instance members
		this.subject=subject;
		this.fees=fees;
		this.days=days;
	}
	public double getOrderValue()   //Overriding getOrderValue of Training class to calculate charges
	{
		return (fees*days);
	}
}

public class TrainingTest {

	public static void main(String[] args) {
		
		//Create object of PublicTraining using upcasting
		Training publictraining =new PublicTraining("Java",5000,50); 
		System.out.println("Cost of public training is "+publictraining.getOrderValue()); //Display training charges
		
		//Create object of CorporateTraining using upcasting
		Training corporatetraining =new CorporateTraining("Big Data",35000,4); 
		System.out.println("Cost of corporate training is "+corporatetraining.getOrderValue()); //Display training charges
		
	}
}
