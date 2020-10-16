package programEX;

public class PopIOEx2 {

	public static void main(String[] args) {
		 int 영어 = 100;
		 int 국어 = 90;
		 int 수학 = 80;
		 int 총점 = 영어 + 국어 + 수학;
		 double 평균 = 총점 / 3.0;
		 System.out.println("성적 출력");
		 System.out.println("────────────────────────");
		 System.out.println("\t영어 : "+ 영어);
		 System.out.println("\t국어 : "+ 국어);
		 System.out.println("\t수학 : "+ 수학);
		 System.out.println("\t총점 : "+ 총점);
		 System.out.printf("\t평 균 : %.2f",평균);
		 System.out.println("────────────────────────");

	}

}
