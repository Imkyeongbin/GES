package methodex;

public class MethodEx01_2 {
	public void hap(int a, int b) {
		int sum = 0;
		for(int i=1; i<21; i++) {
			sum += i;
		}
		System.out.println("합 : " + sum);
	}
	public void gop(int a, int b) {
		long sum = 1;
		for(int i=1; i<21; i++) {
			sum *= i;
		}
		System.out.println("곱 : " + sum);
	}
	
	public static void main(String[] args) {
		MethodEx01_2 me = new MethodEx01_2();
		me.hap(1, 20);
		me.gop(1, 20);
	}

}
