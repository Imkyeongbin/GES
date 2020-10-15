package ioex;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장을 입력해주세요");
		System.out.print("> ");
		System.out.println(sc.nextLine());
		System.out.println();
		
		System.out.println("문자열을 입력해주세요");
		System.out.print("> ");
		System.out.println(sc.next());
		System.out.println();
		
		System.out.println("정수를 입력해주세요");
		System.out.print("> ");
		System.out.println(sc.nextInt());
		System.out.println();
		
		System.out.println("실수를 입력해주세요");
		System.out.print("> ");
		System.out.println(sc.nextDouble());
		System.out.println();
	}

}
