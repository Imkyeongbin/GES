package methodex;

public class TestMethod3 {
	public void hap(int a, int b) {
		System.out.println(a+"와 "+b+"의 합은 "+(a+b)+"입니다.");
	}
	public static void main(String[] args) {
		TestMethod3 myTest = new TestMethod3();
		int a= 3, b= 5;
		myTest.hap(3, 5);
	}

}
