package methodex;

class MethodEx3 {
	public void hap(int a, int b) {
		int result = a + b;
		System.out.println("합 : " + result);
	}
	public void cha(int a, int b) {
		int result = a - b;
		System.out.println("차 : " + result);
	}
	public void gop(int a, int b) {
		int result = a * b;
		System.out.println("곱 : " + result);
	}
	public void mok(int a, int b) {
		double result = (double)a / b;
		System.out.println("몫 : " + result);
	}
	public void nameoji(int a, int b) {
		int result = a % b;
		System.out.println("나머지 : "+ result);
	}
	public void jegop(int a, int b) {
		int result= 1;
		for(int i=0 ; i<b; i++) result *= a; 	
		System.out.println(a+"의 "+b+"제곱 : " + result);
	}
	public static void main(String[] args) {
		MethodEx3 me = new MethodEx3();
		int a=5, b=2;
		me.hap(a, b);
		me.cha(a, b);
		me.gop(a, b);
		me.mok(a, b);
		me.nameoji(a, b);
		me.jegop(a, b);
	}

}
