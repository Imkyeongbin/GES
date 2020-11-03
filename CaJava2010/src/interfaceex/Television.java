package interfaceex;

public class Television implements RemoteCon{
	private int volume; //필드
	//추상 메소드에 대한 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume > RemoteCon.MAX_VOLUME) {
			this.volume = RemoteCon.MAX_VOLUME;
		}else if(volume < RemoteCon.MIN_VOLUME) {
			this.volume = RemoteCon.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨:"+volume);
	}
}
