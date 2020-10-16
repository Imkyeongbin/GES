package ioex;

import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명 입력");
		System.out.println("───────────");
		System.out.print("상품명> ");
		String goods = sc.next();
		System.out.println();
		System.out.println("판매수량 입력");
		System.out.println("───────────");
		System.out.print("수량> ");
		int num = sc.nextInt();
		System.out.println();
		System.out.println("상품가격");
		System.out.println("───────────");
		System.out.print("가격> ");
		double price = sc.nextDouble();
		System.out.println();
		
		System.out.println("상품내역 출력");
		System.out.println("──────────────");
		System.out.println("상품명: " + goods);
		System.out.println("판매수량: "+ num);
		System.out.println("상품가격: "+ price);
		
	}

}
