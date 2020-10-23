package methodex;

public class TestMethodVar1_2 {
	public void vartest(int a) {
		a++;
	}
	public static void main(String[] args) {
		int a = 1;
		TestMethodVar1_2 myTest = new TestMethodVar1_2();
		myTest.vartest(a);
		
		System.out.println(a);
	}

}
