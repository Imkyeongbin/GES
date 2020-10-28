package abstractex;

public class BMW_X3 extends Car001{
	
	BMW_X3(String name) {
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
			System.out.println("넓직한 뒷 좌석에서 폰을 보며 휴식을");
		}else {
			System.out.println("넓직한 뒷 좌석에서 블루투스로 음악을 들으며 쉴 수 있다");
		}
	}

	@Override
	public void boast(String people) {
		System.out.println("넉넉한 공간을 보여주며 "+people+"에게 자랑한다.");
	}

	@Override
	public int sell() {
		return 6870;
	}

}
