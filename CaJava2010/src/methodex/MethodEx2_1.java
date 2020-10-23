package methodex;

public class MethodEx2_1 {
		public void hap() {
			int sum = 0;
			for(int i=1; i<11 ; i++) {
				sum += i;
			}
			System.out.println("합 :" + sum);
		}
		public void gop() {
			int sum = 1;
			for(int i=1; i<11 ; i++) {
				sum *= i;
			}
			System.out.println("곱 :" + sum);
		}
		public void jegophap() {	// 1^1 + 2^2+ 3^3+...+10^10
			long sum = 0;
			
			for(int i=1; i<11; i++) {
				long gopSum = 1;
				for(int j=1; j<=i; j++) {
					gopSum *= i;
				}
				sum += gopSum;
			}
			System.out.println("제곱 합: "+ sum);
		}
	public static void main(String[] args) {
		MethodEx2_1 me = new MethodEx2_1();
		me.hap();
		me.gop();
		me.jegophap();
		long result = 1L+ 2L*2 + 3L*3*3 + 4L*4*4*4 + 5L*5*5*5*5 + 6L*6*6*6*6*6 + 7L*7*7*7*7*7*7 + 8L*8*8*8*8*8*8*8
				+9L*9*9*9*9*9*9*9*9 + 10L*10*10*10*10*10*10*10*10*10;
		System.out.println(result);
	}
}
