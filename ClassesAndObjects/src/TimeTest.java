//Display time in hours and minutes and sum of two time values
public class TimeTest {

	public static void main(String[] args) {
		
		Time T1=new Time();
		Time T2=new Time();
		Time T3=new Time();
		
		T1.setTime(24, 00);
		System.out.println("First time is "+T1.getHours()+" hours and "+T1.getMinutes()+" minutes");
		
		T2.setTime(24, 00);
		System.out.println("Second time is "+T2.getHours()+" hours and "+T2.getMinutes()+" minutes");
		//Display sum of two time values
		T3=T1.sum(T1,T2);
		
		if(T3.getHours()>=24)
			System.out.println("Sum of times is "+(T3.getHours()/24)+" days "+(T3.getHours()%24)+" hours and "+T3.getMinutes()+" minutes");
		else
			System.out.println("Sum of times is "+T3.getHours()+" hours and "+T3.getMinutes()+" minutes");
	}
}
