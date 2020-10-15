package operatorEx;

public class OperatorEx1 {
	public static void main(String[] args) {
		int i1 = +100;
		int i2 = -100;
		double d1 = +3.14;
		double d2 = -10.5;
		System.out.println(i2);
		System.out.println(d1);
		
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println(result1);
		System.out.println(result2);
		short s = 100;
//		short result3 = -s; // short 타입을 부호 연산하면 int로 변경
		int result3 = -s;
		System.out.println(result3);
				
	}
}
