package exam084;

public class Television implements RemoteControl {
	// 
	private int volume;
	//turnOn() 
	public void turnOn() {
		System.out.println("TV 켬.");
	}	
	//turnOff() 
	public void turnOff() {
		System.out.println("TV 끔.");
	}
	//setVolume()  
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("TV volume: " + volume);
	}
}
