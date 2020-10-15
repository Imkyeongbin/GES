//avg를 float로 선언
package conversionEx;

public class ConvEx3 {

	public static void main(String[] args) {
		int pop1, pop2, pop3;
		int total;
		float avg;
		pop1 = 1000;
		pop2 = 2000;
		pop3 = 1501;
		
		total = pop1 + pop2 + pop3;
		avg = (float)(total/3.0);
		
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %1.2f", avg);
	}

}
