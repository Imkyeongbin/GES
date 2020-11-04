package exception;

public class RuntimeExTest {
	public void sayNick(String nick) {
		if("fool".equals(nick)) {
//			throw new Foolexception();
		}
		System.out.println("당신의 별명은 "+nick+" 입니다.");
	}
	public static void main(String[] args) {
		RuntimeExTest test = new RuntimeExTest();
		test.sayNick("fool");
		test.sayNick("genious");
	}
}
