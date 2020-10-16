package ioex;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주소> ");
		String address = sc.nextLine();
		System.out.println("─────────────────────────────");
		System.out.println("상품명 입력");
		System.out.print("상품> ");
		String goods = sc.nextLine();
		System.out.println();
		System.out.println("상품가격");
		System.out.print("가격> ");
		double price = sc.nextDouble();
		System.out.println();
		System.out.println("수량");
		System.out.print("갯수> ");
		int ea = sc.nextInt();
		System.out.println();
		System.out.println("지불한 돈");
		System.out.print("현금> ");
		double pay = sc.nextDouble();
		System.out.println("─────────────────────────────");
		if(pay>price*ea) {
			System.out.println("주소 :\t" + address);
			System.out.println("상품명 :\t" + goods);
			System.out.printf("상품가격 :\t%.2f\n", price);
			System.out.println("수량:\t" + ea);
			System.out.println("─────────────────────────────");
			System.out.printf("총 가격 :\t%.2f\n", ea*price);
			System.out.printf("지불한 돈 :\t%.2f\n", pay);
			System.out.printf("잔액 :\t%.2f\n" , (pay - ea*price));
		}else {
			System.out.println("돈이 부족합니다.");
		}
		System.out.println("─────────────────────────────");
	}

}
