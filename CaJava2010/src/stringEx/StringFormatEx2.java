package stringEx;

public class StringFormatEx2 {

	public static void main(String[] args) {
		int kor = 81; //국어 점수
		int eng = 75; //영어 점수
		int mat = 91; //수학 점수
		
		System.out.println("println을 사용");
		System.out.println("국어 : " + kor+"점");
		System.out.println("영어 : " + eng+"점");
		System.out.println("수학 : " + mat+"점");
		System.out.println("총점 : " + (kor + eng + mat) + "점");
		System.out.println();
		System.out.printf("Printf를 사용\n");
		System.out.printf("국어 : %d점\n", kor);
		System.out.printf("영어 : %d점\n", eng);
		System.out.printf("수학 : %d점\n", mat);
		System.out.printf("총점 : %d점\n", kor+eng+mat);
		System.out.printf("평균 : %.2f점", (kor + eng + mat)/3.00);
		
	}

}
