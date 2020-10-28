package inheritance;

public class TeslaModel3 extends Car001{
	public void inchTablet(int inch) {
		System.out.println("중앙에 설치된 "+inch+"인치 대형 터치 디스플레이");
	}
	public void internetRadio() {
		System.out.println("인터넷 스트리밍 라디오 지원");
	}
	public void autoPilot() {
		System.out.println("자율주행기능");
	}
}
