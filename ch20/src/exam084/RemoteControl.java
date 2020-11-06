package exam084;

public interface RemoteControl {
	// 상수 
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		} else {
			System.out.println("무음해제.");
		}
	}
	default void setMute2(boolean mute) {
		if(mute) {
			System.out.println("무음처리.2");
		} else {
			System.out.println("무음해제.2");
		}
	}
	
	//static
	static void changeBattery() {
		System.out.println("건전지 교환.");
	}
}
