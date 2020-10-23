package methodex;

public class TestMethodVar21 {
	public int vartest(int a) {
		a = a + 2;
		return a;
	}
	public static void main(String[] args) {
		int a = 1;
		TestMethodVar21 myTest = new TestMethodVar21();
		a= myTest.vartest(a);
		System.out.println(a);
	}

}
