
public class Television {

	private boolean state;
	private int volume;
	private int channel=100;
	
	public String isState() {
		if(state==true)
			return "ON";
		else
			return "OFF";
	}
	public void setState(boolean state) {
		this.state = state;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void increaseVolume() {
		volume++;
	}
	public void decreaseVolume() {
		volume--;
	}
	
	public int getChannel() {
		return channel;
	}
	public void changeChannel(int channel) {
		this.channel = channel;
	}
		
}
