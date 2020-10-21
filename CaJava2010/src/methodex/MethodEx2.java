package methodex;

public class MethodEx2 {
	void totalSum() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("합 :"+sum);
	}
	void totalMul() {
		int mul = 1;
		for(int i=1; i<=10; i++) {
			mul*=i;
		}
		System.out.println("곱 :" + mul);
	}
	public static void main(String[] args) {
		MethodEx2 me = new MethodEx2();
		me.totalSum();
		me.totalMul();
	}
}
