package interfaceex;

public interface RemoteCon {
	//상수 필드
	//인터페이스는 데이터를 저장할 인스턴스, 정적 필드를 선언할 수 없음
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	//추상 메소드 : 메소드 선언부만 작성
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//디폴트 메소드 : 실질적으로 구현 객체가 가지고 있는 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	//정적 메소드 : 객체없이 호출 가능
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
}
