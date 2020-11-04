package exception;

public class FinallyTest {
	public void shouldBeRun() {
		System.out.println("ok thanks.");
	}
	public static void main(String[] args) {
		FinallyTest test = new FinallyTest();
		int c;
		try {
			c= 4 / 0;
		}catch(ArithmeticException e) {
			c = -1;
		}finally {
			test.shouldBeRun();
		}
	}

}
