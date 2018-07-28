
public class TelevisionTest {

	public static void main(String[] args) {
		Television tv=new Television();
		
		tv.setState(true);
		System.out.println("Television is turned "+tv.isState());
		
		tv.setVolume(15);
		System.out.println("Television volume is "+tv.getVolume());
		
		tv.increaseVolume();
		System.out.println("Television volume is "+tv.getVolume());
		
		tv.decreaseVolume();
		System.out.println("Television volume is "+tv.getVolume());
		
		System.out.println("Default television channel is "+tv.getChannel());
		System.out.println("Changing the channel...");
		
		tv.changeChannel(250);
		System.out.println("Television channel is "+tv.getChannel());
		
		tv.setState(false);
		System.out.println("Television is turned "+tv.isState());

	}

}
