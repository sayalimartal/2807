//Create Vehicle interface
interface Vehicle {
	void start();
}
//class TwoWheeler implements Vehicle interface
class TwoWheeler implements Vehicle {
	public void start() {
		System.out.println("Start two wheeler"); 	//Implementing start method
	}
}
//class ThreeWheeler implements Vehicle interface
class ThreeWheeler implements Vehicle {
	public void start() {
		System.out.println("Start three wheeler");  //Implementing start method
	}
}
//class FourWheeler implements Vehicle interface
class FourWheeler implements Vehicle {
	public void start() {
		System.out.println("Start four wheeler");  //Implementing start method	
	}	
}
public class VDemo {

	public static void main(String[] args) {
		Vehicle[] vehicle=new Vehicle[3];  //create an array of Vehicle interface
		
		vehicle[0]=new TwoWheeler();  //Create object of class TwoWheeler using upcasting
		vehicle[1]=new ThreeWheeler();//Create object of class ThreeWheeler using upcasting
		vehicle[2]=new FourWheeler(); //Create object of class FourWheeler using upcasting
		
		for(int i=0;i<3;i++)
		{
			if(vehicle[i].getClass().getName().equals("ThreeWheeler")) //Compare class name of object with "ThreeWheeler"
				vehicle[i].start();  //If true, call start() method of class ThreeWheeler
		}
	}
}
