//Create Game interface
interface Game {
	void play();
}
//class Cricket implements Game interface
class Cricket implements Game {
	public void play() {
		System.out.println("Cricket"); //Implementing play method
	}
}
//class Football implements Game interface
class Football implements Game {
	public void play() {
		System.out.println("Football"); //Implementing play method
	}
}
//class Tennis implements Game interface
class Tennis implements Game {
	public void play() {
		System.out.println("Tennis");  //Implementing play method
	}
}

public class Demo {
	public static void perform(Game game) { //Defining perform method with interface reference as a parameter
		game.play();
	}

	public static void main(String[] args) {
		
		//Create object of class Cricket using upcasting
		Game cricket=new Cricket();
		perform(cricket);
		
		//Create object of class Football using upcasting
		Game football=new Football();
		perform(football);
		
		//Create object of class Tennis using upcasting
		Game tennis=new Tennis();
		perform(tennis);

	}
}
