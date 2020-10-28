package inheritance;

public class CellPhone {
	String model;
	String color;
	String channel;
	
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	boolean kakao = false;
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void kakaotalk() {
		if(!kakao) {
			System.out.println("카톡 카톡 ~");
		}else {
			System.out.println("카톡 종료");
		}
		kakao=!kakao;
	}
	public void kakaotalkTalk() {
		System.out.println("나: 왓츠업");
		System.out.println("친구: 하이! 뭐하니!");
		System.out.println("나: 코딩하지!!!");
	}
}
