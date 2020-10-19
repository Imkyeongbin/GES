package whileEx;

public class WhileEx2 {

	public static void main(String[] args) {
		int i=0;
		int evenSum= 0, oddSum =0, totalSum=0;
		while(i<=100) {
			
			if(i%2==0) {
				evenSum+=i;
			}
			if(i%2==1) {
				oddSum+=i;
			}
			totalSum += i;
			i++;
		}
		System.out.println("짝수합 : "+evenSum);
		System.out.println("홀수합 : " + oddSum);
		System.out.println("전체합 : " + totalSum);
	}

}
