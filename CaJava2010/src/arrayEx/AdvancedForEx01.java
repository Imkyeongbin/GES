package arrayEx;

public class AdvancedForEx01 {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int total = 0;
		for(int i : scores) {
			total += i;
		}
		System.out.println("점수 총합 = "+ total);
		System.out.printf("점수 평균 = %.2f", (double)total/scores.length);
	}

}
