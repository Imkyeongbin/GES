package elseifEx;

import java.util.Scanner;

public class ElseifEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해 주세요(0 ~ 100점):");
		System.out.print("> ");
		int score = sc.nextInt();
		if(score>100 || score<0) System.out.println("잘못 입력하셨습니다.");
		if(score>=90 && score>100) System.out.println("A학점");
		if(score>=80 && score<90) System.out.println("B학점");
		if(score>=70 && score<80) System.out.println("C학점");
		if(score>=60 && score<70) System.out.println("D학점");
		if(score<60 && score>=0) System.out.println("F학점");
		
	}

}
