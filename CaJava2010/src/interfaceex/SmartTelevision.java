package interfaceex;

public class SmartTelevision implements Searchable, RemoteControl, Wifi, Netflix, Youtube{
	private int volume;
	@Override
	public void search(String url) {
		System.out.println(url+"을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: "+volume);
		
	}

	@Override
	public void youtubeOn() {
		System.out.println("유튜브를 켭니다.");
	}

	@Override
	public void youtubeOff() {
		System.out.println("유튜브를 끕니다.");
		
	}

	@Override
	public void netflixOn() {
		System.out.println("넷플릭스를 켭니다.");
	}

	@Override
	public void changeVOD(String VOD) {
		System.out.println(VOD+"를 시청합니다.");
	}

	@Override
	public void netflixOff() {
		System.out.println("넷플릭스를 끕니다.");
	}

	@Override
	public void wifiOn() {
		System.out.println("와이파이를 켭니다.");
	}

	@Override
	public void wifiOff() {
		System.out.println("와이파이를 끕니다.");
	}

	@Override
	public void changeCh(int ch) {
		System.out.println("와이파이 채널을 "+ch+"로 바꿉니다.");
		
	}

	
}
