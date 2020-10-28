package inheritance;

public class BenzE300 extends Car001{
	public void multibeamHeadLight() {
		System.out.println("멀티빔 기능");
	}
	public void lcdController() {
		System.out.println("벤츠 LCD 계기판의 경우 디자인부분에 있어서는 센터에 위치한 다이얼로 조작을 해줘야했습니다.");
	}
	public void aroundView() {
		System.out.println("요즘 국산차량들에도 옵션을 넣으면 보이기 시작하는 어라운드뷰가 달려있습니다.");
	}
}
