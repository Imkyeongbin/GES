package exam084;

public class Audio implements RemoteControl {
	// 
	private int volume;
	
	//turnOn()
	public void turnOn() {
		System.out.println("Audio On.");
	}	
	//turnOff() 
	public void turnOff() {
		System.out.println("Audio Off.");
	}
	//setVolume() 추상 ->실제 Method
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println(" Audio Volume: " + volume);
	}
}
