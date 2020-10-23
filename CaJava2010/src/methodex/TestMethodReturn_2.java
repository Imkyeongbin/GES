package methodex;

public class TestMethodReturn_2 {
	public void say_nick(String a) {
		if("fool".equals(a)) {
			return;
		}
		System.out.println("나의 별명은 "+a+"입니다");
	}
	public static void main(String[] args) {
		TestMethodReturn_2 myTest = new TestMethodReturn_2();
		myTest.say_nick("fool");
//		myTest.say_nick("nick");
	}

}
