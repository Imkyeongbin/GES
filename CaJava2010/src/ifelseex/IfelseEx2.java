package ifelseex;

import java.util.Scanner;

public class IfelseEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("0 ~ 100 사이의 정수를 입력하세요.");
		System.out.print("> ");
		a = sc.nextInt();
		if(a>-1&&a<101&&(a%2==0)&&(a%3==0)) {
			System.out.println("공배수");
		}else {
			System.out.println("아니다");
		}
	}

}
