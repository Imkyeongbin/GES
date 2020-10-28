package abstractex;

public class BenzE300 extends Car001{
	
	BenzE300(String name) {
		super(name);
	}

	
	@Override
	public void run(int speed) {
		System.out.println(speed+"의 속도로 달린다.");
	}

	@Override
	public void go(String place) {
		System.out.println(place+"에 간다.");
	}

	public void rest() {
		if(phone == true) {
			System.out.println("무선 충전을 하면서 휴식을");
		}else {
			System.out.println("블루투스로 음악을 들으며 쉴 수 있다");
		}
	}

	@Override
	public void boast(String people) {
		System.out.println("원격 시동을 걸어 "+people+"에게 자랑한다.");
	}

	@Override
	public int sell() {
		return 6350;
	}

}
