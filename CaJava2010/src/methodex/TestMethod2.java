package methodex;

public class TestMethod2 {
	public String say() {
		return "Hi!";
	}
	public static void main(String[] args) {
		TestMethod2 myTest = new TestMethod2();
		String a = myTest.say();
		System.out.println(a);
	}

}
