package exception;

public class ThrowsTest {
	public void sayNick(String nick) throws FoolException1{
		
		if("fool".equals(nick)) {
			throw new FoolException1();
		}
		System.out.println("당신의 별명은 "+nick+" 입니다.");
	}
	public static void main(String[] args) {
		ThrowsTest throwstest = new ThrowsTest();
		
		try {
			throwstest.sayNick("fool");
			throwstest.sayNick("genious");
		}catch(FoolException1 e) {
			System.err.println("FoolException 발생");
		}
	}

}
