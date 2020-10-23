package methodex;

public class TestMethodVar22 {
	int a;
	public void vartest(TestMethodVar22 test) {
		a = a + 2;
	}
	public static void main(String[] args) {
		TestMethodVar22 myTest = new TestMethodVar22();
		myTest.a = 1;
		myTest.vartest(myTest);
		System.out.println(myTest.a);
	}

}
