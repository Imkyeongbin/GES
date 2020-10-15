package arrayEx;

public class ArrayEx01 {

	public static void main(String[] args) {
		int[] goods = {2000, 3000, 5000, 7000, 2500, 8000, 9000, 1000, 3500, 8300};
		int total = 0; double avg;
		System.out.println("──────────────────────────");
		System.out.println("상품가격 Lists");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━");
		for(int i = 0 ; i<goods.length; i++) {
			System.out.printf("\t상품%d : %d\n", i+1, goods[i]);
			total += goods[i];
		}
		avg = (double)total/goods.length;
		System.out.println("\t총합계 : " + total);
		System.out.printf("\t평  균 : %.2f", avg);
		System.out.println();
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━");

	}

}
