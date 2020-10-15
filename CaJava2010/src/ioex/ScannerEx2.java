package ioex;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력하세요!");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println();
		System.out.println("결과 출력");
		System.out.println("───────────");
		System.out.println(num1);
		System.out.println(num2);
	}

}
