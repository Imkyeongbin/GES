package methodex;

public class TestMethodReturn {
	public void say_nick(String a) {
		if("fool".equals(a)) {
			return;
		}
		System.out.println("나의 별명은 "+a+" 입니다");
	}
	public static void main(String[] args) {
		TestMethodReturn myTest = new TestMethodReturn();
//		myTest.say_nick("fool");
		myTest.say_nick("nick");
	}

}
