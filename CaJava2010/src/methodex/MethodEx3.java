package methodex;

class MethodEx3 {
	public void hap(int a, int b) {
		System.out.println("합 : "+ (a+b));
	}
	public void cha(int a, int b) {
		System.out.println("차 : " + (a-b));
	}
	public void gop(int a, int b) {
		System.out.println("곱 : " + a*b);
	}
	public void mok(int a, int b) {
		System.out.printf("몫 : " + (double)a/b);
	}
	public static void main(String[] args) {
		MethodEx3 me = new MethodEx3();
		int a=5, b=2;
		me.hap(a, b);
		me.cha(a, b);
		me.gop(a, b);
		me.mok(a, b);
	}

}
