package methodex;

public class TestMethodVar11 {
	public void vartest(int a) {
		a = a + 2;
	}
	public static void main(String[] args) {
		int a = 1;
		TestMethodVar11 myTest = new TestMethodVar11();
		myTest.vartest(a);
		System.out.println(a);
	}

}
