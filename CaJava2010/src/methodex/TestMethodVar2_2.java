package methodex;

public class TestMethodVar2_2 {
	public int vartest(int a) {
		a++;
		
		return a;
	}
	public static void main(String[] args) {
		int a = 1;
		TestMethodVar2_2 myTest = new TestMethodVar2_2();
		a = myTest.vartest(a);
		
		System.out.println(a);
	}

}
