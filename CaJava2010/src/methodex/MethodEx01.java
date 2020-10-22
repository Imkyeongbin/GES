package methodex;

public class MethodEx01 {
	void hap(int a, int b){
		int sum = 0;
		for(int i=a; i<b+1; i++) {
			sum +=i;
		}
		System.out.println("합 :"+ sum);
	}
	void gop(int a, int b) {
		long mul = 1;
		for(int i=a; i<b+1 ; i++) {
			mul *=i;
		}
		System.out.println("곱 :" + mul);
	}
		
	
	public static void main(String[] args) {
		MethodEx01 me = new MethodEx01();
		me.hap(1, 20);
		me.gop(1, 20);
	}

}
