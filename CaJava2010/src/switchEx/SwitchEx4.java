package switchEx;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num1 = sc.nextInt();
		System.out.print("정수: ");
		int num2 = sc.nextInt();
		System.out.print("연산자(+ - * / %): ");
		char operator = sc.next().charAt(0);
		System.out.print("결과값: ");
		switch(operator) {
		case '+' : System.out.println(num1+num2);break;
		case '-' : System.out.println(num1-num2);break;
		case '*' : System.out.println(num1*num2);break;
		case '/' : {
			if(num2 != 0) {
				System.out.printf("%.2f", (double)num1/num2);
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		}
		case '%' : {
			if(num2 != 0) {
				System.out.println(num1%num2);break;
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;
		}
		default : System.out.println("잘못입력");
			
		}
	}

}
