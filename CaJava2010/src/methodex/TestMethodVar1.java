package methodex;

public class TestMethodVar1 {
	public void vartest(int a) {
		a++;
		//메소드 내에서 사용되는 변수는 메소드 안에서만 쓰여짐(로컬 변수)
	}	
	public static void main(String[] args) {
		int a = 1;
		TestMethodVar1 myTest = new TestMethodVar1();
		myTest.vartest(a);
		
		System.out.println(a);
	}

}
