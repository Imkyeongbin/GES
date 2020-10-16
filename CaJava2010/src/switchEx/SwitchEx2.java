package switchEx;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~100사이의 점수를 입력해 주세요.");
		System.out.print("> ");
		int score = sc.nextInt();
		if(score<=100&& score>=0) {
			switch(score/10) {
			case 10 :
			case 9 : System.out.println("A학점");break;
			case 8 : System.out.println("B학점");break;
			case 7 : System.out.println("C학점");break;
			case 6 : System.out.println("D학점");break;
			default : System.out.println("F학점");
			}
		}else {
			System.out.println("잘못된 점수입니다.");
		}
		
	}

}
