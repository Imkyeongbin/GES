package methodex;

public class TestMethodObj_2 {
	int a;
	public void vartest(TestMethodObj_2 test) {
		test.a++;
	}
	public static void main(String[] args) {
		TestMethodObj_2 myTest = new TestMethodObj_2();
		myTest.a = 1;
		myTest.vartest(myTest);
		System.out.println(myTest.a);
	}

}
