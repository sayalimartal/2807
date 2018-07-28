
class Vehicle {
	public void start() {
		System.out.println("Starting the vehicle");
	}
}

class FourWheeler extends Vehicle{
	public void start() {
		System.out.println("Starting the four wheeler");
	}
}

public class VehicleOverride {
	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		vehicle.start();
		
		FourWheeler fourwheeler=new FourWheeler();
		fourwheeler.start();
	}
}

