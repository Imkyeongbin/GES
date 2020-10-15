package ioex;

import java.util.Scanner;

public class ScannerEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		System.out.println("──────────");
		System.out.print("이름> ");
		String name = sc.next();
		System.out.println("\n");
		System.out.println("점수 입력");
		System.out.println("──────────");
		System.out.print("점수> ");
		double point = sc.nextInt();
		System.out.println("\n");
		sc.close();
		System.out.println("결과 출력");
		System.out.println("──────────");
		System.out.println("이름: "+ name);
		System.out.printf("점수: %.2f", point);
	}	

}
